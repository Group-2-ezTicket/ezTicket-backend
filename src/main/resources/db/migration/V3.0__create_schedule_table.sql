CREATE TABLE if NOT EXISTS schedule
(
    scheduleId INT NOT NULL auto_increment PRIMARY KEY,
    movieId INT,
    FOREIGN KEY (movieId) REFERENCES movies(movieId),
    timeStart DATE NOT NULL,
    timeEnd DATE NOT NULL
);