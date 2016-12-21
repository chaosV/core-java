package com.qk;

public class Point {
	public float x;
	public float y;
	
	public Point(){
		
	}
	
	
	public Point(float x,float y){
		this.x=x;
		this.y=y;
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x,float y){
		this.x=x;
		this.y=y;
	}
	
	public float[] getXY(){
		float[] getXY={x,y};
		return getXY;
	}
	
	public String toString(){
		return ("( "+x+","+y+" )");
	}
}
