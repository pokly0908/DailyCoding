SELECT ANIMAL_TYPE, 
    CASE WHEN NAME is null THEN 'No name'
    WHEN NAME is not null THEN NAme END AS NAME,
    SEX_UPON_INTAKE
FROM ANIMAL_INS