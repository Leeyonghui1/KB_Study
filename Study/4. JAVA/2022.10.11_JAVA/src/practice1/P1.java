package practice1;

import java.util.Scanner;

public class P1 {

	// 예외처리
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 입력한 문자열을 숫자로 바꾸는 두 가지 방식
		// 1) nextInt
		System.out.println("숫자 입력");
		int num = s.nextInt();
		// nextInt 다음 nextLine 입력인 안됨(엔터 버퍼키 때문)
		//[s.nextLine(); // 엔터 버퍼키 지우기]
		String name = s.nextLine();
		System.out.println("num="+num+", name="+name);
		// 2) Integer.parseInt
		
		try {
			System.out.println("다시 숫자 입력");
			int age = Integer.parseInt(s.nextLine());
			System.out.println("문자열 입력");
			String alias = s.nextLine();
			System.out.println("age="+age+", alias="+alias);
			
			System.out.println("문자열을 숫자로 변환");
			age = Integer.parseInt("이동준"); // 에러 발생			
		} catch (Exception e) {
			System.out.println("age값 오류");
			e.printStackTrace(); // 오류출력
			// 오류문구만 출력하고 프로그램은 계속 진행
		}
		
		System.out.println("끝");
		s.close();
	}

}
