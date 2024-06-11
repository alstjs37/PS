-- 코드를 입력하세요
SELECT a.book_id, date_format(a.published_date, '%Y-%m-%d') as published_date
from book a
where Year(a.published_date) = 2021 and a.category='인문'
order by a.published_date asc;