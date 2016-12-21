package com.qk18.test;

public class Rectangle71 extends Shape71 {

	protected double width;
	protected double length;
	
	
	public Rectangle71(){
		
	}
	
	
	public Rectangle71(double width,double length){
		this.width=width;
		this.length=length;
	}
	
	public Rectangle71(double width,double length,String color,boolean filled){
		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
		
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea(){
		return width*length;
	}
	
	public String toString(){
		return ("长方形的面积：");
	}


	public double getPerimeter() {
		return (width+length)*2;
	}
}

