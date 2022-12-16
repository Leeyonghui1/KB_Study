select * from mydbhakgwa;
select * from mydbstudent;

--1.학과 1개추가
insert into mydbhakgwa values('003','화공');

--2.학생 5명 추가
insert into mydbstudent values('0000000006','이용희',34,'002');
insert into mydbstudent values('0000000007','장태연',24,'003');
insert into mydbstudent values('0000000008','김보규',18,'003');
insert into mydbstudent values('0000000009','김성근',29,'003');
insert into mydbstudent values('0000000010','안서준',22,'002');

select mydbstudent.name, mydbhakgwa.name, age from mydbstudent join
mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

-- 3. 평균나이가 가장 많은 학과 출력 

-- 학생마다 학과명과 나이 출력
select mydbhakgwa.name, age from mydbstudent join
mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

-- 학과명과 나이만 있는 가상 테이블(뷰) : age_by_student 만들기
create view age_by_student as select mydbhakgwa.name, age from mydbstudent join
mydbhakgwa on mydbstudent.hakgwacode=mydbhakgwa.code;

select * from age_by_student;

-- 학과별 평균나이 출력
select name 학과명, avg(age) 평균나이 from age_by_student group by name;

-- 학과별 평균나이 가상 테이블
create view avg_age_gwa as select name, avg(age) avgAge from age_by_student group by name;

-- 학과별 평균나이 출력
select * from avg_age_gwa;

-- 가장 큰 평균나이 출력
select max(avgage) from avg_age_gwa;

-- 가장 큰 평균나이 값이랑 일치하는 행의 name파트 값 출력
select name from avg_age_gwa where avgage=(select max(avgage) from avg_age_gwa);

commit;
