create table food
(
    num int primary key,
    name varchar2(50),
    price int
    );
    
-- 테이블명 뒤에 컬럼명을 적는이유
-- 1.명시적으로 컬럼들을 보여주기 위해서
insert into food(num,name,price) values(1,'불고기',7000);    
insert into food(num,name,price) values(2,'김치찌개',6000);
insert into food(num,name,price) values(3,'제육볶음',6000);

-- 2. 내가 원하는 순서대로 데이터 넣기 위해서
insert into food(price,num,name) values(10000,5,'황제정식');
-- 3. 내가 원하는 데이터만 넣기 위해서
insert into food(num,name) values(6,'랜덤'); 

select * from food;

-- 특정 column만 출력
select name, price from food;
select name from food;

-- food table의 column명은 name이지만 출력시 한글(메뉴)로 표시 가능
select name 메뉴 from food;

-- 6000원대로 먹을 수 있는 음식 출력
select * from food where price >= 6000 and price < 7000;
select * from food where price between 6000 and 6999;

-- 특정 데이터 하나만 조회해서 변경할 때 사용하는게 PK(primary key)
-- update문의 주의사항
-- where절(조건)이 없으면 수정할려고 했던 데이터의 column(name)에 속한
-- 모든 데이터(불고기,김치찌개,제육볶음)가 일괄 변경된다
update food set name='김치+제육' where num = 3;
select * from food;

-- 테이블의 컬럼순서를 알고 순서대로 데이터를 넣을거라면
-- 테이블명뒤 컬럼명 생략가능
insert into food values(4,'무생채',2000);

-- insert,update,delete문을 저장하는것
-- commit을 안하고 프로그램을 종료하면 데이터는 insert,update,delete 수행 이전으로 돌아감
commit;
