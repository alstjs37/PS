-- 코드를 작성해주세요
select round(avg(ifnull(a.length, 10)), 2) as average_length
from fish_info a;