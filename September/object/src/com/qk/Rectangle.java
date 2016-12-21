package com.qk;

public class Rectangle {
public static float length;
public static float width;

	
	public Rectangle(){
		
	}
	
	public Rectangle(float length,float width){
		this.length=length;
		this.width=width;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	
	public float getLength(float length){
		return length;
	}
	
	
	public float getWidth(float width){
		return width;
	}
	
	public void setWidth(float width){
		this.width=width;
	}
	
	public double getArea(float length,float width){
		return length*width;
	}
	
	public double perimeter(float length,float width){
		return length*2+width*2;
	}
	
	public void toString(float length,float width){
		System.out.print("Rectangle [length=?,width=?]");
	}
}
