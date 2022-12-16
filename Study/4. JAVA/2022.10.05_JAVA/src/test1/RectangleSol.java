package test1;

public class RectangleSol {
	// 인스턴스변수 :: w, h는 인스턴스별로 값이 다르다.
	private int w;
	private int h;
	
	// 생성자
	public RectangleSol() {
		
	}
	// w나h 하나만 입력하는 경우 정사각형으로 간주
	public RectangleSol(int wh) {
		//this.w = wh;
		//this.h = wh;
		setW(wh);
		setH(wh);
	}
	public RectangleSol(int w, int h) {
		//this.w = w;
		//this.h = h;
		setW(w);
		setH(h);
	}

	// 메소드
	// 인스턴스 메소드 :: 각각의 인스턴스마다 동작
	public int getW() {return w;}
	public int getH() {return h;}
	public void setW(int w) 
	{
		if(w <= 0)
		{
			System.out.println("오류!(W)");
			this.w = 0;
			return;
		}
		this.w = w;
	}
	public void setH(int h) 
	{
		if(h <= 0)
		{
			System.out.println("오류!(H)");
			this.h = 0;
			return;
		}
		this.h = h;
	}
	
	public int getArea()
	{
		if(w <= 0 || h <= 0)
		{
			System.out.println("Error!");
			return -1;
		}
		else if(w == h)
		{
			System.out.println("정사각형!");
		}
		return w*h;
	}
}
