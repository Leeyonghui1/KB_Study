package test1;

public class Rectangle {
	private int w;
	private int h;
	
	public Rectangle() {	
	}	
	public Rectangle(int w) {
		this.w = w;
	}
	/*
	public Rectangle(int h) {
		this.h = h;
	}
	*/
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}


	// 메소드
	public int getW() {return w;}
	public void setW(int w) {this.w = w;}
	public int getH() {return h;}
	public void setH(int h) {this.h = h;}
	public int getArea(int w, int h)
	{
		if(w == 0 || h == 0)
		{
			System.out.print("<오류> ");
			return -1;
		}
		if(w == h)
		{
			System.out.print("<정사각형> ");
			return w*h;
		}
		System.out.print("<그냥 사각형> ");
		return w*h;
	}
}
