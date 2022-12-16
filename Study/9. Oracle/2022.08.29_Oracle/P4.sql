-- group by
-- ��ü ��հ�
select avg(price) from food_truck;
-- ��ü �ְ�
select max(price) from food_truck;
-- �з��� ��հ�
select foodcode, avg(price) from food_truck group by foodcode;
-- �з��� �ְ�
select foodcode, max(price) from food_truck group by foodcode order by max(price);

-- having
-- group by ���� �������� �� �� where���� �ƴ� having���� ����ؾ���
select foodcode, avg(price) from food_truck group by foodcode having avg(price) > 10000;


-- ��ø ����
-- ������ �ȿ� �� �ٸ� �������� �� ��
-- �ְ��� ������ ã�� �ʹٸ�??
select * from food_truck where price=(select max(price) from food_truck);


-- view : ���� ���̺�
-- select������ ������� ������ ���̺�
-- ���� ���̺��� �̿��ؼ� �ڷ� ��ȸ�ϰ�, �� ��ȸ�� �ڷᰡ���� ������� ������ ���̺�

-- food_truck�� �ְ��� �����ϴ� ���̺� ����(���� ���̺�)
create view find_max_price as select max(price) max_price from food_truck;
select * from find_max_price;

-- view�� �̿��Ͽ� ��ø���ǹ��� �����ϰ�
select * from food_truck where price = (select * from find_max_price);