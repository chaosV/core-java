package com.qk18.test;

public class MovablePoint implements Movable {
	public int x;
	public int y;
	public int xspeed;
	public int yspeed;

	public void moveUp() {
		y=y+yspeed;
		
	}

	public void moveDown() {
		x=x-xspeed;
		
	}

	public void moveLeft() {
		y=y-yspeed;
	}

	public void moveRight() {
		y=y+yspeed;
	}

	public MovablePoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public MovablePoint(int x, int y, int xspeed, int yspeed) {
		this.x = x;
		this.y = y;
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}

	public int getXspeed() {
		return xspeed;
	}

	public void setXspeed(int xspeed) {
		this.xspeed = xspeed;
	}

	public int getYspeed() {
		return yspeed;
	}

	public void setYspeed(int yspeed) {
		this.yspeed = yspeed;
	}
	
	public String toString(){
		return ("( "+x+" ,"+y+")");
	}
}
