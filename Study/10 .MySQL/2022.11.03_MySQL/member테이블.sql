create table member
(
	name varchar(100) not null,
    id	 varchar(100) primary key,
    pw   varchar(100) not null,
    gender varchar(10) not null,
    phone varchar(50) unique,
    email varchar(100) unique,
    birth date		not null
);