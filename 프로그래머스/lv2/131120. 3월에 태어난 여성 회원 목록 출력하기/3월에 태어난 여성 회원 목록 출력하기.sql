-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth, 'YYYY-MM-DD') AS date_of_birth
    FROM member_profile
    WHERE extract(month FROM date_of_birth) = 3 AND gender = 'W' AND NOT tlno IS NULL
    ORDER BY member_id;