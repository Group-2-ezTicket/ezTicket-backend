CREATE TABLE if NOT EXISTS food
(
    packageId INT NOT NULL auto_increment PRIMARY KEY,
    packageName VARCHAR(50) NOT NULL,
    packageDetails VARCHAR(50) NOT NULL,
    packagePrice int NOT NULL
);