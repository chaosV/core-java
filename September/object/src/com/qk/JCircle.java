package com.qk;

public class JCircle {
	public double radius;
	
	
	
	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public JCircle( ){
		
	}

	
	public JCircle(double radius){
		this.radius=radius;
	}
	
	
	public double getCircumference(double radius){
		return Math.PI*radius*radius;
	}
	
	
	
	public String toString(){
		return "Jcircle[radius=?]";
	}
}
