package practice1;

public class P3 {

	// s단부터 e단까지 구구단 출력 메소드
	// throws Exception :: 에러 메시지를 출력할 가능성이 있음
	public static void mul(int s, int e) throws Exception
	{
		if(s>e)
			throw new Exception("잘못된 매개변수! s가 더 큼");
		for(int i = s ; i <= e ; i++)
		{
			for(int j = 1 ; j <= 9 ; j++)
			{
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			mul(2,9);
			mul(9,2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
