package test5;

import test1.RectangleSol;

public class Cuboid extends RectangleSol {
	private int z;

	public int getZ() {return z;}
	public void setZ(int z) {this.z = z;}
	
	public int getCuboidVolume()
	{
		return getW()*getH()*getZ();
	}

}
