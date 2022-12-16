-- »èÁ¦
create or replace procedure delete_person
( mynum in int )
is begin delete from simple_test where num = mynum;
end delete_person;

¤±