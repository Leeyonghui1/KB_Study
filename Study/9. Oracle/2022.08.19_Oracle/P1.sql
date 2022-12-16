create table Employee(
sabeon number primary key,
name varchar2(20) not null,
age int,
jikGeup varchar2(30),
HP varchar(13) unique   -- unique : 중복을 허용하지 않음 (PK 공통점) / null값을 허용함 (PK 차이점)
);
-- int = integer , number : 부동소수점과 고정소수점 지정가능
select * from Employee;

insert into Employee values(1,'최호준',30,'사장',null);
insert into Employee values(001,'이동준',34,'신입','010-1234-5678');   -- number자료형 기준  : 1 과 001 같음
insert into Employee values(null,'이동준',34,'신입','010-1234-5678');  -- PK는 null값을 허용하지 않음
insert into Employee values(101,'이동준',34,'신입','010-1234-5678');

insert into Employee (sabeon,name,age,jikgeup) values(2,'박지호',50,'회장');
insert into Employee (hp,sabeon,name,age,jikgeup) values('010-111-1111',3,'차승화',40,'부회장');

update Employee set age=20,hp='010-2222-2222' where sabeon=2;

select * from Employee order by sabeon;  -- 사번 오름차순
select * from Employee order by age desc;  -- 나이 내림차순

set autocommit on; -- 자동커밋기능
commit;
select name, jikgeup as 직급 from Employee;