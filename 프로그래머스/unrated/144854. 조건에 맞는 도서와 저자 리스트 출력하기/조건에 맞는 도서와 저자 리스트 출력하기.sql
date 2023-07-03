-- 코드를 입력하세요
SELECT B.book_id, A.author_name, to_char(B.published_date, 'YYYY-MM-DD')
    FROM book B
    JOIN author A
        ON B.author_id = A.author_id
    WHERE B.category = '경제'
    ORDER BY B.published_date;