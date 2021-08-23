CREATE TABLE if NOT EXISTS movies
(
    movieId INT NOT NULL auto_increment PRIMARY KEY,
    theatreId INT,
    FOREIGN KEY (theatreId) REFERENCES cinema(cinemaId),
    synopsis VARCHAR(50) NOT NULL,
    rating INT NOT NULL,
    duration INT NOT NULL,
    GENRE VARCHAR(50) NOT NULL,
    PRICE INT NOT NULL
);