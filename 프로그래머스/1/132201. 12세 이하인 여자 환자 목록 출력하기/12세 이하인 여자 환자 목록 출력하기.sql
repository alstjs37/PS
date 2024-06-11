-- 코드를 입력하세요
SELECT a.pt_name, a.pt_no, a.gend_cd, a.age, 
       case when a.tlno is null then 'NONE' else a.tlno end as tlno
from patient a
where a.age <= 12 and a.gend_cd = 'W'
order by a.age desc, a.pt_name asc;