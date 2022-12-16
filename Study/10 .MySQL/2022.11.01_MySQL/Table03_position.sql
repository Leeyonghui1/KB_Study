create table aposition
(
    po_code   varchar(3)   primary key,
    name      varchar(30)  not null
);

insert into aposition values('101','레지던트');
insert into aposition values('102','치프');
insert into aposition values('103','펠로우');
insert into aposition values('104','과장');
insert into aposition values('105','부원장');
insert into aposition values('106','원장');
insert into aposition values('201','간호사');
insert into aposition values('202','수간호사');
insert into aposition values('203','간호과장');
insert into aposition values('204','간호부장');

select po_code 직급코드, name 직급명 from aposition;

