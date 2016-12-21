package com.qk;

public class Shape {
	public String color;
	public boolean filled;
	
	public Shape(){
		
	}
	
	
	public Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled(){
		return true;
	}
	
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	
	public String toString(){
		return color;
	}
}
