package my.hello.javastudy02;

import java.util.ArrayList;

public class P2 {

	public static void main(String[] args) {
		//배열
		// 선언과 동시에 크기가 정해짐
		int[] numbers = new int[5];
		// ArraryList
		// 배열과는 다르게 선언 당시엔 크기가 0
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// 값을 할당(배열)
		numbers[0] = 10;
		numbers[1] = 30;
		// 값을 읽기(배열)
		System.out.println("첫번째값:"+numbers[0]);
		
		// 값을 추가(ArrayList)
		nums.add(10);
		// js의 push처럼 새로운 값을 추가 , 임의의 위치를 지정해서 값을 추가하지는 못함
		nums.add(30);
		
		// 특정 위치의 값을 수정(ArrayList)
		nums.set(0, 20); // 첫번째 값을 20으로 수정
		System.out.println(nums.get(0));
		
		// foreach 적고 ctrl+space로 만드는 코드
		// 배열의 길이만큼 반복문 수행
		// 콜론(:) 앞에 있는 건 배열 안에 있는 구성요소들
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		// ArrayList 는 값을 삭제할 수 있음
		nums.remove(0);
		nums.add(100);
		nums.add(30);
		nums.add(30);
		nums.remove((Integer)30); // 값이 30인 것을 1개 삭제
		System.out.println("----");
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}

}
