select * from food_truck;
select * from food_category;

--1. 음식 분류별 평균 표시하되, 분류명도 같이 출력되게 하기
-- 분류 코드별로 평균
select foodcode, avg(price) from food_truck group by foodcode;
-- > 각 foodcode가 의미하는것을 쉽게 알아보기 힘들다
-- (1)view 없이 푸는방법(중첩질의)
select name, avgprice 
from (select foodcode,avg(price) avgprice from food_truck group by foodcode) A
join food_category on A.foodcode = food_category.code;
-- (2)view 사용하여 푸는방법
create view groupby_foodcdoe_avg as
select foodcode,avg(price) avgprice from food_truck group by foodcode;

select name,avgprice from food_category
join groupby_foodcdoe_avg on food_category.code = groupby_foodcdoe_avg.foodcode;

--1-2. 평균 값이 비싼 순으로 정렬
select name,avgprice from food_category
join groupby_foodcdoe_avg on food_category.code = groupby_foodcdoe_avg.foodcode
order by avgprice desc;

--1-3. 평균 값이 저렴한 순으로 정렬
select name,avgprice from food_category
join groupby_foodcdoe_avg on food_category.code = groupby_foodcdoe_avg.foodcode
order by avgprice asc; -- asc 생략가능

--2. 분류별로 가장 비싼 음식들 표시하기

-- distinct : 중복 제거 키워드
select distinct food_truck.name foodname, price, food_category.name categoryname
from food_truck join food_category on food_truck.foodcode = food_category.code;

create view food_category_truck as 
    select distinct food_truck.name foodname, price, food_category.name categoryname
    from food_truck join food_category on food_truck.foodcode = food_category.code; 

select * from food_category_truck;

select categoryname, max(price) maxprice from food_category_truck
group by categoryname;

-- view 생성시 주의사항 : avg,max 등 함수의 결과는 또 다른 이름으로 치환해줘야 한다
create view max_food as 
    select categoryname, max(price) maxprice from food_category_truck
    group by categoryname;

select foodname,price,max_food.categoryname from max_food
join food_category_truck on max_food.categoryname = food_category_truck.categoryname
    and max_food.maxprice = food_category_truck.price;

--3. 분류별로 가장 저렴한 음식들 표시하기
select categoryname, min(price) minprice from food_category_truck
group by categoryname;

create view min_food as
    select categoryname, min(price) minprice from food_category_truck
    group by categoryname;

select foodname,price,min_food.categoryname from 
food_category_truck join min_food on 
min_food.categoryname = food_category_truck.categoryname and 
min_food.minprice = food_category_truck.price;


--4. 평균적으로 볼 때 음식이 가장 저렴한 편인 음식분류는?
select * from groupby_foodcdoe_avg;
select name, groupby_foodcdoe_avg.foodcode, avgprice from
groupby_foodcdoe_avg join food_category on
groupby_foodcdoe_avg.foodcode = food_category.code;

create view group_avg_food as
select name, groupby_foodcdoe_avg.foodcode, avgprice from
groupby_foodcdoe_avg join food_category on
groupby_foodcdoe_avg.foodcode = food_category.code;

select * from group_avg_food where avgprice =
(select min(avgprice) from group_avg_food);

--5. 평균적으로 볼 때 음식이 가장 비싼 편인 음식분류는?
select * from group_avg_food where avgprice =
(select max(avgprice) from group_avg_food);

