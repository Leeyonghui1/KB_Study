package test4Sol;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {return age;}
	// throws :: 이 메소드는 에러를 던질 가능성이 있다.
	public void setAge(int age) throws Exception 
	{
		if(age <= 0)
			throw new Exception("age값 오류"+age);
		this.age = age;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
