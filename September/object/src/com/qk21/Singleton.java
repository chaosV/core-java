package com.qk21;

public class Singleton {
	private int count=0;
	private static Singleton singleton=new Singleton();
	 
	public void daka(){
		count++;
		System.out.println(count);
	}
	//˽�л����캯��
	private Singleton(){
		
	}
	//�ṩһ����������ͳһ��ʵ��
	public static Singleton getInstance(){
		return singleton;
	}
}
