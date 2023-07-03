-- 코드를 입력하세요
SELECT O.animal_id, O.name
    FROM animal_outs O
    LEFT JOIN animal_ins I
        ON O.animal_id = I.animal_id
    WHERE I.datetime IS NULL
    ORDER BY O.animal_id;