package practice2;

// �������̽� ������ [�������̽���+able]�� ����
// �������̽�
// :: Ư���� ����� �����϶�� '�����'���� �˷��ִ°� (�߻�Ŭ������ ����������)
// 1) Ư�� ����� �����ϵ��� ��������� ����
// 2) ���� ����� ��������
// 3) �������̽����� ��ӵ� ����
public interface Animalable {
	// ������ ���� �Ұ�
	// ���������� public, static, final�� ���
	// �׸��� ������ ������ �ʱ�ȭ�������
	// �������̽� ������ getter,setter �����Ұ� 
	// --> �������̽� ������ �޼ҵ�� �ڵ������� abstract�޼ҵ�
	// --> ���� �޼ҵ� ���� �����ϰ� ���ǺҰ�, �׷��� getter&setter �����Ұ�
	int a = 1;
	final String name = "����";
	
	static int A() {return a;}
	public void Move();
	public void Run();
	public void Charming();
}
