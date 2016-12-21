package com.qk21;

public class Singleton {
	private int count=0;
	private static Singleton singleton=new Singleton();
	 
	public void daka(){
		count++;
		System.out.println(count);
	}
	//私有化构造函数
	private Singleton(){
		
	}
	//提供一个方法返回统一的实例
	public static Singleton getInstance(){
		return singleton;
	}
}
