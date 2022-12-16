select * from food_truck;
-- 1.
select food_category.name �з�, avg(price) ��� 
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name;

-- 1-1.
select food_category.name �з�, avg(price) ��� 
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name
order by avg(price) desc;

-- 1-2.
select food_category.name �з�, avg(price) ��� 
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name
order by avg(price) asc;

-- 2.
select food_category.name �з�, max(price) �ְ�
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name;

-- 3.
select food_category.name �з�, min(price) ������
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name;

-- 4.
