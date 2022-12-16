package test1;

import java.util.Scanner;

public class T1Solution {

	public static void main(String[] args) {
		// 배열의 최댓값, 최소값 구하기
		int[] numbers = new int[5]; // 숫자 5개 저장하는 배열
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// numbers 배열엔 [0,0,0,0,0]이 들어가 있는데
		// 값이 0이 없을 경우도 있으므로 numbers에 값을 넣고
		// max,min 지정 후 비교
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < numbers.length ; i++)
		{
			System.out.println(i+1+"번째 값 입력");
			numbers[i] = s.nextInt();
		}
				
		int max = numbers[0];
		int min = numbers[0];
		// foreach문
		for (int i : numbers) {
			if(i>max)
				max = i;
			if(i<min)
				min = i;
			}
		// for문
		for(int i = 1 ; i < numbers.length ; i++)
		{
			if(numbers[i] > max)
				max = numbers[i];
			if(numbers[i] < min)
				min = numbers[i];
		}
				
		System.out.println("최댓값은 "+ max);
		// String.format :: c의 printf와 유사
		System.out.println(String.format("최솟값은 %d\n",min));
		s.close();

	}

}
