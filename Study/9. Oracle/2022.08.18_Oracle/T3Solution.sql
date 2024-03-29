-- 시퀀스
-- 순차적으로 증가해야 하는 값이 있을 때 많이 씀
create sequence myrow;
create sequence myseq;

create table song
(i_d number primary key, title varchar2(100), price number);

create table singer
(id number primary key, name varchar2(100), hit_song_id number,
foreign key(hit_song_id) references song(i_d));

insert into song values(myrow.nextval,'dragon night',10000);
insert into song values(myrow.nextval,'신호등',9000);
insert into song values(myrow.nextval,'let it be',8000);
insert into song values(myrow.nextval,'bad guy',7000);
insert into song values(myrow.nextval,'분홍신발',5000);

select * from song;

insert into singer(id,name) values(myseq.nextval,'이무진');
insert into singer(id,name) values(myseq.nextval,'세카이노오와리');
insert into singer(id,name) values(myseq.nextval,'유희열');

select * from singer;

update singer set hit_song_id=2 where id=1;
update singer set hit_song_id=1 where id=2;

select name, title from song join singer on song.i_d=singer.hit_song_id;

select name, title from song right join singer on song.i_d=singer.hit_song_id;
select name, title from song left join singer on song.i_d=singer.hit_song_id;



