package test3_4;

public class Dog extends Animal {
	private String hairColor;

	public String getHairColor() {return hairColor;}
	public void setHairColor(String hairColor) {this.hairColor = hairColor;}
	
	public void bark()
	{
		System.out.println(this.hairColor+"甫 瑞朝府哥 港港港");
	}
}
