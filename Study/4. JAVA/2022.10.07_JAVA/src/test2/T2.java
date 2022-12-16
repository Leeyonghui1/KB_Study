package test2;

public class T2 {

	public static void main(String[] args) {
		Teacher proT = new ProgramingTeacher();
		proT.setName("이용희");
		proT.setMajor("프로그래밍");
		
		Teacher mathT = new MathTeacher();
		mathT.setName("장태연");
		mathT.setMajor("수학");
		
		Teacher javaT = new JavaProgramingTeacher();
		javaT.setName("차승화");
		javaT.setMajor("자바");
		
		Teacher ranT = new Teacher() {
			public void Teach()
			{
				System.out.println("저는 "+getName()+"입니다.");
				System.out.println("저의 전공은 "+getMajor()+"입니다.");
				System.out.println("오늘은 무엇을 배우고 싶은가요?");
			}
		};
		ranT.setName("김성근");
		ranT.setMajor("척척박사");
				
		proT.Teach();
		mathT.Teach();
		javaT.Teach();
		ranT.Teach();
		}
}
