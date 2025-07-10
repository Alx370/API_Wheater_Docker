DROP TABLE IF EXISTS comuni;

CREATE TABLE comuni (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    latitudine DOUBLE NOT NULL,
    longitudine DOUBLE NOT NULL
);