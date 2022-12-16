package practice2;

public class P1 {

	public static void main(String[] args) {
		Student s = new Student("이동준",34);
		
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s); // 컴파일러에서 자동으로 toString으로 처리
		System.out.println(s.toString());
		// toString()으로 출력한 결과
		// --> practice2.Student@15db9742
		// :: Object 클래스에 원래 정의되어있는 메소드
		// :: 패키지명.클래스명@고유코드(변수가 갖는 메모리 내의 고유코드)
		
		
	}
}
