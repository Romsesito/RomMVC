CREATE TABLE jugadores (
                           id BIGSERIAL PRIMARY KEY,
                           nombre VARCHAR(255) NOT NULL,
                           genero_juego_favorito VARCHAR(255),
                           ultimo_videojuego_terminado VARCHAR(255),
                           juegos_platinados INTEGER
);


INSERT INTO player (nombre, genero_juego_favorito, ultimo_videojuego_terminado, juegos_platinados)
VALUES ('Juan', 'RPG', 'The Witcher 3', 5);

INSERT INTO player (nombre, genero_juego_favorito, ultimo_videojuego_terminado, juegos_platinados)
VALUES ('María', 'Acción', 'God of War', 3);

INSERT INTO player (nombre, genero_juego_favorito, ultimo_videojuego_terminado, juegos_platinados)
VALUES ('Carlos', 'Aventura', 'Zelda: Breath of the Wild', 7);

INSERT INTO player (nombre, genero_juego_favorito, ultimo_videojuego_terminado, juegos_platinados)
VALUES ('Ana', 'Estrategia', 'Civilization VI', 2);

INSERT INTO player (nombre, genero_juego_favorito, ultimo_videojuego_terminado, juegos_platinados)
VALUES ('Luis', 'Deportes', 'FIFA 23', 10);


CREATE TABLE usuarios (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);


-- Usuario administrador
INSERT INTO usuarios (username, password)
VALUES ('admin', '$2a$10$8z5v6Q9E1J9uUuJ3x5v6Q9E1J9uUuJ3x5v6Q9E1J9uUuJ3x5v6Q9E');
-- Contraseña: "admin123"