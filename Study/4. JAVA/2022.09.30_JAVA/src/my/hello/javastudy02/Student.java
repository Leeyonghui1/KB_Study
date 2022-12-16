package my.hello.javastudy02;

public class Student{
	// name, age, score
	private String name;
	private int age;
	private double score;
	
	// 만약 속성들이랑 getter,setter만 적었다면 아래와 같이 아무것도 없는 생성자가 자동으로 만들어진것
	public Student() {
		
	}
	// 생성자
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	// 오버로딩
	// 생성자명이 똑같고 매개변수 타입,개수를 다르게 정의
	public Student(String name){
		this.name = name;
	}
	
	
	
	// alt+shift+s 누른상태에서 r키
	// 마우스 오른쪽 클릭 -> Source -> Generate Getter and Setter
	// Getter Setter
	public String getName() {return name;}
	public String getName(String title) {return name+title;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getScore() {return score;}
	public void setScore(double score) {this.score = score;}
	
}