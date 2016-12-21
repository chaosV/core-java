package com.qk22;

public class Singleton {
	private  int a=0;
	private static Singleton singleton=new Singleton();
	
	
	void num(){
		a++;
		System.out.println(a);
	}
	
	private Singleton(){
		
	}
	
	public static Singleton temp(){
		return singleton;
		
	}
}
