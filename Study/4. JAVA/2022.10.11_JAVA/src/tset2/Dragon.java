package tset2;

public class Dragon extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		System.out.println(getName()+"ÀÇ ´Þ¸®±â ¼ºÅ­¼ºÅ­");
	}

	@Override
	public void Jog() {
		System.out.println(getName()+"ÀÇ °È±â ¾î½½··¾î½½··");
	}

	@Override
	public void Fly() {
		System.out.println(getName()+"ÀÇ È¯»óÀûÀÎ ºñÇà ½Ø¾Ö¾Ö¾Þ");
	}

	@Override
	public void FlapWing() {
		System.out.println(getName()+"ÀÇ ¾î¼³ÇÂ ³¯°¹Áþ Çª´õ´ö");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"Àº ½Ø¾×½Ø¾× ");
	}
	
	public void printInfo() {
		System.out.println("µå·¡°ïÀÇ Á¤º¸");
		System.out.println("ÀÌ¸§ : "+ getName());
		System.out.println("³ªÀÌ : "+ getAge()+"»ì");
	}

}
