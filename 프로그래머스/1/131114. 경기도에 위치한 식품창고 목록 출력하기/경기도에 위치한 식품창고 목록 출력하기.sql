-- 코드를 입력하세요
SELECT a.warehouse_id, a.warehouse_name, a.address,
       case when a.freezer_yn is null then 'N' else a.freezer_yn end
from food_warehouse a
where a.address like '경기도%'
order by a.warehouse_id;