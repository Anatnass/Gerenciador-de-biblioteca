CREATE TABLE LIVROS (
    LIVRO_ID varchar(50) NOT NULL PRIMARY KEY,
    NOME varchar(255) NOT NULL,
    AUTOR varchar(255) NOT NULL
);

CREATE TABLE USUARIOS (
    PESSOA_ID varchar(50) NOT NULL PRIMARY KEY,
    NOME varchar(255) NOT NULL
);

CREATE TABLE RESERVAS (
    RESERVA_ID varchar(50) NOT NULL PRIMARY KEY,
    LIVRO_ID varchar(255) NOT NULL,
    PESSOA_ID varchar(255) NOT NULL,
    FOI_DEVOLVIDO boolean NOT NULL
);

ALTER TABLE RESERVAS ADD FOREIGN KEY (LIVRO_ID) REFERENCES LIVROS(LIVRO_ID);
ALTER TABLE RESERVAS ADD FOREIGN KEY (PESSOA_ID) REFERENCES USUARIOS(PESSOA_ID);

INSERT INTO LIVROS(LIVRO_ID, NOME, AUTOR) VALUES ('1', 'O Senhor dos Anéis', 'J.R.R. Tolkien');