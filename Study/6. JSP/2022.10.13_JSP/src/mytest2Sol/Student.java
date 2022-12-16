package mytest2Sol;

public class Student {
	private String name;
	private int age;
	private int number;
	
	public Student(String name, int age, int number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
	
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age+", 번호 : "+number;
	}
}
