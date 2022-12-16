-- delete : 테이블 안 데이터를 지움(전체 or 일부분)
-- drop, truncate : 테이블를 삭제 , 복구불가
drop table student;

-- 테이블 저장하기
-- (1) 테이블 우클릭 -> 익스포트 -> 명령문복사 -> 전체선택후 실행
-- (2) cmd 이용
-- 기존 테이블 저장하기 : exp c##아이디(scott)/비밀번호(tiger) file=파일명(mybackup).dmp
-- 저장한 테이블 가져오기 : imp c##아이디/비밀번호 file=파일명.dmp full=y