class Student{
	private String name;
	private int stu_number;
	private String gender;
	
	public Student(String n, int st_n, String g)
	{
		this.name = n;
		this.stu_number = st_n;
		this.gender = g;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}
	public void setStuNum(int stu_number) {this.stu_number = stu_number;}
	public int getStuNum() {return this.stu_number;}
	public void setGender(String gender) {this.gender = gender;}
	public String getGender() {return this.gender;}
	
}

public class T2 {
	public static void main(String args[]) {
		
		Student s1 = new Student("이동준",2009038033,"남");
		Student s2 = new Student("이제영",2007012034,"여");
		Student s3 = new Student("박준현",2002012034,"남");
		
		Student[] arr = new Student[3];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for(int i = 0 ; i < 3 ; i++)
			System.out.println(arr[i].getName() + " " +  arr[i].getStuNum() + " " +  arr[i].getGender());
		System.out.println();
		
		s1.setStuNum(2019038033);
		for(int i = 0 ; i < 3 ; i++)
			System.out.println(arr[i].getName() + " " +  arr[i].getStuNum() + " " +  arr[i].getGender());
		System.out.println();
		
		s2.setName("이용희");
		s2.setStuNum(2014030611);
		s2.setGender("남");
		s3.setName("장태연");
		s3.setStuNum(2014101011);
		s3.setGender("남");
			
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println("이름: " + arr[i].getName());
			System.out.println("학번: " + arr[i].getStuNum());
			System.out.println("성별: " + arr[i].getGender());
			System.out.println();
		}
		
	}

}
