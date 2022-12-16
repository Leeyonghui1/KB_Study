class Student1{
	// 멤버 변수 선언부
	private String name1;
	private int number1;
	private String major1;
	
	// 멤버 함수 선언부
	public String getN() {return this.name1;}
	public int getNum() {return this.number1;}
	public String getM() {return this.major1;}
	
	// 생성자 선언부
	public Student1(String n, int num, String m) {
		this.name1 = n;
		this.number1 = num;
		this.major1 = m;
	}
	
}


public class T1Solution {
	public static void main(String args[]) {
		// 객체 생성부
		Student1 st = new Student1("Lee", 123, "기계");
		
		// 출력 부분
		System.out.println(st.getN());
		System.out.println(st.getNum());
		System.out.println(st.getM());
		
	}
	

}
