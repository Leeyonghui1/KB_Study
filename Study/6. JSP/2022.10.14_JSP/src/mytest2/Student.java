package mytest2;

public class Student {
	private String name;
	private String pw;
	private String major;
	private String protocol;
	private String[] hobbys;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public String getMajor() 
	{
		switch(this.major)
		{
			case "math":
				this.major = "수학";
				break;
			case "eng":
				this.major = "영어";
				break;
			case "kor":
				this.major = "국어";
				break;			
		}
		return major;
	}
	public void setMajor(String major) {this.major = major;}
	public String getProtocol() {return protocol;}
	public void setProtocol(String protocol) {this.protocol = protocol;}
	public String getHobbys() 
	{
		String hobby = "";
		for(int i = 0 ; i < hobbys.length ; i++)
		{
			switch(hobbys[i])
			{
				case "cook":
					hobby+="요리";
					break;
				case "run":
					hobby+="달리기";
					break;
				case "swim":
					hobby+="수영";
					break;
				case "sleep":
					hobby+="잠자기";
					break;
			}
			if(i!=hobbys.length-1)
				hobby+=",";
		}
		return hobby;
	}
	public void setHobbys(String[] hobbys) {this.hobbys = hobbys;}
	
	
	
}
