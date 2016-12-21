package com.qk18.test;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft;
	private MovablePoint bottomRight;
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int xspeed;
	private int yspeed;

	public MovableRectangle(int x1, int x2, int y1, int y2, int xspeed, int yspeed) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		this.xspeed=xspeed;
		this.yspeed=yspeed;
	}

	public void moveUp() {
		y1=y1+yspeed;
		y2=y2+yspeed;
	}

	public void moveDown() {
		y1=y1-yspeed;
		y2=y2-yspeed;
	}

	public void moveLeft() {
		x1=x1-xspeed;
		x2=x2-xspeed;
	}

	public void moveRight() {
		x1=x1+xspeed;
		x2=x2+xspeed;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
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
		return ("("+x1+","+y1+"), ("+x2+","+y2+")");
	}
}
