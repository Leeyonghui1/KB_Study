-- update
-- or replace�� �������� �����ϰ� ��Ÿ ���� �� �ٽ� ����ų� GUI���� ���� ����
create procedure update_person
(
    mynum in int,
    changename varchar2
    )
is tempvar varchar2(20):= '�л�';
begin tempvar:= changename || tempvar;
update simple_test set name=tempvar where num=mynum;
end update_person;
-- || : ���� �̾���̱�