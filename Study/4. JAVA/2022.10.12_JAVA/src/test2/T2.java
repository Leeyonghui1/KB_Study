package test2;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// 1. 3~8 홀수 합
		int[] arr = new int[6];
		for(int i = 0 ; i < 6 ; i++)
		{
			arr[i] = 3+i;
		}
		int sum = 0;
		System.out.print("3에서 8사이 홀수는 [ ");
		for (int i : arr) {
			if(i%2 != 0)
			{
				System.out.print(i+" ");				
				sum += i;
			}
		}
		System.out.println("]");
		System.out.println("3에서 8사이 홀수 합 : "+sum);
		
		// 2. 문자열 역순 출력
		Scanner s = new Scanner(System.in);
		System.out.println("문자열 입력");
		String input = s.nextLine();
		StringBuffer sb = new StringBuffer(input);
		String reverse = sb.reverse().toString();
		System.out.println("문자열 역순 출력");
		System.out.println(sb);
		System.out.println(reverse);
		
		// 3. byte -> bit
		System.out.print("바이트 값 입력 : ");
		int input_byte = 0;
		input_byte = Integer.parseInt(s.nextLine());
		System.out.print("입련된 byte 값은 "+input_byte+"byte이며,");
		System.out.println(input_byte+"byte는 "+(8*input_byte)+"bit입니다.");
		
		s.close();
	}
}
