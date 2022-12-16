package test2;

public class Worrior extends Novice {
	private int power;

	public int getPower() {return power;}
	public void setPower(int power) {this.power = power;}
	
	public void punch()
	{
		System.out.println(get_Class()+"의 강력한 펀치");
	}
}
