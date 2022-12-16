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

insert into food_category values(1,'ÇÑ½Ä');
insert into food_category values(2,'Áß½Ä');
insert into food_category values(3,'ÀÏ½Ä');
insert into food_category values(4,'¾ç½Ä');
insert into food_category values(5,'±«½Ä');
insert into food_category values(6,'±âÅ¸');
insert into food_category values(7,'À½½Ä¾Æ´Ô');

-- 1.
insert into food_truck values(1,'ºñºö¹ä',7000,1);
insert into food_truck values(2,'ÀâÃ¤',5000,1);
insert into food_truck values(3,'ºÒ°í±â',8000,1);
insert into food_truck values(4,'ÀÚÀå¸é',5000,2);
insert into food_truck values(5,'¿ï¸é',7000,2);
insert into food_truck values(6,'Â«»Í',8000,2);
insert into food_truck values(7,'¶ó¸à',9000,3);
insert into food_truck values(8,'Â÷½´µ¤¹ä',10000,3);
insert into food_truck values(9,'ÃÊ¹ä',12000,3);
insert into food_truck values(10,'ÆÄ½ºÅ¸',8000,4);
insert into food_truck values(11,'½ºÅ×ÀÌÅ©',15000,4);
insert into food_truck values(12,'°¨¹Ù½º',13000,4);
insert into food_truck values(13,'¹ÎÆ®µ¤¹ä',7000,5);
insert into food_truck values(14,'¹ÎÆ®Ä¡Å²',20000,5);
insert into food_truck values(15,'¹ÎÆ®ÇÇÀÚ',18000,5);
insert into food_truck values(16,'±è¹ä',4000,6);
insert into food_truck values(17,'µ·±î½º',7000,6);
insert into food_truck values(18,'¶±ººÀÌ',5000,6);
insert into food_truck values(19,'Å¸ÀÌ¾î',30000,7);
insert into food_truck values(20,'³ëÆ®ºÏ',700000,7);
insert into food_truck values(21,'ÈÞ´ëÆù',1800000,7);

select * from food_truck;
select * from food_category;
-- 2.
insert into food_category values(8,'µðÀúÆ®');

-- 3.
insert into food_truck values(22,'ÄÉÀÌÅ©',10000,8);
insert into food_truck values(23,'¾Æ¸Þ¸®Ä«³ë',2000,8);
insert into food_truck values(24,'¸¶Ä«·Õ',3000,8);
insert into food_truck values(25,'Ä«ÇªÄ¡³ë',5000,8);
insert into food_truck values(26,'¹ÎÆ®ÃÊÄÚ',4000,8);

-- 4.
select food_truck.name À½½Ä¸í, price, food_category.name ºÐ·ù from food_truck
    join food_category on food_truck.foodcode = food_category.code;

-- 5.
select food_truck.name À½½Ä¸í, price, food_category.name ºÐ·ù from food_truck
    join food_category on food_truck.foodcode = food_category.code
    order by price desc;
