create table Book(
bookid number primary key,
bookname varchar2(40),
publisher varchar2(40),
price number);

create table customer(
custid number primary key,
name varchar2(40),
address varchar2(50),
phone varchar2(20));

-- fk(�ܷ�Ű)�� 2���� ���̺�
create table orders(
orderid number primary key,
custid number,
bookid number,
saleprice number,
orderdate date default sysdate,
foreign key(custid) references customer(custid),
foreign key(bookid) references book(bookid));

insert into book values(1,'�౸�� ����','�½�����',7000);
insert into book values(2,'�౸�ƴ� ����','������',13000);
insert into book values(3,'�౸�� ����','���ѹ̵��',22000);
insert into book values(4,'���� ���̺�','���ѹ̵��',35000);
insert into book values(5,'�ǰ� ����','�½�����',8000);
insert into book values(6,'���� �ܰ躰���','�½�����',6000);
insert into book values(7,'�߱��� �߾�','�̻�̵��',20000);
insert into book values(8,'�߱��� ��Ź��','�̻�̵��',13000);
insert into book values(9,'�ø��� �̾߱�','�Ｚ��',7500);
insert into book values(10,'Olympic Champions','Pearson',13000);


insert into customer values(1,'������','���� ��ü��Ÿ', '000-5000-0001');
insert into customer values(2,'�迬��','���ѹα� ����', '000-6000-0001');
insert into customer values(3,'��̶�','���ѹα� ������', '000-7000-0001');
insert into customer values(4,'�߽ż�','�̱� Ŭ������', '000-8000-0001');
insert into customer values(5,'�ڼ���','���ѹα� ����', null);

insert into Orders(orderid,custid,bookid) values(2,1,3); --1�� �� 3��å ����
insert into Orders(orderid,custid,bookid) values(3,2,5); --2�� �� 5��å ����
insert into Orders(orderid,custid,bookid) values(4,3,6); --3�� �� 6��å ����
insert into Orders(orderid,custid,bookid) values(5,4,7); --4�� �� 7��å ����
insert into Orders(orderid,custid,bookid) values(6,1,2); --1�� �� 2��å ����
insert into Orders(orderid,custid,bookid) values(7,4,8); --4�� �� 8��å ����
insert into Orders(orderid,custid,bookid) values(8,3,10); --3�� �� 10��å ����
insert into Orders(orderid,custid,bookid) values(9,2,10); --2�� �� 10��å ����
insert into Orders(orderid,custid,bookid) values(10,3,8); --3�� �� 8��å ����

select * from book;
select * from customer;
select * from orders;
