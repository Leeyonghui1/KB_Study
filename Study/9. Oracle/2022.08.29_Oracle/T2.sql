select * from food;

-- 1.
delete from food where name like '%��Ʈ%';

-- 2.
delete from food where name like '%�Ͽ��̾�%';

-- 3.
delete from food where price >= 10000;

-- 4.
update food set recipe = 'msg�߰�' where price <= 5000;

-- 5.
select * from food order by price;