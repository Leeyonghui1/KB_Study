-- 1. 개인 다이어그램 구현하기
create table parking(
parkingnum number primary key,
carnum varchar2(20),
intime varchar2(20),
outtime varchar2(20));

insert into parking values(1,'123다 1331','10:25','16:31');
insert into parking values(2,'234마 1662','11:57','15:55');
insert into parking values(3,'123아 4827','17:22',' ');

create table parkingfee(
out varchar2(20) primary key,
cash varchar2(20));

insert into parkingfee values('나감','납부완료');
insert into parkingfee values('안나감','납부미완료');

alter table parking add(out varchar2(20));
alter table parking add constraint fk_park foreign key(out) references parkingfee(out);

update parking set out='나감' where parkingnum=1;
update parking set out='나감' where parkingnum=2;
update parking set out='안나감' where parkingnum=3;

select * from parking;

select parking.parkingnum "주차자리번호", parking.carnum "차량번호", parking.intime "입차시간",
parking.outtime "출차시간", parkingfee.cash "요금납부상태" from parking join parkingfee on parking.out=parkingfee.out;  



-- 2. 새로운 학과 1개 더 추가, 새로운 학과 학생 2명 추가
insert into major values('경영','003');
select * from major;

insert into student values('이용희',25,'36','003');
insert into student values('장태연',28,'20','003');
select * from student;

-- 3. 학과코드가 001 학생 이름,나이 출력
select name, age from student where code='001';

-- 4. 학과코드가 002 학생의 나이를 모두 20살로 통일
update student set age=20 where code='002';
select * from student where code='002';

-- 5. 성이 '이씨'인 학생들만 지우기
delete from student where name like '이%';
select * from student;