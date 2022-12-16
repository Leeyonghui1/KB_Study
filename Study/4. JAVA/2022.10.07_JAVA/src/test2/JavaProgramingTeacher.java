package test2;

public class JavaProgramingTeacher extends ProgramingTeacher{
	public void Teach()
	{
		System.out.println("저는 "+getName()+"입니다.");
		System.out.println("저의 전공은 "+getMajor()+"입니다.");
		System.out.print("오늘은 오버라이딩, 오버로딩에 대해");
		System.out.println(" 배우는 시간입니다.");
	}
}
