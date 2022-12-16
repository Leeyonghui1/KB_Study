import java.util.Scanner; // 입력하기위해서 선언해야함

public class HelloWorld {
	// 메인함수 선언
	public static void main(String argsp[]) {
		/* 
		System.out.print("Hello World");
		System.out.printf("%s","Hello World\n");
		
		System.out.println("Hello World");
		System.out.printf("%s","Hello World");
		
		String name = "LeeYongHui";
		System.out.printf("%s",name);
		System.out.println("Hello"+name);
		System.out.print("Hello "+name+"\n");
		
		int year = 2022;
		System.out.println("You are learning Java in "+year);
		System.out.printf("You are learning Java in %d\n",year);
		
		System.out.print("당신의 각오 말해보세요.\n");
		System.out.println("점심 뭐 먹지...?");
		
		
		Scanner s = new Scanner(System.in);  //  변수(s)가 새로운 스캐너라는걸 선언, s를 이용해서 값을 입력할수있음
		
		// 입력문(숫자) : 한 문장에 하나씩 입력받을수 있음
		int n = s.nextInt();          // int형 입력문
		short sh = s.nextShort();   // short형 입력문
		float f = s.nextFloat();    // float형 입력문
		double d = s.nextDouble(); // double형 입력문

	    // 입력문(문자)
		char c = s.next().charAt(0);   //char형 입력문
		s.nextLine();                  // 문자 입력사이 버퍼 지우기
		String s_st = s.next();        // string형 입력문(공백 포함X 입력문)
		s.nextLine();
		String s_str = s.nextLine();   // string형 입력문(공백 포함O 입력문)
		
		System.out.println(n);
		System.out.println(sh);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s_st);
		System.out.println(s_str);
		*/
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		String name = "이용희";
		System.out.println("Hello World,"+name);
		int year = 2022;
		System.out.println("You are learning Java with <" + year + ">");
		System.out.println("당신의 각오 말해보세요");
		System.out.println(str);
		
		
		//자바에서의 배열선언
		int a[] = new int[5];   // = (C언어) int a[5];
		
		int n = s.nextInt();
		int arr[] = new int[n];  // 가능
		
	}
}
