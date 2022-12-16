package test3Sol;

import java.util.Scanner;

public class T3Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째?");
		String num1 = s.nextLine();
		System.out.println("두번째?");
		String num2 = s.nextLine();
		
		int n1 = 0;
		int n2 = 0;
		try { // 입력된 값들을 Int형으로 바꾸기
			n1 = Integer.parseInt(num1);
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			System.out.println("잘못된 값 들어감");
			n1 = 0;
		}
		if(n1 != 0)
		{
			System.out.println(n1*(n2%10));
			System.out.println(n1*((n2/10)%10));
			System.out.println(n1*(n2/100));
			System.out.println(n1*n2);
		}
		System.out.println("프로그램 종료");
		System.out.println("=================");
		System.out.println("첫번째 숫자?");
		String num3 = s.nextLine();
		System.out.println("두번째 숫자?");
		String num4 = s.nextLine();
		
		
		// toCharArray || charAt , 아스키코드 '0'을 빼기
		// Character.getNumericValue('1')
		
		int n3 = 0;
		int n4 = 0;
		try {
			n3 = Integer.parseInt(num3);
			n4 = Integer.parseInt(num4);
			System.out.println(n3 * (num4.charAt(2)-'0'));
			System.out.println(n3 * (num4.charAt(1)-'0'));
			System.out.println(n3 * (num4.charAt(0)-'0'));
			System.out.println(n3 * n4);
		} catch (Exception e) {
			n3 = 0;
			System.out.println("숫자 오류!");
			e.printStackTrace();
		}
		System.out.println("프로그램 끝");
		
		s.close();
	}
}
