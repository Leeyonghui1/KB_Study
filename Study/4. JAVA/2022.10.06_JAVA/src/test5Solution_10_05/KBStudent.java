package test5Solution_10_05;

// ���� ��Ű���ȿ����� ����� �� import �ʿ����
// �ٸ� ��Ű������ Ŭ������ ��ӹ�����
// import �ٸ���Ű����.�θ�Ŭ������;
// import�� ���� ���� ������
// public class �ڽ�Ŭ���� extends �ٸ���Ű����.�θ�Ŭ������
public class KBStudent extends Student {
	private String gender;
	private String education; // �з�
	
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String getEducation() {return education;}
	public void setEducation(String education) {this.education = education;}

	public void attend(String att)
	{
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!"); 
	}
}
