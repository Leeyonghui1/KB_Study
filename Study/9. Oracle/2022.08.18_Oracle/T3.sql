create table singer(
id number primary key,
name varchar2(30),
hit_song_id number);

insert into singer values(1,'이무진',1);
insert into singer values(2,'세카이노오와리',1);
insert into singer values(3,'유이치 사카모토',1);

select * from singer;

create table song(
id number primary key,
title varchar2(60),
price number);

insert into song values(1,'dragon night',10000);
insert into song values(2,'신호등',9000);
insert into song values(3,'let it be',8000);
insert into song values(4,'bad guy',7000);
insert into song values(5,'분홍 신발',5000);

select * from song;

alter table singer add constraint fk_id foreign key(hit_song_id) references song(id);

select singer.id "순번", singer.name "가수", song.title "제목", song.price "가격" from singer join song on singer.hit_song_id=song.id;

update singer set hit_song_id=2 where name='이무진';
update singer set name='아이유' where id=2;
update singer set hit_song_id=5 where name='아이유';
