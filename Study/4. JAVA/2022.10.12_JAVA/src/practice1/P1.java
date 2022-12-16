package practice1;

public class P1 {
	//예외처리(오류발생시 처리) 방법 :: try catch
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		try {
			a = 10;
			b = 0;
			System.out.println("c 값을 구해보자");
			c = a/b;  // 에러 발생지점
			// 만약 try catch 구문이 아닐 때
			// 오류가 발생하면 프로그램이 바로 종료
			// try catch 구문을 사용해서 오류가 발생해도 프로그램 끝까지 진행 후 종료
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("이 부분에 문제 있음");
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(c);
	}

}
