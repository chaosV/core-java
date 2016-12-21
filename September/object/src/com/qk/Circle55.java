package com.qk;

public class Circle55 extends Shape {
	public double radius;
	
	
	public Circle55(){
		
	}
	
	
	public Circle55(double radius){
		this.radius=radius;
	}
	
	public Circle55(double radius,String color,boolean filled){
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
		return ("Ô²µÄÃæ»ý£º");
	}
}
