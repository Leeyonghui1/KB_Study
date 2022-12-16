package test5Solution_10_05;

public class Cuboid extends Rectangle {

	// 생성자 호출하게되면
	// super 키워드 이용해서 명시적으로 생성자를 생성안해도
	// 부모클래스의 생성자를 무조건 호출함
	public Cuboid() {
		// super 키워드가 없어도 암묵적으로 들어감
		// 위 내용은 부모클래스에 디폴트생성자가 있을때만 적용되는 부분인듯
	}
	
	private int z;
	
	public int getZ() {return z;}
	public void setZ(int z) {this.z = z;}
	
	public int getCuboidVolume()
	{
		return getW()*getH()*getZ();
	}

}
