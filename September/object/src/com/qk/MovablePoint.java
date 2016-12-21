package com.qk;

public class MovablePoint extends Point {
	public float xspeed;
	public float yspeed;
	
	
	public MovablePoint(float x,float y,float xspeed,float yspeed){
		this.x=x;
		this.y=y;
		this.xspeed=xspeed;
		this.yspeed=yspeed;
	}
	
	public MovablePoint(float xspeed,float yspeed){
		this.xspeed=xspeed;
		this.yspeed=yspeed;
	}
	
	public MovablePoint(){
		
	}

	public float getXspeed() {
		return xspeed;
	}

	public void setXspeed(float xspeed) {
		this.xspeed = xspeed;
	}

	public float getYspeed() {
		return yspeed;
	}

	public void setYspeed(float yspeed) {
		this.yspeed = yspeed;
	}
	
	public void setSpeed(float xspeed,float yspeed){
		this.xspeed=xspeed;
		this.yspeed=yspeed;
	}
	
	public float[] getSpeed(){
		float[] getSpeed={xspeed,yspeed};
		return getSpeed;
	}
	
	public String toString(){
		return ("( "+x+" ,"+y+")"+" ,speed=("+xspeed+" ,"+yspeed+" )");
	}
	
	public MovablePoint move(float x,float y,float xspeed,float yspeed){
		x+=xspeed;
		y+=yspeed;
		return this;
	}
}
