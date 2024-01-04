SELECT
    CASE WHEN PRICE < 10000 THEN 0
    WHEN PRICE > 9999 AND PRICE < 20000 THEN 10000
    WHEN PRICE > 19999 AND PRICE < 30000 THEN 20000
    WHEN PRICE > 29999 AND PRICE < 40000 THEN 30000
    WHEN PRICE > 39999 AND PRICE < 50000 THEN 40000
    WHEN PRICE > 49999 AND PRICE < 60000 THEN 50000
    WHEN PRICE > 59999 AND PRICE < 70000 THEN 60000
    WHEN PRICE > 69999 AND PRICE < 80000 THEN 70000
    WHEN PRICE > 79999 AND PRICE < 90000 THEN 80000
    WHEN PRICE > 89999 AND PRICE < 100000 THEN 90000
    END PRICE_GROUP,
COUNT(price)
FROM PRODUCT
GROUP BY 1
ORDER BY 1