-- 코드를 입력하세요
SELECT i.FLAVOR
FROM ICECREAM_INFO AS i NATURAL JOIN FIRST_HALF AS f
WHERE f.TOTAL_ORDER > 3000 AND i.INGREDIENT_TYPE = 'fruit_based'
ORDER BY f.TOTAL_ORDER DESC