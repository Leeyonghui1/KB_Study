package test2Sol;

public class Unicorn extends Cryptid implements Fliable, Runable {

	private String Color;
	
	public String getColor() {return Color;}
	public void setColor(String color) {Color = color;}
	
	public void cry() {
		System.out.println(this.Color+"�� ���� �𳯸���");
		System.out.println("������ ��Ҹ��� ����������~");
	}
	
	@Override
	public void Run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void Jog() {
		System.out.println("������");
	}

	@Override
	public void Fly() {
		System.out.println("����ϰ� ���ϴ�");
	}

	@Override
	public void FlapWing() {
		System.out.println("����ϰ� �۴��ŷ���");
	}

	@Override
	public void sleep() {
		System.out.println("������ ���� ���ڿ�");
	}

}
