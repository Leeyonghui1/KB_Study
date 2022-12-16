select func_getperson(1) from dual;
select mytest_func() from dual;

-- 프로시저 안에 반환값있는 함수를 매개변수로 사용할 수 있다.
exec add_person(50,func_getperson(1),'010-9999-9191');
exec add_person(100,mytest_func(),'010-2299-1919');

select * from simple_test;