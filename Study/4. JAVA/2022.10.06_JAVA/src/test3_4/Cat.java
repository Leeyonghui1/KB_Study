package test3_4;

public class Cat extends Animal {
	private String eyeColor;

	public String getEyeColor() {return eyeColor;}
	public void setEyeColor(String eyeColor) {this.eyeColor = eyeColor;}
	
	public void meow()
	{
		System.out.println(this.eyeColor+"������ ������ �߿˾߿�");
	}
}