package practice1;

public class P2 {

	// 두 개의 숫자를 입력받아서 총 합을 리턴하는 함수
	public static int sum(int start, int end) throws Exception
	{
		if(end < start)
			throw new Exception("start와 end 순서 잘못됨");
		else
		{
			int sum = 0;
			for(int i = start ; i <= end ; i++)
			{
				sum += i;
			}
			return sum;
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("안녕하세요");
			throw new Exception("에러!!"); // 에러를 일부러 던짐
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int num = sum(10,1);
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
