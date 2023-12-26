SELECT DATE_FORMAT(DATETIME, '%H') HOUR, COUNT(1)
FROM ANIMAL_OUTS
WHERE DATE_FORMAT(DATETIME, '%H') BETWEEN 9 AND 20
GROUP BY HOUR
ORDER BY 1 ASC