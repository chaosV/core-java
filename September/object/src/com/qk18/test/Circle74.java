package com.qk18.test;

public class Circle74 implements GeometricObject74 {
	protected double radius;

	public Circle74(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	
	public double getPerimeter(){
		return Math.PI*radius*2;
	}
}
