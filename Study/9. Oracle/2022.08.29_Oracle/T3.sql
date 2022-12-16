create table food_category
(
    code number primary key,
    name varchar2(300) not null
    );
    
create table food_truck
(
    num number primary key,
    name varchar2(300) unique not null,
    price number,
    foodcode number not null,
    foreign key (foodcode) references food_category (code)
    );

insert into food_category values(1,'�ѽ�');
insert into food_category values(2,'�߽�');
insert into food_category values(3,'�Ͻ�');
insert into food_category values(4,'���');
insert into food_category values(5,'����');
insert into food_category values(6,'��Ÿ');
insert into food_category values(7,'���ľƴ�');

-- 1.
insert into food_truck values(1,'�����',7000,1);
insert into food_truck values(2,'��ä',5000,1);
insert into food_truck values(3,'�Ұ��',8000,1);
insert into food_truck values(4,'�����',5000,2);
insert into food_truck values(5,'���',7000,2);
insert into food_truck values(6,'«��',8000,2);
insert into food_truck values(7,'���',9000,3);
insert into food_truck values(8,'��������',10000,3);
insert into food_truck values(9,'�ʹ�',12000,3);
insert into food_truck values(10,'�Ľ�Ÿ',8000,4);
insert into food_truck values(11,'������ũ',15000,4);
insert into food_truck values(12,'���ٽ�',13000,4);
insert into food_truck values(13,'��Ʈ����',7000,5);
insert into food_truck values(14,'��ƮġŲ',20000,5);
insert into food_truck values(15,'��Ʈ����',18000,5);
insert into food_truck values(16,'���',4000,6);
insert into food_truck values(17,'���',7000,6);
insert into food_truck values(18,'������',5000,6);
insert into food_truck values(19,'Ÿ�̾�',30000,7);
insert into food_truck values(20,'��Ʈ��',700000,7);
insert into food_truck values(21,'�޴���',1800000,7);

select * from food_truck;
select * from food_category;
-- 2.
insert into food_category values(8,'����Ʈ');

-- 3.
insert into food_truck values(22,'����ũ',10000,8);
insert into food_truck values(23,'�Ƹ޸�ī��',2000,8);
insert into food_truck values(24,'��ī��',3000,8);
insert into food_truck values(25,'īǪġ��',5000,8);
insert into food_truck values(26,'��Ʈ����',4000,8);

-- 4.
select food_truck.name ���ĸ�, price, food_category.name �з� from food_truck
    join food_category on food_truck.foodcode = food_category.code;

-- 5.
select food_truck.name ���ĸ�, price, food_category.name �з� from food_truck
    join food_category on food_truck.foodcode = food_category.code
    order by price desc;
