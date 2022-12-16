select foodcode, avg(price) from food_truck group by foodcode;
create view A as select foodcode foodcode, avg(price) avg_price from food_truck group by foodcode;
select * from A;

-- 1.
select name 분류, A.AVG_PRICE 평균값 from food_category join A on food_category.code = A.foodcode;
-- 1-1.
select name 분류, A.AVG_PRICE 평균값 from food_category join A on food_category.code = A.foodcode
    order by a.avg_price desc;
-- 1-2.
select name 분류, A.AVG_PRICE 평균값 from food_category join A on food_category.code = A.foodcode
    order by a.avg_price asc;


select foodcode, max(price) from food_truck group by foodcode;
create view B as select foodcode foodcode, max(price) max_price from food_truck group by foodcode;
select * from B;

select * from food_truck;
select name 음식, B.max_price 가격 from food_truck join B on food_truck.foodcode = B.foodcode;

select foodcode, min(price) from food_truck group by foodcode;
