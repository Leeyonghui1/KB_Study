create table samsungpeople(
id number primary key,
name varchar2(30) not null,  -- 'not null' : 공백을 허용하지 않음
boss_id number);

select * from samsungpeople;

insert into samsungpeople values(1,'이건희',1);
insert into samsungpeople values(2,'홍라희',2);
insert into samsungpeople values(3,'이부진',1);
insert into samsungpeople values(4,'이재용',1);
insert into samsungpeople values(5,'신라호텔',3);
insert into samsungpeople values(6,'삼성전자',4);
insert into samsungpeople values(7,'수원삼성',4);
insert into samsungpeople values(8,'삼성라이온즈',4);

-- 셀프 조인 : 하나의 테이블에서 가상의 테이블을 생성하여 join
select a.name BOSS, b.name NAME from samsungpeople a join samsungpeople b on a.id=b.boss_id;
-- 'a.' / 'b.' : 하나의 테이블을 두개의 테이블로 구분하기 위해 임의로 정한 테이블 표시방법
commit;
-- 테이블 컬럼명 변경
-- alter table samsungpeople rename column boss_id to boss_id2;