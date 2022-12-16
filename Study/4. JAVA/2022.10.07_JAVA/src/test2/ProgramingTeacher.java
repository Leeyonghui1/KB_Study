package test2;

public class ProgramingTeacher extends Teacher{

	@Override
	public void Teach() {
		System.out.println("저는 "+getName()+"입니다.");
		System.out.println("저의 전공은 "+getMajor()+"입니다.");
		System.out.println("오늘은 어떤 언어를 배울지 선택하세요");
	}	
}
