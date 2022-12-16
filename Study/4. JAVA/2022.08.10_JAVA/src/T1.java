class Student{
	//멤버 변수(필드)
	private String name;
	private int number;
	private String major;
	
	//생성자
	public Student(String name, int number, String major) {
		this.name = "name";
		this.number = 1;
		this.major = "major";
	}
	
	//메소드
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setNumber(int number) {this.number = number;}
	public int getNumber() {return number;}
	public void setMajor(String major) {this.major = major;}
	public String getMajor() {return major;}
	
}


public class T1 {
	public static void main(String args[]) {
		Student s1 = new Student("name",1,"major");
		
		s1.setName("이용희");
		s1.setNumber(1234567);
		s1.setMajor("기계공학부");
		
		System.out.println("나의 이름은 " + s1.getName() + "입니다.");
		System.out.println("나의 학번은 " + s1.getNumber() + "입니다.");
		System.out.println("나의 전공은 " + s1.getMajor() + "입니다.");
		
	}

}
