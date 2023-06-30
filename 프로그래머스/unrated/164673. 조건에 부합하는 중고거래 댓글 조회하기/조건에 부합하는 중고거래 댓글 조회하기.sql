-- 코드를 입력하세요
select a.title as title,
        b.board_id as board_id,
        b.reply_id as reply_id,
        b.writer_id as writer_id,
        b.contents as contents,
        to_char(b.created_date, 'yyyy-mm-dd') as created_date
    from used_goods_board a 
            join used_goods_reply b on a.board_id = b.board_id
        where a.created_date >= to_date('2022-10-01', 'yyyy-mm-dd')
            and a.created_date <= to_date('2022-10-31', 'yyyy-mm-dd')
                order by b.created_date, a.title;