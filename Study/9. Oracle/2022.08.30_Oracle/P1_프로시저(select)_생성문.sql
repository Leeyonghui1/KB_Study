-- select ���ν����� cursor ��� �� ��ȯ
-- cursor��� �� ���ؼ� ����� ���
-- cursor��? sql����� �����ϴ� �޸��� ��ġ�� ����Ű�� ������

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



-- ���� ������ �߻��Ѵٸ�
-- �� �������� ��� set serveroutput on; �� ������ �� �ٽ� select ���ν����� ���� �ۼ��� �� ����