package practice1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// 
		int a=0, b=0, c=0;
		
		// 1) 숫자를 잘못 입력한 경우
		// 2) 잘못된 연산을 한 경우
		// catch는 여러개 사용 가능
		// 단, 마지막은 Exception 혹은 Exception 밑에 Throwable 추가
		Scanner s = new Scanner(System.in);
		try {
			a = 10;
			System.out.println("b 입력");
			b = Integer.parseInt(s.nextLine());
			c = a/b;
		} catch (NumberFormatException e) {
			System.out.println("오류 원인 (포맷)" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("오류 원인 (연산)" + e.getMessage());
		} catch (Exception e) {
			System.out.println("뭔가 잘못됨");
			e.printStackTrace();	
		}
		System.out.println("과연 c 값은? " + c);
		s.close();
	}

}
