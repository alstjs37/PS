-- 코드를 작성해주세요
select a.id, a.email, a.first_name, a.last_name
from developer_infos a
where a.skill_1 = 'Python' or a.skill_2 = 'Python' or a.skill_3 = 'Python'
order by a.id asc;