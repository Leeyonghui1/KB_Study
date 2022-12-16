create table parkingfee
(
    check_out   varchar2(20) primary key,
    check_fee   varchar2(20) not null
);
    
create table parking
(
    parking_num number       primary key,
    car_num     varchar2(20) unique,
    intime      varchar2(20) null,
    outtime     varchar2(20) null,
    check_out   varchar2(20) not null
);

alter table parking add constraint fk_out foreign key(check_out) references parkingfee(check_out);

insert into parkingfee values('나감','납부완료');
insert into parkingfee values('안나감','납부미완료');
insert into parking values(1,'123다 1331','10:25','16:31','나감');
insert into parking values(2,'234마 1662','11:57','15:55','안나감');
insert into parking values(3,'123아 4827','17:22',' ','안나감');
insert into parking values(4,'223아 4827','17:22','18:00','나감');

update parking set check_out='나감' where parking_num = 2;
delete from parking where parking_num = 4;

select parking_num "주차자리번호", car_num "차량번호", intime "입차시간", outtime "출차시간", 
       parkingfee.check_fee "요금납부상태" from parking 
       join parkingfee on parking.check_out=parkingfee.check_out;  



