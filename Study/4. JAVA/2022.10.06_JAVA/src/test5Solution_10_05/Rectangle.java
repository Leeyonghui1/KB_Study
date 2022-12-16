package test5Solution_10_05;

public class Rectangle {
		private int w;
		private int h;
		
		public Rectangle() {
			System.out.println("네모 클래스 생성");
		}

		public Rectangle(int wh) {
			setW(wh);
			setH(wh);
		}
		public Rectangle(int w, int h) {
			setW(w);
			setH(h);
		}

	
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
