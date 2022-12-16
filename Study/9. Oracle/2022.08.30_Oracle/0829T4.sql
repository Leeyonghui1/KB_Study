select * from food_truck;
-- 1.
select food_category.name 분류, avg(price) 평균 
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name;

-- 1-1.
select food_category.name 분류, avg(price) 평균 
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name
order by avg(price) desc;

-- 1-2.
select food_category.name 분류, avg(price) 평균 
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name
order by avg(price) asc;

-- 2.
select food_category.name 분류, max(price) 최고가
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name;

-- 3.
select food_category.name 분류, min(price) 최저가
from food_truck
join food_category on food_truck.foodcode = food_category.code
group by food_category.name;

-- 4.
