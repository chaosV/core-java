package com.qk18.test;

public class Circle71 extends Shape71 {
	public double radius;
	
	
	public Circle71(){
		
	}
	
	
	public Circle71(double radius){
		this.radius=radius;
	}
	
	public Circle71(double radius,String color,boolean filled){
		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter(){
		return Math.PI*radius*2;
	}
	
	public String toString(){
		return ("Բ�������"+getArea());
	}
}

