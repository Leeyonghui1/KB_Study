select * from mydbhakgwa;
select * from mydbstudent;

--1.�а� 1���߰�
insert into mydbhakgwa values('003','ȭ��');

--2.�л� 5�� �߰�
insert into mydbstudent values('0000000006','�̿���',34,'002');
insert into mydbstudent values('0000000007','���¿�',24,'003');
insert into mydbstudent values('0000000008','�躸��',18,'003');
insert into mydbstudent values('0000000009','�輺��',29,'003');
insert into mydbstudent values('0000000010','�ȼ���',22,'002');

select mydbstudent.name, mydbhakgwa.name, age from mydbstudent join
mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

-- 3. ��ճ��̰� ���� ���� �а� ��� 

-- �л����� �а���� ���� ���
select mydbhakgwa.name, age from mydbstudent join
mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

-- �а���� ���̸� �ִ� ���� ���̺�(��) : age_by_student �����
create view age_by_student as select mydbhakgwa.name, age from mydbstudent join
mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

select * from age_by_student;

-- �а��� ��ճ��� ���
select name �а���, avg(age) ��ճ��� from age_by_student group by name;

-- �а��� ��ճ��� ���� ���̺�
create view avg_age_gwa as select name, avg(age) avgAge from age_by_student group by name;

-- �а��� ��ճ��� ���
select * from avg_age_gwa;

-- ���� ū ��ճ��� ���
select max(avgage) from avg_age_gwa;

-- ���� ū ��ճ��� ���̶� ��ġ�ϴ� ���� name��Ʈ �� ���
select name from avg_age_gwa where avgage=(select max(avgage) from avg_age_gwa);

commit;
