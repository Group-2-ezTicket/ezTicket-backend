CREATE TABLE if NOT EXISTS movies
(
    movieId INT NOT NULL auto_increment PRIMARY KEY,
    theatreId INT,
    FOREIGN KEY (theatreId) REFERENCES cinema(cinemaId),
    movieTitle VARCHAR(100) NOT NULL,
    synopsis VARCHAR(2000) NOT NULL,
    rating INT NOT NULL,
    duration INT NOT NULL,
    GENRE VARCHAR(50) NOT NULL,
    PRICE INT NOT NULL
);