create table mydbhakgwa(
code char(3) primary key,
name varchar2(30)
);
-- 다른 테이블이 참조하려는 칼럼은 pk로 설정해야함

create table mydbstudent(
hakbeon varchar2(10) primary key,
name varchar2(60),
age int,
hakgwacode char(3),
foreign key(hakgwacode) references mydbhakgwa(code)
);

insert into mydbhakgwa values('001','컴공');
insert into mydbhakgwa values('002','아동가족');

insert into mydbstudent values('0000000001','이동준',34,'001');
insert into mydbstudent values('0000000002','이제영',35,'002');
insert into mydbstudent values('0000000003','김혜민',24,'001');
insert into mydbstudent values('0000000004','이범식',44,'001');
insert into mydbstudent values('0000000005','박지호',14,'002');

select mydbstudent.name 학생명, hakbeon 학번, mydbhakgwa.name 학과명 
 from mydbstudent join mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;
 
-- 평균나이
select avg(age) from mydbstudent;
-- 학과별 평균나이
select hakgwacode, avg(age) from mydbstudent group by hakgwacode;
-- 학과별 평균 나이 출력하되, 조건(30넘는)만족하는 것만 표시
select hakgwacode, avg(age) from mydbstudent group by hakgwacode having avg(age)>30;


-- 중첩질의 (나이 최댓값 데이터 출력)
select * from mydbstudent where age = (select max(age) from mydbstudent);

select mydbhakgwa.name, avgage from mydbhakgwa join (
select hakgwacode, avg(age) avgage from mydbstudent group by hakgwacode) a
on mydbhakgwa.code = a.hakgwacode;

-- SQL Plus에서 관리자접속후 view 생성 권한 부여해야함
--grant create view to c##scott;

create view max_age as (select max(age) maxAge from mydbstudent);

select * from max_age; -- 가상의 테이블 뷰(view)
-- 중첩질의 등에서 많이 사용
-- select 문이 복잡해질 경우 단순화하기 위해
-- view의 데이터 편집이 일반적으로 불가능하지만
-- 특수한 상황일 때, view의 칼럼이 기존의 테이블과 동일하다면
-- view의 데이터를 수정,삭제 등을 하면 기존의 테이블 데이터값이 변한다

select * from mydbstudent where age=(select * from max_age);

-- 최연장자의 학과를 출력할려면
create view max_age_student as select * from mydbstudent where age=(select * from max_age);

select mydbhakgwa.name from max_age_student join mydbhakgwa on 
max_age_student.hakgwacode = mydbhakgwa.code;

commit;


