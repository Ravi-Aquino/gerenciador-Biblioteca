CREATE TABLE administradores (
                                 id BIGSERIAL PRIMARY KEY,
                                 nome VARCHAR(100) NOT NULL,
                                 email VARCHAR(150) NOT NULL UNIQUE,
                                 senha VARCHAR(255) NOT NULL,
                                 status VARCHAR(20) NOT NULL
);

CREATE TABLE usuarios (
                          id BIGSERIAL PRIMARY KEY,
                          nome VARCHAR(100) NOT NULL,
                          cpf VARCHAR(11) NOT NULL UNIQUE,
                          status VARCHAR(20) NOT NULL
);

CREATE TABLE autores (
                         id BIGSERIAL PRIMARY KEY,
                         nome VARCHAR(150) NOT NULL
);

CREATE TABLE categorias (
                            id BIGSERIAL PRIMARY KEY,
                            nome VARCHAR(100) NOT NULL
);

CREATE TABLE livros (
                        id BIGSERIAL PRIMARY KEY,
                        titulo VARCHAR(255) NOT NULL,
                        isbn VARCHAR(20) NOT NULL UNIQUE,
                        numero_paginas INTEGER NOT NULL,
                        autor_id BIGINT NOT NULL,
                        categoria_id BIGINT NOT NULL,
                        status VARCHAR(20) NOT NULL,

                        CONSTRAINT fk_livro_autor
                            FOREIGN KEY (autor_id)
                                REFERENCES autores(id),

                        CONSTRAINT fk_livro_categoria
                            FOREIGN KEY (categoria_id)
                                REFERENCES categorias(id)
);

CREATE TABLE exemplares (
                            id BIGSERIAL PRIMARY KEY,
                            livro_id BIGINT NOT NULL,
                            status VARCHAR(20) NOT NULL,

                            CONSTRAINT fk_exemplar_livro
                                FOREIGN KEY (livro_id)
                                    REFERENCES livros(id)
);

CREATE TABLE emprestimos (
                             id BIGSERIAL PRIMARY KEY,
                             usuario_id BIGINT NOT NULL,
                             exemplar_id BIGINT NOT NULL,
                             data_inicio DATE NOT NULL,
                             data_prevista_devolucao DATE NOT NULL,
                             data_devolucao DATE,
                             status VARCHAR(20) NOT NULL,

                             CONSTRAINT fk_emprestimo_usuario
                                 FOREIGN KEY (usuario_id)
                                     REFERENCES usuarios(id),

                             CONSTRAINT fk_emprestimo_exemplar
                                 FOREIGN KEY (exemplar_id)
                                     REFERENCES exemplares(id)
);