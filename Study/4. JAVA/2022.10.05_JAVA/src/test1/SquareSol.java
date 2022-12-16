package test1;

public class SquareSol {
	private int wh;
	
	
	// 생성자
	// 디폴트생성자 :: 아무것도 없는 생성자
	public SquareSol() {
		
	}
	public SquareSol(int wh) {
		//this.wh = wh;
		// 위와 같이 바로 값을 초기화하는 경우
		// 음수값을 그대로 초기화
		// 그래서 아래와 같이 
		// 음수예외처리를 한 set함수를 이용해서
		// wh값 초기화
		setWh(wh);
	}


	// 메소드
	public int getWh() {return wh;}
	public void setWh(int wh)
	{
		if(wh<=0)
		{
			System.out.println("잘못된 wh 값");
			this.wh = 0;
			return;
		}
		this.wh = wh;
	}
}
