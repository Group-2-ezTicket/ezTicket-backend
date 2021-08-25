DELETE from seat;
DELETE from schedule;
DELETE from movies;
DELETE from cinema;
DELETE from food;


ALTER TABLE schedule
    ADD cinemaId INT NOT NULL;

ALTER TABLE schedule
    ADD FOREIGN KEY (cinemaId) REFERENCES cinema(cinemaId);

ALTER TABLE movies
    DROP COLUMN THEATREID;

ALTER TABLE seat
    DROP COLUMN ISRESERVED;

ALTER TABLE seat
    ADD orderId INT;

CREATE TABLE if NOT EXISTS users
(
    userId INT NOT NULL auto_increment PRIMARY KEY,
    userName char(50) NOT NULL,
    password char(50) NOT NULL
);

CREATE TABLE if NOT EXISTS orders
(
    orderId INT NOT NULL auto_increment PRIMARY KEY,
    userId INT NOT NULL,
    FOREIGN KEY (userId) REFERENCES users(userId),
    foodList varchar(50),
    totalPrice float NOT NULL
);

ALTER TABLE seat
    ADD FOREIGN KEY (orderId) REFERENCES orders(orderId);