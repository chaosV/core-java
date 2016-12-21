package com.qk18.test;

public class TestMovable {

	public static void main(String[] args) {
		MovablePoint mp=new MovablePoint(2,2,1,1);
		mp.moveUp();
		mp.moveLeft();;
		mp.toString();
		System.out.println(mp.toString());
		
		
		MovableCircle mc=new MovableCircle();
		mc.setRadius(1);
//		mc.setCenter(1,1);
		//mc.setCenter(mp);
		mc.getArea();
		mc.toString();
		System.out.println(mc.toString());
		
		
		MovableRectangle mr=new MovableRectangle(1,1,2,2,1,1);
		mr.toString();
		System.out.println(mr.toString());

	}

}
