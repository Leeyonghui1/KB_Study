package test4;

public class Student {
	private int age;
	private String Name;
	
	public String getName() {return Name;}
	public void setName(String name) {Name = name;}
	public int getAge() {return age;}
	public void setAge(int age) throws Exception 
	{
		if(age <= 0)
			throw new Exception("오류발생!");
		else
			this.age = age;
	}
	
}
