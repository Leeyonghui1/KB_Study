package tset2;

public class Unicorn extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		System.out.println(getName()+"�� �޸��� �ٱ״�");
	}

	@Override
	public void Jog() {
		System.out.println(getName()+"�� �� ��ŷ ��ӻ��");
	}

	@Override
	public void Fly() {
		System.out.println(getName()+"�� ȭ���� ����Ƿ� ������~");
	}

	@Override
	public void FlapWing() {
		System.out.println(getName()+"�� ����� ������ Ǫ���");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"�� ����~~");
	}
	
	public void printInfo() {
		System.out.println("�������� ����");
		System.out.println("�̸� : "+ getName());
		System.out.println("���� : "+ getAge()+"��");
	}

}
