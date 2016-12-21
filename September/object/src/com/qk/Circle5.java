package com.qk;

public class Circle5 {
	public double radius=1.0;
	public String color="red";
	
	public Circle5(){
		
	}
	
	
	public  Circle5(double radius){
		this.radius=radius;
	}
	
	public  Circle5(double radius,String color){
		this.radius=radius;
		this.color=color;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	 public double getArea(){
		 return Math.PI*radius*radius;
	 }
	 
	 public String toString(){
		 return ("Circle[radius="+radius+"  color= "+color+" ]");
	 }
}
