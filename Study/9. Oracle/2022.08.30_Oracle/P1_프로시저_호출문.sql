-- ���ν��� ���������� ȣ���� �ϸ� ������ �߻���
-- �׷��� ���ν��� ȣ�⹮ ��ũ��Ʈ �����ϴ°� ����
exec add_person(4,'�̵���','010-7555-9999');
exec add_person(5,'�̵���','010-3555-9999');
exec add_person(6,'�̵���','010-2555-9999');

exec delete_person(3);

exec update_person(1,'��ȣ��');

-- o_cursor���� ��µ��� �ʴ´ٸ� ����,���� ����
-- ���� -ȯ�漳�� -�۲� -ǥ��-> ���鹮��ǥ�� üũ
var o_cursor refcursor
exec person_select('�̵���', :o_cursor) 
print o_cursor; 

select * from simple_test order by num;