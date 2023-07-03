-- 코드를 입력하세요
SELECT count(*)
    FROM user_info
    WHERE extract(year FROM joined) = '2021' AND age BETWEEN 20 and 29;