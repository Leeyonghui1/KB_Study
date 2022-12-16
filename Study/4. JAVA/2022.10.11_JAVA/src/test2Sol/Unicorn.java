package test2Sol;

public class Unicorn extends Cryptid implements Fliable, Runable {

	private String Color;
	
	public String getColor() {return Color;}
	public void setColor(String color) {Color = color;}
	
	public void cry() {
		System.out.println(this.Color+"빛 털을 흩날린다");
		System.out.println("영롱한 목소리의 히히히히힝~");
	}
	
	@Override
	public void Run() {
		System.out.println("멋지게 달립니다.");
	}

	@Override
	public void Jog() {
		System.out.println("총총총");
	}

	@Override
	public void Fly() {
		System.out.println("우아하게 납니다");
	}

	@Override
	public void FlapWing() {
		System.out.println("우아하게 퍼덕거려요");
	}

	@Override
	public void sleep() {
		System.out.println("영물은 잠을 안자요");
	}

}
