package test2Sol;

public class Dragon extends Cryptid implements Fliable, Runable {
	private String species;
	
	public String getSpecies() {return species;}
	public void setSpecies(String species) {this.species = species;}
	
	public void polymorph() {
		System.out.println(this.species+"�巡�� ����~");
	}
	
	@Override
	public void Run() {
		System.out.println("�巡���� ���� �ʴ´�...");
	}

	@Override
	public void Jog() {
		System.out.println("������...");
	}

	@Override
	public void Fly() {
		System.out.println("�ѹ� ���ƺ���");
	}

	@Override
	public void FlapWing() {
		System.out.println("�����ؼ� ���� ����.");
	}

	@Override
	public void sleep() {
		System.out.println("����� ȥ����.");
	}

}
