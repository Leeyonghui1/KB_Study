delete from food;
select * from food;

-- 1. 음식 10개 추가
insert into food(num,name,price) values(7,'오리구이',30000);
insert into food(num,name,price) values(8,'소고기구이',50000);
insert into food values(9,'오리찜',15000);
insert into food(num,price,name) values(10,9000,'오삼덮밥');
insert into food(num,name) values(11,'우엉무침');
insert into food(num,name,price) values(12,'민트초코덮밥',null);
insert into food values(13,'하와이안피자위의 파인애플','');
insert into food values(14,'연어초밥',12000);
insert into food values(15,'된장찌개',5000);
insert into food values(16,'돼지국밥',8000);

select * from food order by num;
select * from food order by price desc;
select * from food where price is not null;
select * from food where price is not null order by price desc;


-- 2. 메뉴이름에 김치 들어가는것만
select * from food where name like '%김치%';

-- 3. 가격 5000~7000 사이인것만
select * from food where price >= 5000 and price <= 7000;

-- 4. 가격데이터가 null 을 수정하기
update food set price = 1000 where price is null;

-- 5. num=1 메뉴이름 수정
update food set name = '맛있는 불고기' where num = 1;

select * from food;
commit;

show autocommit;

-- rollback 주의사항
-- 1. rollback은 가장 최근 commit지점으로 돌아감
-- 2. autocommit 기능이 켜져있다면 rollback 안먹힘 why? 추가 수정 삭제할때마다 commit하기 때문
