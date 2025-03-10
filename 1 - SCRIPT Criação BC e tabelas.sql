-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS CONDOMINIOX;

USE CONDOMINIOX;

-- Criação da tabela Usuario --
CREATE TABLE IF NOT EXISTS Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    tipoUsuario VARCHAR(40) NOT NULL, -- Morador, Sídico e Administrador --
    INDEX (email)  -- Adicionando índice para a coluna email
);

-- Tabela Morador derivada de Usuario --
CREATE TABLE IF NOT EXISTS Morador (
    id INT PRIMARY KEY,
    nomeUsuario VARCHAR(50) NOT NULL,
    unidade VARCHAR(50) NOT NULL,
    bloco CHAR(1) NOT NULL,  -- Bloco A, B, C
    FOREIGN KEY (id) REFERENCES Usuario(id) ON DELETE CASCADE
);

-- Tabela Administrador derivada de Usuario --
CREATE TABLE IF NOT EXISTS Administrador (
    id INT PRIMARY KEY,
    nomeUsuario VARCHAR(50) NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    FOREIGN KEY (id) REFERENCES Usuario(id) ON DELETE CASCADE
);

-- Tabela Sindico derivada de Usuario --
CREATE TABLE IF NOT EXISTS Sindico (
    id INT PRIMARY KEY,
    nomeUsuario VARCHAR(50) NOT NULL,
    data_inicio_mandato DATE NOT NULL,
    data_fim_mandato DATE NOT NULL,
    FOREIGN KEY (id) REFERENCES Usuario(id) ON DELETE CASCADE
);

-- Criação da tabela AreaComum
CREATE TABLE IF NOT EXISTS AreaComum (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeAreaComum VARCHAR(100) NOT NULL,
    descricao TEXT NOT NULL,
    localizacao VARCHAR(100) NOT NULL,  
    bloco CHAR(1) NOT NULL,  -- Bloco A, B, C
    UNIQUE (nomeAreaComum, bloco)  
);

-- Criação da tabela Reserva
CREATE TABLE IF NOT EXISTS Reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    nomeUsuario VARCHAR(50) NOT NULL,
    id_area_comum INT NOT NULL,
    data_reserva DATE NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id) ON DELETE CASCADE,
    FOREIGN KEY (id_area_comum) REFERENCES AreaComum(id) ON DELETE CASCADE,
    UNIQUE (id_usuario, id_area_comum, data_reserva)  
);

-- Criação da tabela Cobranca --
CREATE TABLE IF NOT EXISTS Cobranca (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_morador INT NOT NULL,
    mes_referencia DATE NOT NULL,
    taxa_condominio DECIMAL(10, 2) NOT NULL,
    taxa_agua DECIMAL(10, 2) NOT NULL,
    taxa_gas DECIMAL(10, 2) NOT NULL,
    valor_total DECIMAL(10, 2) AS (taxa_condominio + taxa_agua + taxa_gas) STORED,  -- Valor total da cobrança
    status_pagamento BOOLEAN NOT NULL DEFAULT FALSE, -- FALSE indica que o pagamento não foi realizado
    FOREIGN KEY (id_morador) REFERENCES Morador(id) ON DELETE CASCADE,
    UNIQUE (id_morador, mes_referencia) -- Garante que não haja cobranças duplicadas para o mesmo morador no mesmo mês
);

-- Criação da tabela Financeiro --
CREATE TABLE IF NOT EXISTS Financeiro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,  
    categoria VARCHAR(50) NOT NULL,  
    valor DECIMAL(10, 2) NOT NULL,  
    data_custo DATE NOT NULL,  
    recorrente BOOLEAN NOT NULL DEFAULT FALSE,  
    status_pagamento BOOLEAN NOT NULL DEFAULT FALSE, 
    bloco CHAR(1) NOT NULL,  
    observacoes TEXT  
);


-- Criação da tabela Assembleia 
CREATE TABLE IF NOT EXISTS Assembleia (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_assembleia DATE NOT NULL,  
    ata TEXT NOT NULL, -- Ata da assembleia com registro de decisões
    ids_usuarios TEXT, -- IDs dos usuários participantes, armazenados como uma lista (ex: '1,2,3')
    nomes_usuarios TEXT -- Nomes dos usuários participantes, armazenados como uma lista (ex: 'Carlos Silva, Ana Souza, João Pereira')
);


-- Criação da tabela Relatorio 
CREATE TABLE IF NOT EXISTS Relatorio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mes_referencia DATE NOT NULL,  
    total_custos DECIMAL(10, 2) NOT NULL DEFAULT 0.00,  
    total_rendimentos DECIMAL(10, 2) NOT NULL DEFAULT 0.00,  
    saldo DECIMAL(10, 2) AS (total_rendimentos - total_custos) STORED,  
    UNIQUE (mes_referencia)  
);

-- Criação da tabela Solicitacao 
CREATE TABLE IF NOT EXISTS Solicitacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_morador INT NOT NULL,  
    tipo_solicitacao VARCHAR(20) NOT NULL,  
    descricao TEXT NOT NULL,  
    atendido BOOLEAN NOT NULL DEFAULT FALSE,  
    data_solicitacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
    FOREIGN KEY (id_morador) REFERENCES Morador(id) ON DELETE CASCADE,  
	INDEX (tipo_solicitacao)  
);