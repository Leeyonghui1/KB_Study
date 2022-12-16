--2. 지금 학생 테이블이 있는 데 여기엔 컴공이랑 화공이 있다.
--학과 1개만 더 추가해보고 그 학과 가진 학생 2명 추가해보세요.
insert into major values('멸공','103');
insert into student values('김보규',20,'1234','103');
insert into student values('김진규',35,'12354','103');

--3. 학과코드가 001인 학생의 이름과 나이만 출력해보세요.
select name, age from student where code='001';

--4. 학과코드가 102(혹은 002)인 학생의 나이를 모두 20살로 통일하세요.
update student set age=20 where code='002';
select * from student;

--5. 성이 이씨인 학생을 지워보세요. (like 라는 키워드를 이용해야 할 것)
delete from student where name like '이%';

-- 참고
-- 이중 쿼리문
select max(age) from student;    -- 데이터 중 하나의 칼럼영역(age)에서 최댓값 출력
delete from student where age = (select max(age) from student);