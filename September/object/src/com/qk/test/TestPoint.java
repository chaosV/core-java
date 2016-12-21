package com.qk.test;

import com.qk.MovablePoint;
import com.qk.Point;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p=new Point();
		p.setXY(0.1f,0.2f);
		p.getXY();
		p.toString();
		System.out.println(p.toString());
		
		
		MovablePoint mp=new MovablePoint();
		mp.setXY(0.2f, 0.2f);
		mp.getXY();
		mp.move(0.2f, 0.2f, 0.1f, 0.1f);
		mp.toString();
		System.out.println(mp.toString());
		System.out.println(mp.move(0.2f, 0.2f, 0.1f, 0.1f));
	}

	

}
