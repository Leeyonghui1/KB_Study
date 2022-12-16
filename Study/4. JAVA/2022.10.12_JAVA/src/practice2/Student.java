package practice2;

public class Student {
	private String Name;
	private int age;
	
	public Student(String name, int age) {
		this.Name = name;
		this.age = age;
	}

	public String getName() {return Name;}
	public void setName(String name) {Name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	// Object 클래스의 toString 메소드 오버라이딩
	@Override
	public String toString() {
		return "이름:"+this.Name+", 나이:"+this.age;
	}
	
}
