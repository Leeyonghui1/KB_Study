package practice2;

// UnivStudent클래스에서 name,age 속성을 따로 적지않아도
// Student 클래스로부터 상속받았기 때문에 
// UnivStudent 클래스 속성은 name,age,hakbeon으로 구성
// 상속받은 자식클래스(UnivStudent)는 부모클래스(Student)의 메소드도 포함
public class UnivStudent extends Student {
	private String hakbeon;

	// 메소드
	public String getHakbeon() {return hakbeon;}
	public void setHakbeon(String hakbeon) {this.hakbeon = hakbeon;}
	
}
