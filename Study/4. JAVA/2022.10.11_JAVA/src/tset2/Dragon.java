package tset2;

public class Dragon extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		System.out.println(getName()+"�� �޸��� ��ŭ��ŭ");
	}

	@Override
	public void Jog() {
		System.out.println(getName()+"�� �ȱ� ������");
	}

	@Override
	public void Fly() {
		System.out.println(getName()+"�� ȯ������ ���� �ؾ־־�");
	}

	@Override
	public void FlapWing() {
		System.out.println(getName()+"�� ��� ������ Ǫ����");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"�� �ؾ׽ؾ� ");
	}
	
	public void printInfo() {
		System.out.println("�巡���� ����");
		System.out.println("�̸� : "+ getName());
		System.out.println("���� : "+ getAge()+"��");
	}

}
