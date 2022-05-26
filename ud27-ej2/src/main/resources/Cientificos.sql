DROP DATABASE IF EXISTS cientificos;
CREATE DATABASE IF NOT EXISTS cientificos;
USE cientificos;


DROP TABLE IF EXISTS cientificos;
CREATE TABLE cientificos (
dni VARCHAR(8),
nombre_completo NVARCHAR(255) NOT NULL,
PRIMARY KEY (DNI)
)ENGINE=InnoDB;

INSERT INTO `cientificos`.`cientificos` (`dni`, `nombre_completo`) VALUES ('1', 'daniel');

DROP TABLE IF EXISTS proyectos;
CREATE TABLE proyectos (
id CHAR(4),
nombre NVARCHAR(255) NOT NULL,
horas INT NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB;


INSERT INTO `cientificos`.`proyectos` (`id`, `nombre`, `horas`) VALUES ('1', 'dawd', '15');
INSERT INTO `cientificos`.`proyectos` (`id`, `nombre`, `horas`) VALUES ('2', 'wda', '20');

DROP TABLE IF EXISTS asignado_a;
CREATE TABLE asignado_a (
id int auto_increment ,
cientifico VARCHAR(8),
proyecto CHAR(4),
precio INT DEFAULT NULL,
PRIMARY KEY (id),
FOREIGN KEY (cientifico) REFERENCES cientificos (dni)
ON DELETE RESTRICT ON UPDATE CASCADE,
FOREIGN KEY (proyecto) REFERENCES proyectos (id)
ON DELETE RESTRICT ON UPDATE CASCADE
)ENGINE=InnoDB;

INSERT INTO `cientificos`.`asignado_a` (`id`, `cientifico`, `proyecto`, `precio`) VALUES ('1', '1', '2', '10');


DROP TABLE IF EXISTS usuario;
CREATE TABLE `cientificos`.`usuario` (
    `id` int auto_increment  PRIMARY KEY ,
    `username` CHAR(255) NOT NULL,
    `password` CHAR(255) NOT NULL,
    `role` CHAR(255) NOT NULL
);


INSERT INTO usuario (username, password, role) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');