package com.qingke;

import java.util.Date;

public class Dog {
	//静态变量
	public static String typeDescription=".............";
	public String name;
	public String birthday;
	public String owner;
	//静态方法
//	public static int totalDogNumber(){
//		Dog d=new Dog();
//		d.name="zz";
//		return 0;
//	}
	public Dog(String name,String birthday){
		this.name=name;
		this.birthday=birthday;
	}
	public Dog(){
		
	}
}
