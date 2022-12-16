package practice2;

public class P2 {

	public static void main(String[] args) {
		String a = "이동준";
		String b = "이동준";
		// c와 d는 데이터는 같지만 위치가 다름
		String c = new String("김보규");
		String d = new String("김보규");
		
		Student s1 = new Student("이동준",340);
		Student s2 = new Student("이동준",340);
		
		System.out.println(a==b); // t
		System.out.println(c==d); // f :: c랑 d가 다른 위치를 참조하기 때문
		System.out.println(s1==s2); // f
		
		System.out.println(a.equals(b)); // t
		// equals는 이름(데이터)만 비교해줌
		System.out.println(c.equals(d)); // t
		
		// s1과 s2는 서로 다른 위치를 참조하기 때문에 f
		// Object equals는 hash코드를 비교하는 메소드
		System.out.println(s1.equals(s2)); // f
		
		// 이름과 사번만 같으면 같은 객체라고 표시하는 equals를 재정의한 클래스를 만듦
		Worker w1 = new Worker("박지호","001");
		Worker w2 = new Worker("박지호","001");
		Worker w3 = new Worker("박지호","002");
		
		System.out.println(w1.equals(w2)); // t
		System.out.println(w1.equals(w3)); // f
		
	}
}
