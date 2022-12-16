create table testtable(
mynum int primary key,
name varchar(100));

insert into testtable values(1,'박지호');
insert into testtable values(2,'오세룡');

select * from testtable;

-- mysql은 기본적으로 update,delete 명령을 막음
-- Edit -> Preference -> SQL Editor 클릭 후 맨 밑 Safe 체크 해제 후 workbench 재시작
update testtable set name='박지호(여성)' where name='박지호';
delete from testtable where name='오세룡';