select * from food;

-- delete��
-- update���� ���������� where���� ������ ��� ���� ����, rollback ����
-- drop : ���̺� ��ü�� ����� rollback(����) �Ұ���
-- truncate : ���̺� �����͸� ����� ���̺� column�� ������ ����, ������ ������ ������ rollback �Ұ���
delete from food where price = 7000;


-- ���̺� �÷� �߰�
alter table food add recipe varchar2(1000);
-- ���� �÷��� �Ӽ� ���� ����
alter table food modify price not null;

select * from food;