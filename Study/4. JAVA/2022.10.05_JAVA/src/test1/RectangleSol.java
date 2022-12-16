package test1;

public class RectangleSol {
	// �ν��Ͻ����� :: w, h�� �ν��Ͻ����� ���� �ٸ���.
	private int w;
	private int h;
	
	// ������
	public RectangleSol() {
		
	}
	// w��h �ϳ��� �Է��ϴ� ��� ���簢������ ����
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

	// �޼ҵ�
	// �ν��Ͻ� �޼ҵ� :: ������ �ν��Ͻ����� ����
	public int getW() {return w;}
	public int getH() {return h;}
	public void setW(int w) 
	{
		if(w <= 0)
		{
			System.out.println("����!(W)");
			this.w = 0;
			return;
		}
		this.w = w;
	}
	public void setH(int h) 
	{
		if(h <= 0)
		{
			System.out.println("����!(H)");
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
			System.out.println("���簢��!");
		}
		return w*h;
	}
}
