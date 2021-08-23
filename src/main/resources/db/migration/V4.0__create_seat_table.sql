CREATE TABLE if NOT EXISTS seat
(
    seatId INT NOT NULL auto_increment PRIMARY KEY,
    scheduleId INT NOT NULL,
    FOREIGN KEY (scheduleId) REFERENCES schedule(scheduleId),
    isReserved BOOL NOT NULL
);