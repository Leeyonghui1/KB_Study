create or replace function mytest_func return varchar is
v_test varchar2(100);
begin v_test:='�̵���';
return v_test;
end;
/

select mytest_func() from dual; -- dual : �ӽ����̺�, �Լ� ����׽�Ʈ�� ���

select * from simple_test where name = mytest_func();