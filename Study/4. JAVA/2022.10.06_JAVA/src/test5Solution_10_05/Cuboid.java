package test5Solution_10_05;

public class Cuboid extends Rectangle {

	// ������ ȣ���ϰԵǸ�
	// super Ű���� �̿��ؼ� ��������� �����ڸ� �������ص�
	// �θ�Ŭ������ �����ڸ� ������ ȣ����
	public Cuboid() {
		// super Ű���尡 ��� �Ϲ������� ��
		// �� ������ �θ�Ŭ������ ����Ʈ�����ڰ� �������� ����Ǵ� �κ��ε�
	}
	
	private int z;
	
	public int getZ() {return z;}
	public void setZ(int z) {this.z = z;}
	
	public int getCuboidVolume()
	{
		return getW()*getH()*getZ();
	}

}
