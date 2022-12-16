-- 1. 음식 이름 중 민트 들어가면 삭제
delete from food where name like '%민트%';

-- 2. 음식 이름 중 하와이안 들어가면 삭제
delete from food where name like '%하와이안%';

-- 3. 가격이 10000원 초과 시 삭제
delete from food where price > 10000;

-- 4. 음식가격 5000원 이하이면 recipe 'msg추가'로 수정
update food set recipe = 'msg추가' where price <= 5000;

-- 5. 가격 오름차순으로 출력
select * from food order by price;