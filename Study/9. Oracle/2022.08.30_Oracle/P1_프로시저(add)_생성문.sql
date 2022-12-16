create table simple_test
(
    num int primary key,
    name varchar2(30) not null,
    phone_number varchar2(20) unique
    );
    
insert into simple_test values(1,'이용희',null);
insert into simple_test values(2,'이동준','010-1111-3333');

select * from simple_test;
-- 트랜잭션 : 작업단위
-- db의 상태를 변화시키는 작업단위 ( insert, update, delete 단, drop은 해당 X)


-- 프로시저
-- 미리 쿼리를 정의해놨다가 호출하여서 사용하는 것
-- 미리 만들어둔 트랜잭션, select문 등을 호출
-- 하나의 워크시트에 하나의 프로시저 생성문만
-- 주의사항
-- begin (공백필요)  :: begin뒤에 무조건 공백을 줘야한다.
-- in : 대상 요소를 프리시저 매개변수로 사용한다는 선언 ( 디폴트 값이 in이라서 생략가능 )
create or replace procedure add_person
(
    mynum in int,
    myname varchar2,
    mypn varchar2
    )
is begin insert into simple_test values(mynum,myname,mypn);
end add_person;