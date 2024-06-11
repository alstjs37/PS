-- 코드를 입력하세요
SELECT a.animal_id, a.name
from animal_ins a
where intake_condition like 'Sick'
order by a.animal_id