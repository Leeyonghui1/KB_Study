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

insert into parkingfee values('����','���οϷ�');
insert into parkingfee values('�ȳ���','���ι̿Ϸ�');
insert into parking values(1,'123�� 1331','10:25','16:31','����');
insert into parking values(2,'234�� 1662','11:57','15:55','�ȳ���');
insert into parking values(3,'123�� 4827','17:22',' ','�ȳ���');
insert into parking values(4,'223�� 4827','17:22','18:00','����');

update parking set check_out='����' where parking_num = 2;
delete from parking where parking_num = 4;

select parking_num "�����ڸ���ȣ", car_num "������ȣ", intime "�����ð�", outtime "�����ð�", 
       parkingfee.check_fee "��ݳ��λ���" from parking 
       join parkingfee on parking.check_out=parkingfee.check_out;  



