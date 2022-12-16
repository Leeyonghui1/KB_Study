create table food_category
(
    code number primary key,
    name varchar2(300) not null
    );
    
select * from food;
select * from food_category;

select code 분류코드, name 분류명 from food_category;

create table food_truck
(
    num int primary key,
    name varchar2(100) not null,
    price int,
    foodcode number not null,
    foreign key (foodcode) references food_category (code)
);

-- 시퀀스(sequence)
-- 일종의 변수, for문의 i처럼 값이 순차적으로 늘어나는것
-- 수동적으로 값을 넣지 않아도 자동으로 값이 증가함
-- 시퀀스를 사용하면서 추가 수정을 진행할 때 오류가 발생하여서 원하는 작업이 이루어지지 않더라도
-- 시퀀스값이 증가한다, 그래서 table 데이터를 수정하거나 시퀀스 시작점을 수정해준다
create SEQUENCE food_rownum;
-- .nextval : ++i랑 같음. 증가된 값을 넣어줌
insert into food_truck valuese(food_rownum.nextval,'민트덮밥',5000,5);
-- 참조 테이블에 코드값 중 '50'이 없기 때문에 실행되지 않는다
insert into food_truck valuese(food_rownum.nextval,'오렌지찌개',3000,50);
insert into food_truck valuese(food_rownum.nextval,'타이어',30000,7);


-- join
-- 두 테이블에서 공통되는 키 값을 가져와서
-- 그 값이 겹치는 걸 보여줌
select food_truck.name 음식명, price, food_category.name 분류
    from food_truck join food_category on food_truck.foodcode = food_category.code;