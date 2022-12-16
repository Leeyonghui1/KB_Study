select * from food;

-- delete문
-- update문과 마찬가지로 where절이 없으면 모든 내용 삭제, rollback 가능
-- drop : 테이블 자체를 지우고 rollback(복구) 불가능
-- truncate : 테이블 데이터만 지우고 테이블 column은 남겨져 있음, 하지만 삭제한 데이터 rollback 불가능
delete from food where price = 7000;


-- 테이블 컬럼 추가
alter table food add recipe varchar2(1000);
-- 기존 컬럼의 속성 변경 가능
alter table food modify price not null;

select * from food;