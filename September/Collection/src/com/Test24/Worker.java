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
		System.out.println("#"+name+"#"+"��ʼ������������");
		System.out.println("#"+name+"#"+"��ɹ�����������");
	}
	
	public String toString(){
		return ("������"+name+" ���䣺"+age+" ���ʣ�"+salary);
	}
	//��дequals
	public  boolean equals(Object obj){
		if(obj instanceof Worker){
			Worker worker=(Worker)obj;
			return(name.equals(worker.name));
		}
	}
}
