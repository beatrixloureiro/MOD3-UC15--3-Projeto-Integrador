# UC3-P.I-
## Nome do Projeto 🏢  
**CondomínioX**  

## Status do Projeto 📌  
🚧 Em desenvolvimento 🚧  

## Objetivo do Projeto 🎯  
Este software visa facilitar a gestão de condomínios, promovendo uma comunicação eficiente entre moradores, síndicos e administradores. Ele busca automatizar processos como cobranças, gestão de assembleias e solicitações.  

## Tecnologias Utilizadas 💻  
- Java  
- MySQL  
- Swing (GUI)  
- JDBC  

## Descrição 📋
Este projeto é um sistema informatizado para a gestão de condomínios, desenvolvido em Java com MySQL para persistência de dados. Ele permite funcionalidades como:

**Funcionalidades Principais** ✨

  -  Login e autenticação: Redirecionamento baseado no tipo de usuário.
  -  Cobranças: Visualização de cobranças mensais detalhadas.
  -  Assembleias: Consulta de atas e registro de novas assembleias.
  -  Solicitações: Registro e acompanhamento de solicitações ao síndico.
  -  Autenticação e autorização de usuários (Morador, Síndico e Administrador).
  -  Consulta de cobranças mensais.
  -  Gestão de assembleias e registro de atas.
  -  Solicitações diretas ao síndico.
  -  Relatórios financeiros.

O sistema conta com uma interface gráfica amigável desenvolvida em Java Swing, permitindo uma navegação intuitiva.

## Estrutura do Banco de Dados 🗄️

Inclui tabelas para gerenciamento de categorias, subcategorias, períodos, orçamentos, usuários, contas bancárias, movimentos financeiros, e muito mais.

-- Exemplo da criação de uma tabela: --

**SQL**
      
      CREATE TABLE Usuarios (
      id INT AUTO_INCREMENT PRIMARY KEY,
      username VARCHAR(50),
      password VARCHAR(255),
      ativo BOOLEAN,
      nome VARCHAR(100),
      sobrenome VARCHAR(100),
      email VARCHAR(100),
      idCondominio INT,
      FOREIGN KEY (idCondominio) REFERENCES Condominios(idCondominio)
    );

## Wireframes 📐

## Como Executar 🚀

## Créditos 👥

    Desenvolvido por: Ana Beatriz Loureiro

![image](https://github.com/user-attachments/assets/d26a2b2b-a31e-4226-b5a8-d4940a710788)
