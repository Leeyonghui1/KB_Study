package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1Solution2 {

	public static void main(String[] args) {
		// 배열 : 크기가 고정되고 특정 인덱스에 값 수정
		// ArrayList : 크기가 고정되어 있지 않음
		// 대신 값이 이미 들어간 부분에 대해서 값 수정가능
		// 특정 부분 삭제가능 -> ArrayList 길이 변함
		
		// ArrayList 표기법
		// 1)
		//ArrayList<Integer> numbers = new ArrayList<Integer>();
		// 2) 2번 표기법은 다형성이랑 인터페이스 지식 필요
		List<Integer> nums = new ArrayList<Integer>();

		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(i+1+"번째 숫자 입력하기");
			nums.add(s.nextInt());
		}
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
		// 입력한 숫자 미만인 숫자를 ArrayList에서 삭제하기
		// 값을 삭제할 때는 역 for문을 사용
		System.out.println("몇 미만의 숫자를 지울까요?");
		int cutline = s.nextInt();
		for(int i = nums.size()-1 ; i >= 0 ; i--)
		{
			if(cutline > nums.get(i))
				nums.remove(i);
		}
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
	
		s.close();
	}

}
