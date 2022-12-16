-- group by
-- 전체 평균값
select avg(price) from food_truck;
-- 전체 최고값
select max(price) from food_truck;
-- 분류별 평균값
select foodcode, avg(price) from food_truck group by foodcode;
-- 분류별 최고값
select foodcode, max(price) from food_truck group by foodcode order by max(price);

-- having
-- group by 이후 조건절을 쓸 때 where절이 아닌 having절을 사용해야함
select foodcode, avg(price) from food_truck group by foodcode having avg(price) > 10000;


-- 중첩 질의
-- 쿼리문 안에 또 다른 쿼리문이 들어간 것
-- 최고가의 음식을 찾고 싶다면??
select * from food_truck where price=(select max(price) from food_truck);


-- view : 가상 테이블
-- select문으로 만들어진 가상의 테이블
-- 기존 테이블을 이용해서 자료 조회하고, 그 조회된 자료가지고 만들어진 가상의 테이블

-- food_truck의 최고가만 저장하는 테이블 생성(가상 테이블)
create view find_max_price as select max(price) max_price from food_truck;
select * from find_max_price;

-- view를 이용하여 중첩질의문을 간단하게
select * from food_truck where price = (select * from find_max_price);