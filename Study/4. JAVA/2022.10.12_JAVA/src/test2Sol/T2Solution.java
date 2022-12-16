package test2Sol;

import java.util.Scanner;

public class T2Solution {

	public static void main(String[] args) {
		 // 1. 3~8사이 숫자 중 홀수만 더하기
		int sum = 0;
		for(int i = 3; i <= 8 ; i++)
		{
			if(i%2 != 0)
				sum += i;
		}
		System.out.println(sum);
		
	
		// 2. 문자열 입력 후 역출력
		Scanner s = new Scanner(System.in);
		System.out.println("문자열 입력");
		String sentense = s.nextLine();
		// 역출력(반복문이용)
		for(int i = sentense.length()-1 ; i >= 0 ; i--)
			System.out.print(sentense.charAt(i));
		
		
		// 3. 바이트 값 입력 시 비트값 출력(1byte = 8bit)
		System.out.println("\n몇 바이트?");
		try {
			int num = s.nextInt();
			System.out.println(num+"바이트 = "+(num*8)+"비트");
		} catch (Exception e) {
			System.out.println("값 잘못 입력함");
		}
		
		s.close();
	}
}
