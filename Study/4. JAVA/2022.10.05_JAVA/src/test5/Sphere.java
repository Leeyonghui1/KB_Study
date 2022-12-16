package test5;

import practice1.Circle;

public class Sphere extends Circle {

	public Sphere(int r) {
		super(r);
	}
	
	public double getVolume()
	{
		return (double)4/3*getPI()*Math.pow(getR(), 3);
	}
}
