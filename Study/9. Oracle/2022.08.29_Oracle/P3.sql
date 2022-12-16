create table food_category
(
    code number primary key,
    name varchar2(300) not null
    );
    
select * from food;
select * from food_category;

select code �з��ڵ�, name �з��� from food_category;

create table food_truck
(
    num int primary key,
    name varchar2(100) not null,
    price int,
    foodcode number not null,
    foreign key (foodcode) references food_category (code)
);

-- ������(sequence)
-- ������ ����, for���� ió�� ���� ���������� �þ�°�
-- ���������� ���� ���� �ʾƵ� �ڵ����� ���� ������
-- �������� ����ϸ鼭 �߰� ������ ������ �� ������ �߻��Ͽ��� ���ϴ� �۾��� �̷������ �ʴ���
-- ���������� �����Ѵ�, �׷��� table �����͸� �����ϰų� ������ �������� �������ش�
create SEQUENCE food_rownum;
-- .nextval : ++i�� ����. ������ ���� �־���
insert into food_truck valuese(food_rownum.nextval,'��Ʈ����',5000,5);
-- ���� ���̺� �ڵ尪 �� '50'�� ���� ������ ������� �ʴ´�
insert into food_truck valuese(food_rownum.nextval,'�������',3000,50);
insert into food_truck valuese(food_rownum.nextval,'Ÿ�̾�',30000,7);


-- join
-- �� ���̺��� ����Ǵ� Ű ���� �����ͼ�
-- �� ���� ��ġ�� �� ������
select food_truck.name ���ĸ�, price, food_category.name �з�
    from food_truck join food_category on food_truck.foodcode = food_category.code;