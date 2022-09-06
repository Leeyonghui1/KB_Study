select m_code 전공코드, name 전공명 from major;

select pt_code 직업코드, name 직업명 from ptype;

select po_code 직급코드, name 직급명 from position;

select person_num 등록번호, pt_code 직업코드, doc_id 의사번호, nur_id 간호사번호, 
       pat_id 환자번호, m_code 전공코드, name 이름, gen 성별, age 나이,
       phone 전화번호, po_code 직급코드
       from person;
       
var o_cursor refcursor 
exec select_person('최강창민', :o_cursor)
print o_cursor;

select count_room() 현재입원한환자수 from dual;

select avg(age) from person where gen = 'F';
select person_num 등록번호, pt_code 직업코드, doc_id 의사번호, nur_id 간호사번호, 
       pat_id 환자번호, m_code 전공코드, name 이름, gen 성별, age 나이,
       phone 전화번호, po_code 직급코드
       from person 
       where age <= (select avg(age) from person where gen = 'F') and gen = 'F';
             
select * from v_doctors;
select * from v_nurse;
select * from v_patients;

select id 차트번호, time 일자, v_doctors.이름 담당의사, v_nurse.이름 담당간호사, 
       v_patients.이름 환자, symptoms 증상, diagnosis 진단, prescription 처방
       from treatchart
       join v_doctors on treatchart.doc_id = v_doctors.의사번호
       join v_nurse on treatchart.nur_id = v_nurse.간호사번호
       join v_patients on treatchart.pat_id = v_patients.환자번호;
       