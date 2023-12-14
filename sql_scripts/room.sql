-- DROP DATABASE IF EXISTS smart_home;
CREATE DATABASE IF NOT EXISTS smart_home;
use smart_home;


-- DROP TABLE IF EXISTS socket;
-- DROP TABLE IF EXISTS pin;
-- DROP TABLE IF EXISTS room;


CREATE TABLE IF NOT EXISTS room (
	id VARCHAR(255) NOT NULL,
    name VARCHAR(100),
    
    PRIMARY KEY(id)
);


CREATE TABLE IF NOT EXISTS pin (
	id VARCHAR(255) NOT NULL,
	board VARCHAR(255) NOT NULL,
	type VARCHAR(50) NOT NULL,
    pin_number INT NOT NULL,
    consumption DOUBLE DEFAULT NULL,
    state BOOLEAN DEFAULT NULL,
    
    CHECK (type IN ("consumption", "control")),
    PRIMARY KEY(id),
	UNIQUE (board, pin_number)
);


CREATE TABLE IF NOT EXISTS socket (
	id VARCHAR(255) NOT NULL,
	room_id VARCHAR(255) NOT NULL,
	name VARCHAR(255) NOT NULL,
    control_pin_id VARCHAR(255) NOT NULL,
    consumption_pin_id VARCHAR(255),
    
    PRIMARY KEY(id),
	FOREIGN KEY(control_pin_id) REFERENCES pin(id),
    FOREIGN KEY(consumption_pin_id) REFERENCES pin(id),
    FOREIGN KEY(room_id) REFERENCES room(id)
);



drop procedure do_while;
DELIMITER $$
CREATE PROCEDURE do_while()
BEGIN
	DECLARE i int;
    declare idd VARCHAR(200);
    SET i = 0;
    SET idd = "a";
    
	WHILE i < 32 DO
		SET i = i+1;
        SET idd = Concat(idd, "b");
        
		INSERT INTO pin (id, board, type, pin_number) VALUES (
			idd,
			"PI",
			"control",
			i);
	END WHILE;
END; $$

DELIMITER ;

call do_while();
--delete from pin where id = "a";
--SELECT * FROM pin;