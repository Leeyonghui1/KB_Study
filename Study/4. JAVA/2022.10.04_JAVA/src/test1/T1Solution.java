package test1;

import java.util.Scanner;

public class T1Solution {

	public static void main(String[] args) {
		// �迭�� �ִ�, �ּҰ� ���ϱ�
		int[] numbers = new int[5]; // ���� 5�� �����ϴ� �迭
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// numbers �迭�� [0,0,0,0,0]�� �� �ִµ�
		// ���� 0�� ���� ��쵵 �����Ƿ� numbers�� ���� �ְ�
		// max,min ���� �� ��
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < numbers.length ; i++)
		{
			System.out.println(i+1+"��° �� �Է�");
			numbers[i] = s.nextInt();
		}
				
		int max = numbers[0];
		int min = numbers[0];
		// foreach��
		for (int i : numbers) {
			if(i>max)
				max = i;
			if(i<min)
				min = i;
			}
		// for��
		for(int i = 1 ; i < numbers.length ; i++)
		{
			if(numbers[i] > max)
				max = numbers[i];
			if(numbers[i] < min)
				min = numbers[i];
		}
				
		System.out.println("�ִ��� "+ max);
		// String.format :: c�� printf�� ����
		System.out.println(String.format("�ּڰ��� %d\n",min));
		s.close();

	}

}
