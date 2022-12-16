import java.util.Scanner;
public class Java01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
		// 0802 복습
		// 출력문
		System.out.print("print() : 줄바꿈없음");
		System.out.println("println() : 줄바꿈 자동");
		int year = 2022;
		// C언어 출력문
		// printf("지금은 %d년입니다\n",year);
		// Java 출력문
		System.out.println("지금은 " + year + "년 입니다.");
		
		//입력문
		// Scanner 변수 선언
		// System.in : 사용자에게 입력을 요청
		// Scanner : 입력받은 값을 읽어서 시스템에게 전달
		
		// 주요 입력문
		String name = sc.next();   // 공백없는 문자열
		int age = sc.nextInt();
		boolean gender = sc.nextBoolean();
		double height = sc.nextDouble();
		char blood = sc.next().charAt(0);
		sc.nextLine();   // .nextLine() 앞에 다른형의 입력(.next, .next.charAt)이 있으면 공백라인(엔터)을 써줘야한다.
		String mood = sc.nextLine();  // 공백있는 문자열
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		if(gender == true)
			System.out.println("성별 : 남자");
		else
			System.out.println("성별 : 여자");
		
		//System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		System.out.println("혈액형 : " + blood);
		System.out.println("상태 : " + mood);
		
		// 배열 : 정적할당, 동적할당
		// C언어는 문법이 따로였지만, Java는 문법이 비슷
		int arr1[] = new int[5]; // 크기가 5인 배열 선언(정적할당)
		int num = sc.nextInt();
		int arr2[] = new int[num]; // 동적 배열
		
		
		//문자열 String
		// ex) 두 사람 이름 입력
		String mine = "Lee";
		String yours = "Jang";
		//첫 글자비교 : .charAt() 이용
		if(mine.charAt(0) == yours.charAt(0))
		{
			System.out.println("첫 글자가 똑같습니다.");
		}
		else
			System.out.println("첫 글자가 다릅니다.");
		// charAt() 함수 통해서 값 참조는 가능하지만 값 변경은 불가
		
		// toCharArry() : String 타입을 char형 배열을 변환
		char m[] = mine.toCharArray();
		char y[] = yours.toCharArray();
		
		if(m[0] >= 'A' && m[0]<='Z') 
		{
			m[0] = (char)(m[0]+32);
		}
		else 
			m[0] = (char)(m[0]-32);
		
		if(y[0] >= 'A' && y[0]<='Z') 
		{
			y[0] = (char)(y[0]+32);
		}
		else
			y[0] = (char)(y[0]-32);
		
		System.out.println(m);
		
		
		// length() : String형의 길이를 반환 , char형 문자열 인식불가
		System.out.println("이름 길이는 " + mine.length());
		
		// equals() : 기준문자열.equals(새로입력한문자열)
		String mine1 = "Lee";
		System.out.println("<mine과 mine1 동일하다>는"+ (mine == mine1));
		String mine2 = sc.nextLine();
		System.out.println("<mine과 mine2 동일하다>는"+ (mine == mine2));
		System.out.println("equals() 함수를 이용하면?");
		System.out.println("<mine과 mine2 동일하다>는"+ (mine.equals(mine2)));
		
		
		
		// do-while()문 : 한번은 무조건 실행한 뒤 조건을 만족하는지 판단
		// for, while문 : 특정 조건문을 만족해야만 실행가능
		int test = 0;
		// 조건을 만족하지 않아서 실행자체가 안됨
		while(test <= 5 && test != 0)
		{
			System.out.println(test);
			test++;
		}
		
		do {
			System.out.println(test);
			test++;
		}while(test <= 5 && test != 0);
		
		
		// switch문
		char score = sc.next().charAt(0);
		double number;
		switch(score)
		{
		case 'A': number = 4.0; break;
		case 'B': number = 3.0; break;
		case 'C': number = 2.0; break;
		case 'D': number = 1.0; break;
		default: number = 0.0; break;
		}
		System.out.println(number);
		*/
		
		// 2중 반복문
		int in = sc.nextInt();
		for(int i = 0 ; i < in ; i++)  //행 출력
		{
			for (int j = 0 ; j <= i ; j++)  // 열 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// swap -> 두 개의 변수값을 바꿈
		int a = 3;
		int b = 5;
		System.out.println("swap 하기 전 a = " + a + " b = " + b); // 3 5
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap 하기 후 a = " + a + " b = " + b); // 3 5
		
	}
	
}
