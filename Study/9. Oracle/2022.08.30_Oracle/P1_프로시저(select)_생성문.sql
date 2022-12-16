-- select 프로시저는 cursor 라는 걸 반환
-- cursor라는 걸 통해서 결과를 출력
-- cursor란? sql결과를 저장하는 메모리의 위치를 가리키는 포인터

create or replace procedure person_select
(
    myname in varchar2,
    o_cursor out SYS_REFCURSOR
)
is begin open o_cursor
for
select num,name,phone_number from simple_test where name = myname;
exception when others then
dbms_output.put_line('sql error : '|| sqlerrm);
end person_select;



-- 만약 오류가 발생한다면
-- 새 쿼리문을 열어서 set serveroutput on; 을 실행한 뒤 다시 select 프로시저를 새로 작성한 뒤 실행