create table customer
(
	id	bigint unsigned auto_increment,
    name varchar(100) not null,
    gender varchar(10) not null,
    email varchar(100) unique,
    phone varchar(50) unique,
    primary key(id)
);

select * from customer;

insert into customer values(1,'이용희','남자','aaa@naver.com','010-1111-1111');