CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(11),
    data_nascimento DATE,
    cidade VARCHAR(100),
    estado VARCHAR(2),
    rua VARCHAR(255),
    nome VARCHAR(255)
);