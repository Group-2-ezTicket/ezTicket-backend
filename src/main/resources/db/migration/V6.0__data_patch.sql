UPDATE MOVIES SET SYNOPSIS = 'When a bank teller discovers hes actually a background player in an open-world video game,he decides to become the hero of his own story one that he can rewrite himself. In a world where theres no limits, hes determined to save the day his way before its too late, and maybe find a little romance with the coder who conceived him.',
RATING = 5,
GENRE = 'COMEDY',
DURATION = 145
WHERE MOVIEID = 5;


UPDATE MOVIES SET SYNOPSIS = 'In the distant future, Rigby leads Benson, Skips, Hi-Five Ghost, Muscle Man, and Pops against a madman named Mr. Ross, who is plotting to destroy Earth by erasing all of time. They find Mr. Ross weapon is guarded by a cyborg version of Mordecai, who attempts to kill Rigby for a transgression he did in the past. When the entire team is killed, Benson sacrifices himself so that Rigby can use a timeship, a space vehicle that can travel through time, to reach the past and stop the chaos. Rigby does so, but not before Mordecai shoots him with a plasma shotgun.',
RATING = 4,
DURATION = 150
WHERE MOVIEID = 6;

UPDATE MOVIES SET DURATION = 135 WHERE MOVIEID = 1;

UPDATE MOVIES SET RATING = 4, DURATION = 140 WHERE MOVIEID = 2;

UPDATE MOVIES SET RATING = 5, DURATION = 150 WHERE MOVIEID = 3;

UPDATE MOVIES SET RATING = 5 WHERE MOVIEID = 4;

INSERT INTO MOVIES  (MOVIETITLE,SYNOPSIS,RATING,DURATION,GENRE,PRICE) VALUES ('The Wind Rises','A lifelong love of flight inspires Japanese aviation engineer Jiro Horikoshi (Hideaki Anno), whose storied career includes the creation of the A6M World War II fighter plane.', 3, 135, 'Romance', 300);

UPDATE ORDERS SET FOODLIST = 'Popcorn and Cola';

DELETE FROM SCHEDULE WHERE SCHEDULEID = 36;

INSERT INTO SCHEDULE (MOVIEID,TIMESTART,TIMEEND,SELECTEDDATE,CINEMAID) VALUES (5,'9:00:00','11:30:00','2021-08-24',4);
INSERT INTO SCHEDULE (MOVIEID,TIMESTART,TIMEEND,SELECTEDDATE,CINEMAID) VALUES (1,'9:00:00','11:30:00','2021-08-24',4);
INSERT INTO SCHEDULE (MOVIEID,TIMESTART,TIMEEND,SELECTEDDATE,CINEMAID) VALUES (3,'9:00:00','11:30:00','2021-08-24',4);
INSERT INTO SCHEDULE (MOVIEID,TIMESTART,TIMEEND,SELECTEDDATE,CINEMAID) VALUES (6,'12:00:00','2:30:00','2021-08-24',3);
INSERT INTO SCHEDULE (MOVIEID,TIMESTART,TIMEEND,SELECTEDDATE,CINEMAID) VALUES (5,'1:00:00','2:30:00','2021-08-24',3);




