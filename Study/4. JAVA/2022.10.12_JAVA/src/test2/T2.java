package test2;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// 1. 3~8 Ȧ�� ��
		int[] arr = new int[6];
		for(int i = 0 ; i < 6 ; i++)
		{
			arr[i] = 3+i;
		}
		int sum = 0;
		System.out.print("3���� 8���� Ȧ���� [ ");
		for (int i : arr) {
			if(i%2 != 0)
			{
				System.out.print(i+" ");				
				sum += i;
			}
		}
		System.out.println("]");
		System.out.println("3���� 8���� Ȧ�� �� : "+sum);
		
		// 2. ���ڿ� ���� ���
		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ� �Է�");
		String input = s.nextLine();
		StringBuffer sb = new StringBuffer(input);
		String reverse = sb.reverse().toString();
		System.out.println("���ڿ� ���� ���");
		System.out.println(sb);
		System.out.println(reverse);
		
		// 3. byte -> bit
		System.out.print("����Ʈ �� �Է� : ");
		int input_byte = 0;
		input_byte = Integer.parseInt(s.nextLine());
		System.out.print("�Էõ� byte ���� "+input_byte+"byte�̸�,");
		System.out.println(input_byte+"byte�� "+(8*input_byte)+"bit�Դϴ�.");
		
		s.close();
	}
}
