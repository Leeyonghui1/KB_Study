delimiter $$
create procedure create_sequence(in the_name text)
modifies sql data 
deterministic 
begin 
delete from sequences where name = the_name; 
insert into sequences values(the_name,0);
end 
$$
select * from sequences;

# $$ :: 일종의 마침표
# 프로시저나 함수 만들고 같은 파일에 sql문 쓰고 싶으면 $$을 마지막에 써야함