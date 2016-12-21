package com.qk18.test;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;

	public void moveUp() {
		center.y=center.y+center.yspeed;
	}

	public void moveDown() {
		center.y=center.y-center.yspeed;
	}

	public void moveLeft() {
		center.x=center.x-center.xspeed;
	}

	public void moveRight() {
		center.x=center.x+center.xspeed;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MovablePoint getCenter() {
		return center;
	}

	public void setCenter(MovablePoint center) {
		this.center.x = center.x;
		this.center.y=center.y;
	}
	
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public String toString() {
		return ("Ô²µÄÃæ»ý£º "+getArea());
	}

}
