package test5;

public class KBStudent extends Student {
	private String gender;
	private String education;
	private int attend;

	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String getEducation() {return education;}
	public void setEducation(String education) {this.education = education;}
	public int getAttend() {return attend;}
	public void setAttend(int attend) {this.attend = attend;}
	
	public void Attend(int attend)
	{
		if(attend == 1)
			System.out.println(getName()+" �л� ���̴� "+getAge()+"�̸� ������ "+getGender()+", �з��� "+getEducation()+", ���� �Խ�");
		else
			System.out.println(getName()+" �л� ���̴� "+getAge()+"�̸� ������ "+getGender()+", �з��� "+getEducation()+", ���� ���");
	}
	
	
}
