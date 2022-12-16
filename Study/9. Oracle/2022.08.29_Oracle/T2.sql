select * from food;

-- 1.
delete from food where name like '%민트%';

-- 2.
delete from food where name like '%하와이안%';

-- 3.
delete from food where price >= 10000;

-- 4.
update food set recipe = 'msg추가' where price <= 5000;

-- 5.
select * from food order by price;