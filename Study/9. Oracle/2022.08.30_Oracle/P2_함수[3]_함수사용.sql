select func_getperson(1) from dual;
select mytest_func() from dual;

-- ���ν��� �ȿ� ��ȯ���ִ� �Լ��� �Ű������� ����� �� �ִ�.
exec add_person(50,func_getperson(1),'010-9999-9191');
exec add_person(100,mytest_func(),'010-2299-1919');

select * from simple_test;