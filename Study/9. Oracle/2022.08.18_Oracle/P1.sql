-- 외래키(FK)

-- 학과 테이블 생성
create table major(name varchar2(20), code char(3) primary key);
insert into major values('컴공','001');
insert into major values('화공','002');

-- 기존 student테이블에 새로운 칼럼(학과코드) 추가
-- 주의사항 : major테이블의 칼럼명, 자료형, 크기가 모두 일치하도록
alter table student add (code char(3));

-- 외래키 추가
alter table student add constraint fk_stu foreign key(code) references major(code);

insert into student values('이현민',23,'100','001');
-- major 테이블에서 '111' 코드가 존재하지 않기 때문에 추가 불가능
-- insert into student values('이현민1',23,'100','111');

select * from student;

-- 조인 : 외래키(학과코드)를 이용하여 major 테이블에 존재하는 칼럼(학과명)을 student 테이블에 결합하기
select student.name "학생명",major.name "학과명", hakbeon from student join major on student.code=major.code;


-- char vs varchar
-- char : 크기 고정  || varchar : 크기가 유동
-- ex) char(20) : 무조건 20바이트 사용 || varchar(20) : 최대 20바이트까지 사용가능