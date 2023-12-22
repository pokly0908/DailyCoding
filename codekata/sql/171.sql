SELECT case when Marks > 69 then Name
    end Name,
    case when Marks between 90 and 100 then 10
        when Marks between 80 and 89 then 9
        when Marks between 70 and 79 then 8
        when Marks between 60 and 69 then 7
        when Marks between 50 and 59 then 6
        when Marks between 40 and 49 then 5
        when Marks between 30 and 39 then 4
        when Marks between 20 and 29 then 3
        when Marks between 10 and 19 then 2
        when Marks between 0 and 9 then 1
    end grade,
    Marks
FROM students
ORDER BY grade DESC, Name ASC;