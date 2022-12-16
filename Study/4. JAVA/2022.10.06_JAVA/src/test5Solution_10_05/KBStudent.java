package test5Solution_10_05;

// 동일 패키지안에서의 상속할 땐 import 필요없음
// 다른 패키지안의 클래스를 상속받을땐
// import 다른패키지명.부모클래스명;
// import를 쓰고 싶지 않을땐
// public class 자식클래스 extends 다른패키지명.부모클래스명
public class KBStudent extends Student {
	private String gender;
	private String education; // 학력
	
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String getEducation() {return education;}
	public void setEducation(String education) {this.education = education;}

	public void attend(String att)
	{
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!"); 
	}
}
