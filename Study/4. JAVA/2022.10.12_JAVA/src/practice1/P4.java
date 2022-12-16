package practice1;

public class P4 {
	
	public static void main(String[] args) {
		// finally
		// try/catch 구문에서 
		// catch 뒤에 finally구문을 만들어서 무조건 실행하는 명령문
		// DB 연결하는 과정에서나 쿼리문 날릴 때 예외생기면
		// finally 부분에 DB접속 끊는 코드를 입력
		
		int a=0,b=0,c=0,d=0;
		try {
			a = 10;
			c = a/b;
		} catch (Exception e) {
			System.out.println("잘못됨");
			return; // 프로그램 종료
		} finally {
			System.out.println("finally때문에 무조건 실행");			
		}
		System.out.println("여기는 안됨");
		System.out.println(c+d);
	}
}
