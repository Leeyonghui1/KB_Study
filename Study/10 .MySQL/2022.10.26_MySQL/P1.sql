/* schema 대신 database 사용가능 */
create schema springdb;
use springdb;

create table book
(
	book_id bigint unsigned not null auto_increment,
    title varchar(200) not null,
    category varchar(200) not null default '',
    price int null,
    insert_date datetime not null default now(),
    primary key(book_id)
);

select * from book;
