select m_code �����ڵ�, name ������ from major;

select pt_code �����ڵ�, name ������ from ptype;

select po_code �����ڵ�, name ���޸� from position;

select person_num ��Ϲ�ȣ, pt_code �����ڵ�, doc_id �ǻ��ȣ, nur_id ��ȣ���ȣ, 
       pat_id ȯ�ڹ�ȣ, m_code �����ڵ�, name �̸�, gen ����, age ����,
       phone ��ȭ��ȣ, po_code �����ڵ�
       from person;
       
var o_cursor refcursor 
exec select_person('�ְ�â��', :o_cursor)
print o_cursor;

select count_room() �����Կ���ȯ�ڼ� from dual;

select avg(age) from person where gen = 'F';
select person_num ��Ϲ�ȣ, pt_code �����ڵ�, doc_id �ǻ��ȣ, nur_id ��ȣ���ȣ, 
       pat_id ȯ�ڹ�ȣ, m_code �����ڵ�, name �̸�, gen ����, age ����,
       phone ��ȭ��ȣ, po_code �����ڵ�
       from person 
       where age <= (select avg(age) from person where gen = 'F') and gen = 'F';
             
select * from v_doctors;
select * from v_nurse;
select * from v_patients;

select id ��Ʈ��ȣ, time ����, v_doctors.�̸� ����ǻ�, v_nurse.�̸� ��簣ȣ��, 
       v_patients.�̸� ȯ��, symptoms ����, diagnosis ����, prescription ó��
       from treatchart
       join v_doctors on treatchart.doc_id = v_doctors.�ǻ��ȣ
       join v_nurse on treatchart.nur_id = v_nurse.��ȣ���ȣ
       join v_patients on treatchart.pat_id = v_patients.ȯ�ڹ�ȣ;
       