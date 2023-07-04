-- 코드를 입력하세요
SELECT I.rest_id, I.rest_name, I.food_type, I.favorites, I.address, round(avg(R.review_score), 2) as score
    FROM rest_info I
    JOIN rest_review R
        ON I.rest_id = R.rest_id
    WHERE I.address LIKE '서울%'
    GROUP BY I.rest_id, I.rest_name, I.food_type, I.favorites, I.address
    ORDER BY score desc, I.favorites desc;