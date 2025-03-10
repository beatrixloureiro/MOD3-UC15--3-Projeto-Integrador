-- POVOAMENTO

-- 1. Inserção na tabela Usuario
INSERT INTO Usuario (nomeUsuario, email, senha, tipoUsuario) VALUES
    ('administrador', 'adm@mail.com', 'admin123', 'Administrador'),
    ('sindico', 'sindico@mail.com', 'sindico123', 'Síndico'),
    ('morador', 'morador@mail.com', 'morador123', 'Morador'),
    ('Carlos Silva', 'carlos.silva@example.com', 'senha123', 'Morador'),
    ('Ana Souza', 'ana.souza@example.com', 'senha456', 'Morador'),
    ('João Pereira', 'joao.pereira@example.com', 'senha789', 'Morador'),
    ('Mariana Costa', 'mariana.costa@example.com', 'senha101', 'Morador'),
    ('Rafael Oliveira', 'rafael.oliveira@example.com', 'senha202', 'Morador'),
    ('Camila Santos', 'camila.santos@example.com', 'senha303', 'Morador'),
    ('Bruno Lima', 'bruno.lima@example.com', 'senha404', 'Morador'),
    ('Juliana Mendes', 'juliana.mendes@example.com', 'senha505', 'Morador'),
    ('Eduardo Almeida', 'eduardo.almeida@example.com', 'senha606', 'Morador'),
    ('Patrícia Gomes', 'patricia.gomes@example.com', 'senha707', 'Morador');

-- NOTA:
-- Os triggers after_insert_usuario_morador, after_insert_usuario_administrador e after_insert_usuario_sindico
-- irão inserir automaticamente os registros correspondentes nas tabelas derivadas.
-- Para atualizar os dados específicos dos moradores (como unidade e bloco), execute os comandos UPDATE abaixo:

UPDATE Morador 
SET unidade = 'Unidade 102', bloco = 'A' 
WHERE nomeUsuario = 'Carlos Silva';

UPDATE Morador 
SET unidade = 'Unidade 103', bloco = 'B' 
WHERE nomeUsuario = 'Ana Souza';

UPDATE Morador 
SET unidade = 'Unidade 104', bloco = 'C' 
WHERE nomeUsuario = 'João Pereira';

UPDATE Morador 
SET unidade = 'Unidade 105', bloco = 'A' 
WHERE nomeUsuario = 'Mariana Costa';

UPDATE Morador 
SET unidade = 'Unidade 106', bloco = 'A' 
WHERE nomeUsuario = 'Rafael Oliveira';

UPDATE Morador 
SET unidade = 'Unidade 107', bloco = 'A' 
WHERE nomeUsuario = 'Camila Santos';

UPDATE Morador 
SET unidade = 'Unidade 108', bloco = 'B' 
WHERE nomeUsuario = 'Bruno Lima';

UPDATE Morador 
SET unidade = 'Unidade 109', bloco = 'C' 
WHERE nomeUsuario = 'Juliana Mendes';

UPDATE Morador 
SET unidade = 'Unidade 110', bloco = 'A' 
WHERE nomeUsuario = 'Eduardo Almeida';

UPDATE Morador 
SET unidade = 'Unidade 111', bloco = 'C' 
WHERE nomeUsuario = 'Patrícia Gomes';

-- 2. Inserção na tabela AreaComum
INSERT INTO AreaComum (nomeAreaComum, descricao, localizacao, bloco) VALUES
    ('Salão de Festas', 'Espaço reservado para eventos sociais como festas de aniversário, reuniões e eventos comunitários.', 'Térreo', 'A'),
    ('Academia', 'Equipamentos de exercício físico para uso dos residentes. Inclui pesos livres, máquinas de cardio e espaço para aulas.', 'Térreo', 'A'),
    ('Área de Lazer Infantil', 'Espaço destinado para crianças, com brinquedos, escorregadores e outros equipamentos de recreação.', 'Jardim', 'A'),
    ('Piscina', 'Área com piscina para lazer e relaxamento dos moradores, com uma área de solário.', 'Térreo', 'A'),
    ('Churrasqueira', 'Espaço equipado para churrascos e refeições ao ar livre, com mesas e cadeiras.', 'Área externa', 'A'),

    ('Salão de Festas', 'Espaço reservado para eventos sociais como festas de aniversário, reuniões e eventos comunitários.', 'Térreo', 'B'),
    ('Academia', 'Equipamentos de exercício físico para uso dos residentes. Inclui pesos livres, máquinas de cardio e espaço para aulas.', 'Térreo', 'B'),
    ('Área de Lazer Infantil', 'Espaço destinado para crianças, com brinquedos, escorregadores e outros equipamentos de recreação.', 'Jardim', 'B'),
    ('Piscina', 'Área com piscina para lazer e relaxamento dos moradores, com uma área de solário.', 'Térreo', 'B'),
    ('Churrasqueira', 'Espaço equipado para churrascos e refeições ao ar livre, com mesas e cadeiras.', 'Área externa', 'B'),

    ('Salão de Festas', 'Espaço reservado para eventos sociais como festas de aniversário, reuniões e eventos comunitários.', 'Térreo', 'C'),
    ('Academia', 'Equipamentos de exercício físico para uso dos residentes. Inclui pesos livres, máquinas de cardio e espaço para aulas.', 'Térreo', 'C'),
    ('Área de Lazer Infantil', 'Espaço destinado para crianças, com brinquedos, escorregadores e outros equipamentos de recreação.', 'Jardim', 'C'),
    ('Piscina', 'Área com piscina para lazer e relaxamento dos moradores, com uma área de solário.', 'Térreo', 'C'),
    ('Churrasqueira', 'Espaço equipado para churrascos e refeições ao ar livre, com mesas e cadeiras.', 'Área externa', 'C');


-- 3. Inserção de dados na tabela Reserva
INSERT INTO Reserva (id_usuario, nomeUsuario, id_area_comum, data_reserva)
VALUES
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Carlos Silva'), 'Carlos Silva', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Salão de Festas' AND bloco = 'A'), '2024-09-05'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Carlos Silva'), 'Carlos Silva', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Piscina' AND bloco = 'A'), '2024-09-12'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Ana Souza'), 'Ana Souza', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Academia' AND bloco = 'B'), '2024-09-06'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Ana Souza'), 'Ana Souza', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Churrasqueira' AND bloco = 'B'), '2024-09-13'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'João Pereira'), 'João Pereira', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Área de Lazer Infantil' AND bloco = 'C'), '2024-09-07'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'João Pereira'), 'João Pereira', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Salão de Festas' AND bloco = 'A'), '2024-09-14'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Mariana Costa'), 'Mariana Costa', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Piscina' AND bloco = 'A'), '2024-09-08'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Mariana Costa'), 'Mariana Costa', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Academia' AND bloco = 'B'), '2024-09-15'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Rafael Oliveira'), 'Rafael Oliveira', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Churrasqueira' AND bloco = 'B'), '2024-09-09'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Rafael Oliveira'), 'Rafael Oliveira', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Área de Lazer Infantil' AND bloco = 'C'), '2024-09-16'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Camila Santos'), 'Camila Santos', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Salão de Festas' AND bloco = 'A'), '2024-09-10'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Camila Santos'), 'Camila Santos', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Piscina' AND bloco = 'A'), '2024-09-17'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Bruno Lima'), 'Bruno Lima', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Academia' AND bloco = 'B'), '2024-09-11'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Bruno Lima'), 'Bruno Lima', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Churrasqueira' AND bloco = 'B'), '2024-09-18'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Juliana Mendes'), 'Juliana Mendes', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Área de Lazer Infantil' AND bloco = 'C'), '2024-09-12'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Juliana Mendes'), 'Juliana Mendes', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Salão de Festas' AND bloco = 'A'), '2024-09-19'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Eduardo Almeida'), 'Eduardo Almeida', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Piscina' AND bloco = 'A'), '2024-09-13'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Eduardo Almeida'), 'Eduardo Almeida', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Academia' AND bloco = 'B'), '2024-09-20'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Patrícia Gomes'), 'Patrícia Gomes', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Churrasqueira' AND bloco = 'B'), '2024-09-14'),
    ((SELECT id FROM Usuario WHERE nomeUsuario = 'Patrícia Gomes'), 'Patrícia Gomes', (SELECT id FROM AreaComum WHERE nomeAreaComum = 'Área de Lazer Infantil' AND bloco = 'C'), '2024-09-21');

-- 4. Script de povoamento da tabela Cobranca (meses de janeiro a abril de 2024)
-- (Note que os valores serão inseridos na tabela Cobranca e a coluna "valor_total" é calculada automaticamente.)

-- Janeiro 2024
INSERT INTO Cobranca (id_morador, mes_referencia, taxa_condominio, taxa_agua, taxa_gas, status_pagamento)
VALUES
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Carlos Silva'), '2024-01-01', 300.00, 75.50, 50.30, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Ana Souza'), '2024-01-01', 300.00, 62.70, 45.10, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'João Pereira'), '2024-01-01', 300.00, 89.00, 60.00, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Mariana Costa'), '2024-01-01', 300.00, 68.40, 49.80, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Rafael Oliveira'), '2024-01-01', 300.00, 74.20, 55.60, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Camila Santos'), '2024-01-01', 300.00, 80.10, 58.30, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Bruno Lima'), '2024-01-01', 300.00, 69.90, 47.20, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Juliana Mendes'), '2024-01-01', 300.00, 83.60, 53.00, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Eduardo Almeida'), '2024-01-01', 300.00, 78.80, 52.10, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Patrícia Gomes'), '2024-01-01', 300.00, 72.30, 50.70, TRUE);

-- Fevereiro 2024
INSERT INTO Cobranca (id_morador, mes_referencia, taxa_condominio, taxa_agua, taxa_gas, status_pagamento)
VALUES
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Carlos Silva'), '2024-02-01', 300.00, 76.20, 51.00, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Ana Souza'), '2024-02-01', 300.00, 63.50, 46.20, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'João Pereira'), '2024-02-01', 300.00, 87.40, 59.10, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Mariana Costa'), '2024-02-01', 300.00, 70.00, 48.30, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Rafael Oliveira'), '2024-02-01', 300.00, 73.30, 54.90, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Camila Santos'), '2024-02-01', 300.00, 79.00, 57.10, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Bruno Lima'), '2024-02-01', 300.00, 71.80, 48.60, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Juliana Mendes'), '2024-02-01', 300.00, 82.50, 54.40, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Eduardo Almeida'), '2024-02-01', 300.00, 77.90, 53.20, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Patrícia Gomes'), '2024-02-01', 300.00, 73.90, 49.50, FALSE);

-- Março 2024
INSERT INTO Cobranca (id_morador, mes_referencia, taxa_condominio, taxa_agua, taxa_gas, status_pagamento)
VALUES
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Carlos Silva'), '2024-03-01', 300.00, 78.00, 50.80, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Ana Souza'), '2024-03-01', 300.00, 64.80, 44.70, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'João Pereira'), '2024-03-01', 300.00, 86.20, 58.00, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Mariana Costa'), '2024-03-01', 300.00, 69.10, 50.40, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Rafael Oliveira'), '2024-03-01', 300.00, 72.50, 53.70, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Camila Santos'), '2024-03-01', 300.00, 80.90, 56.40, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Bruno Lima'), '2024-03-01', 300.00, 72.90, 46.80, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Juliana Mendes'), '2024-03-01', 300.00, 84.70, 52.90, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Eduardo Almeida'), '2024-03-01', 300.00, 79.20, 51.60, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Patrícia Gomes'), '2024-03-01', 300.00, 74.10, 48.50, TRUE);

-- Abril 2024
INSERT INTO Cobranca (id_morador, mes_referencia, taxa_condominio, taxa_agua, taxa_gas, status_pagamento)
VALUES
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Carlos Silva'), '2024-04-01', 300.00, 76.80, 52.40, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Ana Souza'), '2024-04-01', 300.00, 62.90, 45.60, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'João Pereira'), '2024-04-01', 300.00, 85.30, 57.80, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Mariana Costa'), '2024-04-01', 300.00, 71.40, 49.50, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Rafael Oliveira'), '2024-04-01', 300.00, 70.60, 55.80, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Camila Santos'), '2024-04-01', 300.00, 82.70, 54.60, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Bruno Lima'), '2024-04-01', 300.00, 70.20, 47.80, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Juliana Mendes'), '2024-04-01', 300.00, 81.90, 51.40, TRUE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Eduardo Almeida'), '2024-04-01', 300.00, 77.50, 52.90, FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Patrícia Gomes'), '2024-04-01', 300.00, 75.80, 50.10, TRUE);

-- 5. Inserindo assembleias na tabela Assembleia com múltiplos participantes
INSERT INTO Assembleia (data_assembleia, ata, ids_usuarios, nomes_usuarios) 
VALUES 
    ('2024-01-10', 
     'Discussão sobre o orçamento anual e aprovação da previsão de gastos.',
     '1,2,3,4,5', 
     'Carlos Silva, Ana Souza, João Pereira, Mariana Costa, Rafael Oliveira'),
     
    ('2024-02-15', 
     'Reunião para definir regras de utilização das áreas comuns, especialmente da piscina e academia.',
     '6,7,8,9,10', 
     'Camila Santos, Bruno Lima, Juliana Mendes, Eduardo Almeida, Patrícia Gomes'),
     
    ('2024-03-20', 
     'Assembleia extraordinária para tratar de emergências na manutenção do sistema de segurança.',
     '1,2,3,4,6', 
     'Carlos Silva, Ana Souza, João Pereira, Mariana Costa, Camila Santos');

-- 6. Inserindo dados de exemplo na tabela Financeiro
INSERT INTO Financeiro (descricao, categoria, valor, data_custo, recorrente, status_pagamento, bloco, observacoes) VALUES
    ('Manutenção do elevador', 'Manutenção', 1200.00, '2024-01-15', 0, 1, 'A', 'Troca de peças no elevador principal'),
    ('Conta de Energia', 'Energia', 850.00, '2024-01-05', 1, 0, 'B', 'Fatura referente ao consumo de energia do mês de Janeiro'),
    ('Limpeza das áreas comuns', 'Serviços', 500.00, '2024-01-10', 1, 1, 'C', 'Serviço de limpeza contratado para áreas comuns do bloco C'),
    ('Reparos na Piscina', 'Manutenção', 300.00, '2024-01-20', 0, 1, 'A', 'Reparos no sistema de filtragem da piscina'),
    ('Jardinagem', 'Serviços', 200.00, '2024-01-25', 1, 1, 'C', 'Serviço de corte de grama e poda de árvores nas áreas comuns'),
    ('Conta de Água', 'Água', 600.00, '2024-02-05', 1, 0, 'A', 'Fatura de consumo de água do mês de Fevereiro'),
    ('Reparos elétricos', 'Manutenção', 450.00, '2024-02-15', 0, 1, 'B', 'Reparos na iluminação das áreas comuns do bloco B'),
    ('Segurança Patrimonial', 'Serviços', 1500.00, '2024-02-10', 1, 1, 'C', 'Contrato mensal de segurança patrimonial'),
    ('Conta de Gás', 'Gás', 400.00, '2024-03-01', 1, 0, 'A', 'Fatura de gás para o bloco A'),
    ('Pintura das áreas comuns', 'Manutenção', 750.00, '2024-03-15', 0, 1, 'C', 'Pintura dos corredores e áreas comuns do bloco C');

-- 7. Inserindo uma solicitação de exemplo na tabela Solicitacao
INSERT INTO Solicitacao (id_morador, tipo_solicitacao, descricao, atendido)
VALUES 
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Carlos Silva'), 'Manutenção', 'Solicito a manutenção do portão da garagem, pois está fazendo barulho.', FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'Ana Souza'), 'Documentos', 'Preciso de uma cópia da ata da última assembleia.', FALSE),
    ((SELECT id FROM Morador WHERE nomeUsuario = 'João Pereira'), 'Diversos', 'Sugestão de colocar mais lixeiras na área comum.', FALSE);