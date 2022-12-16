create table simple_test
(
    num int primary key,
    name varchar2(30) not null,
    phone_number varchar2(20) unique
    );
    
insert into simple_test values(1,'�̿���',null);
insert into simple_test values(2,'�̵���','010-1111-3333');

select * from simple_test;
-- Ʈ����� : �۾�����
-- db�� ���¸� ��ȭ��Ű�� �۾����� ( insert, update, delete ��, drop�� �ش� X)


-- ���ν���
-- �̸� ������ �����س��ٰ� ȣ���Ͽ��� ����ϴ� ��
-- �̸� ������ Ʈ�����, select�� ���� ȣ��
-- �ϳ��� ��ũ��Ʈ�� �ϳ��� ���ν��� ��������
-- ���ǻ���
-- begin (�����ʿ�)  :: begin�ڿ� ������ ������ ����Ѵ�.
-- in : ��� ��Ҹ� �������� �Ű������� ����Ѵٴ� ���� ( ����Ʈ ���� in�̶� �������� )
create or replace procedure add_person
(
    mynum in int,
    myname varchar2,
    mypn varchar2
    )
is begin insert into simple_test values(mynum,myname,mypn);
end add_person;