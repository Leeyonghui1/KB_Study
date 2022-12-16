create or replace function mytest_func return varchar is
v_test varchar2(100);
begin v_test:='이동준';
return v_test;
end;
/

select mytest_func() from dual; -- dual : 임시테이블, 함수 기능테스트시 사용

select * from simple_test where name = mytest_func();