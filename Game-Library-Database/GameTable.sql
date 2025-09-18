CREATE TABLE games (
    id BIGINT PRIMARY KEY,
    title VARCHAR(255),
    genre VARCHAR(100),
    platform VARCHAR(255),
    releaseDate VARCHAR(50),
    developer VARCHAR(100),
    publisher VARCHAR(100),
    description TEXT,
    coverImageUrl VARCHAR(255),
    metaCriticRating DECIMAL(3, 1),
    userRating DECIMAL(3, 2),
    isCompleted BOOLEAN,
    isFavorite BOOLEAN,
    notes TEXT,
    playtimeHours DECIMAL(10, 2)
);