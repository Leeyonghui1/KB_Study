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
			System.out.println(getName()+" 학생 나이는 "+getAge()+"이며 성별은 "+getGender()+", 학력은 "+getEducation()+", 현재 입실");
		else
			System.out.println(getName()+" 학생 나이는 "+getAge()+"이며 성별은 "+getGender()+", 학력은 "+getEducation()+", 현재 퇴실");
	}
	
	
}
