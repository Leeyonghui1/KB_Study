package test2;

public class T2 {

	public static void main(String[] args) {
		Teacher proT = new ProgramingTeacher();
		proT.setName("�̿���");
		proT.setMajor("���α׷���");
		
		Teacher mathT = new MathTeacher();
		mathT.setName("���¿�");
		mathT.setMajor("����");
		
		Teacher javaT = new JavaProgramingTeacher();
		javaT.setName("����ȭ");
		javaT.setMajor("�ڹ�");
		
		Teacher ranT = new Teacher() {
			public void Teach()
			{
				System.out.println("���� "+getName()+"�Դϴ�.");
				System.out.println("���� ������ "+getMajor()+"�Դϴ�.");
				System.out.println("������ ������ ���� ��������?");
			}
		};
		ranT.setName("�輺��");
		ranT.setMajor("ôô�ڻ�");
				
		proT.Teach();
		mathT.Teach();
		javaT.Teach();
		ranT.Teach();
		}
}
