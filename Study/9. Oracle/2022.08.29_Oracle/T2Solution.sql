-- 1. ���� �̸� �� ��Ʈ ���� ����
delete from food where name like '%��Ʈ%';

-- 2. ���� �̸� �� �Ͽ��̾� ���� ����
delete from food where name like '%�Ͽ��̾�%';

-- 3. ������ 10000�� �ʰ� �� ����
delete from food where price > 10000;

-- 4. ���İ��� 5000�� �����̸� recipe 'msg�߰�'�� ����
update food set recipe = 'msg�߰�' where price <= 5000;

-- 5. ���� ������������ ���
select * from food order by price;