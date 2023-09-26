CREATE TABLE `65109-ej07`.users (
	id INT auto_increment NOT NULL,
	nombreApellido varchar(100) NOT NULL,
	mail varchar(100) NULL,
	direccion varchar(100) NULL,
	clave varchar(100) NULL,
	CONSTRAINT users_PK PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;