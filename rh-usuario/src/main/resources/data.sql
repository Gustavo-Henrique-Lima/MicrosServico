INSERT INTO usuario (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO usuario (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO papel (nome_papel) VALUES ('ROLE_OPERATOR');
INSERT INTO papel (nome_papel) VALUES ('ROLE_ADMIN');

INSERT INTO papel_usuario (usuario_id, papel_id) VALUES (1, 1);
INSERT INTO papel_usuario (usuario_id, papel_id) VALUES (2, 1);
INSERT INTO papel_usuario (usuario_id, papel_id) VALUES (2, 2);