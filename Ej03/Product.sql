CREATE TABLE `jwa-03`.Product (
	id INT NOT NULL,
	nombre varchar(100) NULL,
	descripcion varchar(100) NULL,
	precio FLOAT NULL,
	CONSTRAINT Product_PK PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
