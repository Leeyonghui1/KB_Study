package practice2;

public class Venusaur extends Ivysaur {
	@Override
	public void Move() {
		super.Run();
		System.out.println("��� ¡�׷���");
	}
	
	@Override
	public void Grow() {
		System.out.println("����� �� �ڶ�");
	}
	
	@Override
	public void Charming() {
		System.out.println("�ɲɲ�~ �̻��ز�~");
	}
}
