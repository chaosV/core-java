package com.qk;

import java.util.HashSet;
import java.util.Set;

import com.qk19.Dog;

public class Circle {
	public static double radius;
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static String color;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
		
	
	public Circle(double radius){
		this.radius=radius;
	}
		
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return 3.14*radius*radius;
	}
	public String toString(){
		return ("Circle[radius= "+radius+",color="+color+"]");
	}
	public int hashCode(){
		String a=Circle.radius+Circle.color;
		return a.hashCode();
	}
	
	 public boolean equals(Object o) {
	 if (!(o instanceof Circle))
	 return false;
	
	 Circle d = (Circle) o;
	 return d.radius == this.radius && d.color == this.color;
	 }
	
	public static void main(String[] args){
		Circle c1=new Circle(1.0,"red");
		Circle c2=new Circle(1.0,"red");
		Circle c3=new Circle(1.0,"red");
		System.out.println(c1.equals(c2));
		
		Set set=new HashSet();
		set.add(c1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	}
}
