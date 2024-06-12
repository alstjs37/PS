-- 코드를 작성해주세요
select a.id, a.email, a.first_name, a.last_name
from developer_infos a
where 'Python' in (a.skill_1, a.skill_2, a.skill_3)
order by a.id asc;