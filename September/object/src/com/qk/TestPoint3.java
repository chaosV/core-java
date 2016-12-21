package com.qk;

public class TestPoint3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p=new Point2D();
		p.setXY(0.1f,0.2f);
		p.getXY();
		p.toString();
		System.out.println(p.toString());
		
		
		Point3D p3=new Point3D();
		p3.setXYZ(0.1f, 0.2f, 0.3f);
		p3.getXYZ();
		p3.toString();
		System.out.println(p3.toString());
	}

}
