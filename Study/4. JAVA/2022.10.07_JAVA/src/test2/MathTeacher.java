package test2;

public class MathTeacher extends Teacher{

	@Override
	public void Teach() {
		System.out.println("저는 "+getName()+"입니다.");
		System.out.println("저의 전공은 "+getMajor()+"입니다.");
		System.out.println("오늘은 2차방정식을 배우는 시간입니다.");
	}
}
