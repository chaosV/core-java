package com.qk;

public class Square55 extends Shape {
	public double side;
	public Square55(){
		
	}
	
	public Square55(double side){
		this.side=side;
	}
	
	public Square55(double side,String color,boolean filled){
		this.side=side;
		this.color=color;
		this.filled=filled;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double side){
		
	}

	public void  setLenght(double side){
		
	}
	
	public String toString(){
		return ("正方形的面积：");
	}
}
