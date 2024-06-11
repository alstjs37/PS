-- 코드를 입력하세요
SELECT a.dr_name, a.dr_id, a.mcdp_cd, date_format(a.hire_ymd, '%Y-%m-%d') as hire_ymd
from doctor a
where a.mcdp_cd in ('CS', 'GS')
order by a.hire_ymd desc, a.dr_name asc;