package test3;

public class Circle {
	private int r;
	private final double pi = 3.14;
	
	public void setR(int r) 
	{
		if(r <= 0)
		{
			System.out.println("¿À·ù");
			this.r = 0;
		}
		else
			this.r = r;
	}
	public int getR() {return this.r;}
	public double getPi() {return this.pi;}
	
	public double getArea() {return pi*r*r;}
	public double getRound() {return 2*pi*r;}
	
}
