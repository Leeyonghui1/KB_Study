-- �ܷ�Ű(FK)

-- �а� ���̺� ����
create table major(name varchar2(20), code char(3) primary key);
insert into major values('�İ�','001');
insert into major values('ȭ��','002');

-- ���� student���̺� ���ο� Į��(�а��ڵ�) �߰�
-- ���ǻ��� : major���̺��� Į����, �ڷ���, ũ�Ⱑ ��� ��ġ�ϵ���
alter table student add (code char(3));

-- �ܷ�Ű �߰�
alter table student add constraint fk_stu foreign key(code) references major(code);

insert into student values('������',23,'100','001');
-- major ���̺��� '111' �ڵ尡 �������� �ʱ� ������ �߰� �Ұ���
-- insert into student values('������1',23,'100','111');

select * from student;

-- ���� : �ܷ�Ű(�а��ڵ�)�� �̿��Ͽ� major ���̺� �����ϴ� Į��(�а���)�� student ���̺� �����ϱ�
select student.name "�л���",major.name "�а���", hakbeon from student join major on student.code=major.code;


-- char vs varchar
-- char : ũ�� ����  || varchar : ũ�Ⱑ ����
-- ex) char(20) : ������ 20����Ʈ ��� || varchar(20) : �ִ� 20����Ʈ���� ��밡��