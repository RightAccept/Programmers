-- 코드를 입력하세요
SELECT P.product_code, sum(P.price * O.sales_amount) AS sales
    FROM product P
    JOIN offline_sale O
        ON P.product_id = O.product_id
    group by P.product_code
    order by sales desc, P.product_code;