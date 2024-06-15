-- 코드를 입력하세요
SELECT a.history_id, a.car_id, date_format(a.start_date, '%Y-%m-%d') as start_date, date_format(a.end_date,'%Y-%m-%d') as end_date,
case when datediff(a.end_date, a.start_date) < 29 then '단기 대여' else '장기 대여' end as rent_type
from car_rental_company_rental_history a
where Year(a.start_date) = 2022 and month(a.start_date) = 9
order by a.history_id desc;