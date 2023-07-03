-- 코드를 입력하세요  
SELECT book_id, to_char(published_date, 'YYYY-MM-DD') AS published_date
    FROM book
    WHERE extract(year FROM published_date) = '2021' AND category = '인문'
    ORDER BY published_date;