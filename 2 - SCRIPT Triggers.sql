-- Triggers para inserção automática nas tabelas derivadas
DELIMITER //

-- Trigger para a tabela Morador
CREATE TRIGGER after_insert_usuario_morador
AFTER INSERT ON Usuario
FOR EACH ROW
BEGIN
    IF NEW.tipoUsuario = 'Morador' THEN
        INSERT INTO Morador (id, nomeUsuario, unidade, bloco)
        VALUES (NEW.id, NEW.nomeUsuario, 'Exemplo Unidade', 'A');  -- Substitua 'Exemplo Unidade' e 'A' conforme necessário
    END IF;
END;
//

-- Trigger para a tabela Administrador
CREATE TRIGGER after_insert_usuario_administrador
AFTER INSERT ON Usuario
FOR EACH ROW
BEGIN
    IF NEW.tipoUsuario = 'Administrador' THEN
        INSERT INTO Administrador (id, nomeUsuario, cargo)
        VALUES (NEW.id, NEW.nomeUsuario, 'Exemplo Cargo');  -- Substitua 'Exemplo Cargo' conforme necessário
    END IF;
END;
//

-- Trigger para a tabela Sindico
CREATE TRIGGER after_insert_usuario_sindico
AFTER INSERT ON Usuario
FOR EACH ROW
BEGIN
    IF NEW.tipoUsuario = 'Síndico' THEN
        INSERT INTO Sindico (id, nomeUsuario, data_inicio_mandato, data_fim_mandato)
        VALUES (NEW.id, NEW.nomeUsuario, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 1 YEAR));  -- Ajuste as datas conforme necessário
    END IF;
END;
//

DELIMITER ;

DELIMITER //

CREATE TRIGGER before_insert_reserva
BEFORE INSERT ON Reserva
FOR EACH ROW
BEGIN
    DECLARE reserva_existente INT;

    -- Verificar se já existe uma reserva para o mesmo usuário, área comum e data
    SELECT COUNT(*) INTO reserva_existente
    FROM Reserva
    WHERE id_usuario = NEW.id_usuario
      AND id_area_comum = NEW.id_area_comum
      AND data_reserva = NEW.data_reserva;

    -- Se já existir uma reserva, impedir a inserção e gerar um erro
    IF reserva_existente > 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Já existe uma reserva para este usuário, área comum e data.';
    END IF;
END;
//

DELIMITER ;
DELIMITER //

CREATE TRIGGER before_update_reserva
BEFORE UPDATE ON Reserva
FOR EACH ROW
BEGIN
    DECLARE reserva_existente INT;

    -- Verificar se já existe uma reserva para o mesmo usuário, área comum e data
    SELECT COUNT(*) INTO reserva_existente
    FROM Reserva
    WHERE id_usuario = NEW.id_usuario
      AND id_area_comum = NEW.id_area_comum
      AND data_reserva = NEW.data_reserva
      AND id != OLD.id; -- Excluindo o registro atual da verificação

    -- Se já existir uma reserva, impedir a atualização e gerar um erro
    IF reserva_existente > 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Já existe uma reserva para este usuário, área comum e data.';
    END IF;
END;
//

DELIMITER ;
DELIMITER //

CREATE TRIGGER after_delete_reserva
AFTER DELETE ON Reserva
FOR EACH ROW
BEGIN
    -- Aqui você pode adicionar ações adicionais após a exclusão, se necessário
    -- Exemplo: Adicionar um registro de log ou liberar recursos
END;
//
DELIMITER ;
DELIMITER //

CREATE TRIGGER after_insert_financeiro
AFTER INSERT ON Financeiro
FOR EACH ROW
BEGIN
    DECLARE v_count INT DEFAULT 0;
    DECLARE v_mes DATE;

    -- Define o mês de referência como o primeiro dia do mês da data_custo
    SET v_mes = DATE_FORMAT(NEW.data_custo, '%Y-%m-01');

    -- Verifica se já existe um registro em Relatorio para esse mês
    SELECT COUNT(*) INTO v_count FROM Relatorio WHERE mes_referencia = v_mes;

    IF v_count > 0 THEN
        -- Atualiza o registro existente. 
        -- Se você quiser distinguir entre custo e receita, adicione uma condição baseada em NEW.categoria.
        UPDATE Relatorio
        SET total_custos = total_custos + NEW.valor
        WHERE mes_referencia = v_mes;
    ELSE
        -- Insere um novo registro para o mês, com total_custos = NEW.valor e total_rendimentos = 0
        INSERT INTO Relatorio (mes_referencia, total_custos, total_rendimentos)
        VALUES (v_mes, NEW.valor, 0.00);
    END IF;
END;
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER after_insert_cobranca
AFTER INSERT ON Cobranca
FOR EACH ROW
BEGIN
    DECLARE v_count INT DEFAULT 0;
    DECLARE v_mes DATE;
    
    SET v_mes = NEW.mes_referencia;
    
    SELECT COUNT(*) INTO v_count
      FROM Relatorio
     WHERE mes_referencia = v_mes;
    
    IF v_count > 0 THEN
        UPDATE Relatorio
        SET total_rendimentos = total_rendimentos + NEW.valor_total
        WHERE mes_referencia = v_mes;
    ELSE
        INSERT INTO Relatorio (mes_referencia, total_custos, total_rendimentos)
        VALUES (v_mes, 0.00, NEW.valor_total);
    END IF;
END;
//
DELIMITER ;