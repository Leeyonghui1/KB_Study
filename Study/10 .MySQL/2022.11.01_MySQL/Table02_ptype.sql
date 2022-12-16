create table ptype
(
    pt_code    varchar(3)     primary key,
    name       varchar(20)    not null
);

insert into ptype values('001','의사');
insert into ptype values('002','간호사');
insert into ptype values('003','환자');

select pt_code 직업코드, name 직업명 from ptype;
