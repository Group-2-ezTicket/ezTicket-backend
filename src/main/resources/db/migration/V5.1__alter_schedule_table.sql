DELETE from seat;
DELETE from schedule;

ALTER TABLE schedule
ALTER COLUMN timeStart TIME NOT NULL;

ALTER TABLE schedule
ALTER COLUMN timeEnd TIME NOT NULL;

ALTER TABLE schedule
    ADD selectedDate DATE NOT NULL;