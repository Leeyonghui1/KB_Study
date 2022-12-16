-- 1번
create table student(
name varchar2(20),
age number,
hakbeon varchar2(20) primary key);

insert into student (hakbeon,name,age) values('11','안서준',19);
insert into student (hakbeon,name,age) values('12','김혜민',15);
insert into student (hakbeon,name,age) values('13','이범식',16);
insert into student (hakbeon,name,age) values('14','오세룡',33);

select * from student;

-- 2번 나이가 10대인 학생만 조회
select * from student where age >= 10 and age <=19;
select name from student where age > 9 and age < 20;   -- 조건에 맞는 이름만 출력
select name as 이름 from student where age > 9 and age < 20;  -- 'as'를 사용하여 테이블의 컬럼명을 변경
select name 이름 from student where age > 9 and age < 20;   -- 'as' 생략가능
select name as "이 름" from student where age > 9 and age < 20; -- 변경할 컬럼명에 띄어쓰기(공백)이 있으면 쌍따옴표("")를 사용
select name "이 름" from student where age > 9 and age < 20;   -- 'as' 생략가능


-- 3번 특정 조건(이름) 해당하는 데이터 삭제
delete from student where name='최호준';

-- 4번 특정 조건(이름) 해당하는 데이터 변경
insert into student values('박지호',10,'123');
update student set age=20 where name='박지호';
commit;
rollback;