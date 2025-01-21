-- Triggers para a tabela Morador --
DELIMITER //

CREATE TRIGGER after_insert_usuario_morador
AFTER INSERT ON Usuario
FOR EACH ROW
BEGIN
    IF NEW.tipoUsuario = 'Morador' THEN
        INSERT INTO Morador (id, nomeUsuario, unidade, bloco)
        VALUES (NEW.id, NEW.nomeUsuario, NULL, NULL);  -- Ajuste 'unidade' e 'bloco' conforme necessário --
    END IF;
END;
//

DELIMITER ;

-- Triggers para a tabela Administrador
DELIMITER //

CREATE TRIGGER after_insert_usuario_administrador
AFTER INSERT ON Usuario
FOR EACH ROW
BEGIN
    IF NEW.tipoUsuario = 'Administrador' THEN
        INSERT INTO Administrador (id, nomeUsuario, cargo)
        VALUES (NEW.id, NEW.nomeUsuario, NULL);  -- Ajuste 'cargo' conforme necessário
    END IF;
END;
//

DELIMITER ;

-- Triggers para a tabela Síndico
DELIMITER //

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

-- Triggers para a tabela Reserva
-- Trigger para inserção na tabela Reserva
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

-- Trigger para atualização na tabela Reserva --
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

-- Trigger para exclusão na tabela Reserva --
DELIMITER //

CREATE TRIGGER after_delete_reserva
AFTER DELETE ON Reserva
FOR EACH ROW
BEGIN
   
END;
//

DELIMITER ;
