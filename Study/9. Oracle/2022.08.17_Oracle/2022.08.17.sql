-- 모든 데이터를 조회하는 코드
select * from student;  

-- where (조건)  : 조건을 만족하는 데이터만 찾아줌
select * from student where age > 25;

-- SQL의 조건문에선 같은지 체크할 때 '='
select * from student where age > 25 and hakbeon='3';

-- 문자열은 따옴표'' 사이에 적는다
insert into student (hakbeon, name, age) values ('1','이용희',20);
  
-- SQL의 핵심
-- CRUD
-- select = read = 조회
-- insert = create = 삽입
-- update = 수정
-- delete = 삭제

select * from student;  
update student set name='장태연' where hakbeon='1';
delete from student where age=20;

commit; -- 추가, 수정, 삭제할 때마다 그 내용을 저장하는것
-- 마지막으로 commit한 지점으로 돌아갈 수 있다

rollback; -- 내가 마지막으로 커밋한 지점으로 돌아가기
delete from student;