-- 코드를 입력하세요
SELECT a.animal_id, a.name
from animal_ins a
where not intake_condition in ('Aged')
order by a.animal_id;