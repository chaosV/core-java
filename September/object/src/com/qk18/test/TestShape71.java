package com.qk18.test;

public class TestShape71 {

	public static void main(String[] args) {
		Circle71 c = new Circle71();
		c.setRadius(1.0);
		c.getArea();
		c.getPerimeter();
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());

		Rectangle71 r = new Rectangle71();
		r.setLength(2.0);
		r.setWidth(1.0);
		r.getArea();
		r.getPerimeter();
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		
		Square71 s=new Square71();
		s.setSide(3.0);
		s.getSide();
		System.out.println(s.getSide());

	}

}
