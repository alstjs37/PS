-- 코드를 입력하세요
SELECT *
from car_rental_company_car a
where a.options like '%네비게이션%'
order by a.car_id desc;