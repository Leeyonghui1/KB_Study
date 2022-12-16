-- update
-- or replace를 안적으면 삭제하고 오타 수정 후 다시 만들거나 GUI에서 직접 수정
create procedure update_person
(
    mynum in int,
    changename varchar2
    )
is tempvar varchar2(20):= '학생';
begin tempvar:= changename || tempvar;
update simple_test set name=tempvar where num=mynum;
end update_person;
-- || : 글자 이어붙이기