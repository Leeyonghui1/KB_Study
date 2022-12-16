create table Book(
bookid number primary key,
bookname varchar2(40),
publisher varchar2(40),
price number
);

create table Customer(
custid number primary key,
name varchar2(40),
address varchar2(50),
phone varchar2(20) unique
);

insert into Book values(1,'�౸�� ����','�½�����',7000);
insert into Book values(2,'�౸�ƴ� ����','������',13000);
insert into Book values(3,'�౸�� ����','���ѹ̵��',22000);
insert into Book values(4,'���� ���̺�','���ѹ̵��',35000);
insert into Book values(5,'�ǰ� ����','�½�����',8000);
insert into Book values(6,'���� �ܰ躰���','�½�����',6000);
insert into Book values(7,'�߱��� �߾�','�̻�̵��',20000);
insert into Book values(8,'�߱��� ��Ź��','�̻�̵��',13000);
insert into Book values(9,'�ø��� �̾߱�','�Ｚ��',7500);
insert into Book values(10,'Olympic Champions','Person',13000);

insert into Customer values(1,'������','���� ��ü��Ÿ','000-5000-0001');
insert into Customer values(2,'�迬��','���ѹα� ����','000-6000-0001');
insert into Customer values(3,'��̶�','���ѹα� ������','000-7000-0001');
insert into Customer values(4,'�߽ż�','�̱� Ŭ������','000-8000-0001');
insert into Customer values(5,'�ڼ���','���ѹα� ����',null);

create table Orders(
orderid number primary key,
orderdate date default sysdate,
order_custid number, foreign key(order_custid) references Customer(custid),
order_bookid number, foreign key(order_bookid) references Book(bookid),
saleprice number
);

insert into Orders (orderid,orderdate,order_custid,order_bookid) values(1,'2014-07-01',1,1);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(2,'2014-07-03',1,3);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(3,'2014-07-03',2,5);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(4,'2014-07-04',3,6);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(5,'2014-07-05',4,7);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(6,'2014-07-07',1,2);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(7,'2014-07-07',4,8);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(8,'2014-07-08',3,10);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(9,'2014-07-09',2,10);
insert into Orders (orderid,orderdate,order_custid,order_bookid) values(10,'2014-07-10',3,8);

select * from Book;
select * from Customer;
select * from Orders;

select Orders.orderid �ֹ�����, Customer.name ���̸� , Book.bookname å�̸�, Orders.saleprice, Orders.orderdate �ֹ���¥
 from Orders join Customer on Orders.order_custid=Customer.custid join Book on Orders.order_bookid=Book.bookid
 order by orderid;
 
 commit;