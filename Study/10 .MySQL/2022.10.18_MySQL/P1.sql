use jspdb;

-- 테이블명 :: member
-- 속성 :: 이름, id, 비번, 폰번호, 성별

create table member
(
	name varchar(100) not null,
    id varchar(100) primary key,
    pw varchar(100) not null,
    hp varchar(50) unique,
    gender varchar(10)
);


alter table member add hobby varchar(50);

update member set id='heyhey1' where id='heyhey';
select * from member;