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
			throw new Exception("�����߻�!");
		else
			this.age = age;
	}
	
}
