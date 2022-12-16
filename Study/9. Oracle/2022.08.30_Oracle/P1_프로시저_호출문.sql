-- 프로시저 생성문에서 호출을 하면 오류가 발생함
-- 그래서 프로시저 호출문 워크시트 생성하는게 좋다
exec add_person(4,'이동준','010-7555-9999');
exec add_person(5,'이동준','010-3555-9999');
exec add_person(6,'이동준','010-2555-9999');

exec delete_person(3);

exec update_person(1,'최호준');

-- o_cursor문이 출력되지 않는다면 띄어쓰기,엔터 문제
-- 도구 -환경설정 -글꼴 -표시-> 공백문자표시 체크
var o_cursor refcursor
exec person_select('이동준', :o_cursor) 
print o_cursor; 

select * from simple_test order by num;