select * from food_truck;
select * from food_category;

--1. ���� �з��� ��� ǥ���ϵ�, �з��� ���� ��µǰ� �ϱ�
-- �з� �ڵ庰�� ���
select foodcode, avg(price) from food_truck group by foodcode;
-- > �� foodcode�� �ǹ��ϴ°��� ���� �˾ƺ��� �����
-- (1)view ���� Ǫ�¹��(��ø����)
select name, avgprice 
from (select foodcode,avg(price) avgprice from food_truck group by foodcode) A
join food_category on A.foodcode = food_category.code;
-- (2)view ����Ͽ� Ǫ�¹��
create view groupby_foodcdoe_avg as
select foodcode,avg(price) avgprice from food_truck group by foodcode;

select name,avgprice from food_category
join groupby_foodcdoe_avg on food_category.code = groupby_foodcdoe_avg.foodcode;

--1-2. ��� ���� ��� ������ ����
select name,avgprice from food_category
join groupby_foodcdoe_avg on food_category.code = groupby_foodcdoe_avg.foodcode
order by avgprice desc;

--1-3. ��� ���� ������ ������ ����
select name,avgprice from food_category
join groupby_foodcdoe_avg on food_category.code = groupby_foodcdoe_avg.foodcode
order by avgprice asc; -- asc ��������

--2. �з����� ���� ��� ���ĵ� ǥ���ϱ�

-- distinct : �ߺ� ���� Ű����
select distinct food_truck.name foodname, price, food_category.name categoryname
from food_truck join food_category on food_truck.foodcode = food_category.code;

create view food_category_truck as 
    select distinct food_truck.name foodname, price, food_category.name categoryname
    from food_truck join food_category on food_truck.foodcode = food_category.code; 

select * from food_category_truck;

select categoryname, max(price) maxprice from food_category_truck
group by categoryname;

-- view ������ ���ǻ��� : avg,max �� �Լ��� ����� �� �ٸ� �̸����� ġȯ����� �Ѵ�
create view max_food as 
    select categoryname, max(price) maxprice from food_category_truck
    group by categoryname;

select foodname,price,max_food.categoryname from max_food
join food_category_truck on max_food.categoryname = food_category_truck.categoryname
    and max_food.maxprice = food_category_truck.price;

--3. �з����� ���� ������ ���ĵ� ǥ���ϱ�
select categoryname, min(price) minprice from food_category_truck
group by categoryname;

create view min_food as
    select categoryname, min(price) minprice from food_category_truck
    group by categoryname;

select foodname,price,min_food.categoryname from 
food_category_truck join min_food on 
min_food.categoryname = food_category_truck.categoryname and 
min_food.minprice = food_category_truck.price;


--4. ��������� �� �� ������ ���� ������ ���� ���ĺз���?
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

--5. ��������� �� �� ������ ���� ��� ���� ���ĺз���?
select * from group_avg_food where avgprice =
(select max(avgprice) from group_avg_food);

