delete from food;
select * from food;

-- 1.
insert into food values(1,'±èÄ¡Âî°³',8000);
insert into food values(2,'µÈÀåÂî°³',7000);
insert into food values(3,'Ä®±¹¼ö',null);
insert into food values(4,'Á·¹ß',15000);
insert into food values(5,'±èÄ¡Àü',5000);
insert into food values(6,'°¨ÀÚÀü',7000);
insert into food values(7,'ÇÜ¹ö°Å',null);
insert into food values(8,'µÅÁö±èÄ¡Âî°³',11000);
insert into food values(9,'±èÄ¡ÆÄ½ºÅ¸',13000);
insert into food values(10,'µÅÁö±¹¹ä',9000);

-- 2.
select * from food where name like '%±èÄ¡%';


-- 3.
select * from food where price between 5000 and 7000;


-- 4.
update food set price = 1000 where price is null;


-- 5.
update food set name = '¸ÀÀÖ´Â ºÒ°í±â' where num = 1;
