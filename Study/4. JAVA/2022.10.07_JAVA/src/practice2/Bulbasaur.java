package practice2;

public class Bulbasaur implements Animalable, Plantable {

	@Override
	public void Grow() {
		System.out.println("�� ������ �ڶ�");
	}

	@Override
	public void Photosynthesis() {
		System.out.println("�ֶ�� �غ�");
	}

	@Override
	public void Move() {
		System.out.println("���ݾ���");
	}

	@Override
	public void Run() {
		System.out.println("��¦��¦");
	}

	@Override
	public void Charming() {
		System.out.println("������ �̻��ؾ�");
	}

}
