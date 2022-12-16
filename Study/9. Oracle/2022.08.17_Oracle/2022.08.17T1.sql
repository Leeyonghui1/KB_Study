-- 1.
select * from student; 
commit;

-- 2. 
select * from student where age >= 10 and age < 20;
commit;

-- 3. ±èÇı¹Î»èÁ¦
delete from student where name='±èÇı¹Î';
commit;

-- 4. ¿À¼¼·æ ³ªÀÌ 20À¸·Î ¼öÁ¤
update student set age=20 where name='¿À¼¼·æ';
commit;