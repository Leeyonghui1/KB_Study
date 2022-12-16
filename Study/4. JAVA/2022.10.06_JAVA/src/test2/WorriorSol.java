package test2;

public class WorriorSol extends Novice {
	private int power;

	public int getPower() {return power;}
	public void setPower(int power) {this.power = power;}
	
	public void punch()
	{
		System.out.println(this.power+"만큼의 공격!");
	}
}
