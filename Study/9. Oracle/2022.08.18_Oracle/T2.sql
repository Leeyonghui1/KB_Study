-- 1. ���� ���̾�׷� �����ϱ�
create table parking(
parkingnum number primary key,
carnum varchar2(20),
intime varchar2(20),
outtime varchar2(20));

insert into parking values(1,'123�� 1331','10:25','16:31');
insert into parking values(2,'234�� 1662','11:57','15:55');
insert into parking values(3,'123�� 4827','17:22',' ');

create table parkingfee(
out varchar2(20) primary key,
cash varchar2(20));

insert into parkingfee values('����','���οϷ�');
insert into parkingfee values('�ȳ���','���ι̿Ϸ�');

alter table parking add(out varchar2(20));
alter table parking add constraint fk_park foreign key(out) references parkingfee(out);

update parking set out='����' where parkingnum=1;
update parking set out='����' where parkingnum=2;
update parking set out='�ȳ���' where parkingnum=3;

select * from parking;

select parking.parkingnum "�����ڸ���ȣ", parking.carnum "������ȣ", parking.intime "�����ð�",
parking.outtime "�����ð�", parkingfee.cash "��ݳ��λ���" from parking join parkingfee on parking.out=parkingfee.out;  



-- 2. ���ο� �а� 1�� �� �߰�, ���ο� �а� �л� 2�� �߰�
insert into major values('�濵','003');
select * from major;

insert into student values('�̿���',25,'36','003');
insert into student values('���¿�',28,'20','003');
select * from student;

-- 3. �а��ڵ尡 001 �л� �̸�,���� ���
select name, age from student where code='001';

-- 4. �а��ڵ尡 002 �л��� ���̸� ��� 20��� ����
update student set age=20 where code='002';
select * from student where code='002';

-- 5. ���� '�̾�'�� �л��鸸 �����
delete from student where name like '��%';
select * from student;