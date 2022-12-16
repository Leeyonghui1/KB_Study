create table samsungpeople(
id number primary key,
name varchar2(30) not null,  -- 'not null' : ������ ������� ����
boss_id number);

select * from samsungpeople;

insert into samsungpeople values(1,'�̰���',1);
insert into samsungpeople values(2,'ȫ����',2);
insert into samsungpeople values(3,'�̺���',1);
insert into samsungpeople values(4,'�����',1);
insert into samsungpeople values(5,'�Ŷ�ȣ��',3);
insert into samsungpeople values(6,'�Ｚ����',4);
insert into samsungpeople values(7,'�����Ｚ',4);
insert into samsungpeople values(8,'�Ｚ���̿���',4);

-- ���� ���� : �ϳ��� ���̺��� ������ ���̺��� �����Ͽ� join
select a.name BOSS, b.name NAME from samsungpeople a join samsungpeople b on a.id=b.boss_id;
-- 'a.' / 'b.' : �ϳ��� ���̺��� �ΰ��� ���̺�� �����ϱ� ���� ���Ƿ� ���� ���̺� ǥ�ù��
commit;
-- ���̺� �÷��� ����
-- alter table samsungpeople rename column boss_id to boss_id2;