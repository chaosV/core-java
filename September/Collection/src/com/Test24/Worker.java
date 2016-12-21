package com.Test24;

public class Worker {
	private String name;
	private  int age;
	private  double salary;
	
	public Worker(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	public void work(){
		System.out.println("#"+name+"#"+"开始工作。。。。");
		System.out.println("#"+name+"#"+"完成工作。。。。");
	}
	
	public String toString(){
		return ("姓名："+name+" 年龄："+age+" 工资："+salary);
	}
	//重写equals
	public  boolean equals(Object obj){
		if(obj instanceof Worker){
			Worker worker=(Worker)obj;
			return(name.equals(worker.name));
		}
	}
}
