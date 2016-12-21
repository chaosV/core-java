package com.Test28;

public class Student {

	private String name;
	private int math;
	private int English;
	private int chinese;
	private  int sum=math+English+chinese;
	
	public Student(String name,int math,int English,int chinese,int sum){
		this.name=name;
		this.math=math;
		this.English=English;
		this.chinese=chinese;
		 
	}





	public int Compare(Student o1,Student o2){
		if(o1.sum>o2.sum)return 1;
		return -1;
	}
	

	public String toString(){
		return "ĞÕÃû£º"+name+"×Ü³É¼¨£º"+sum+"math:"+math+"English:"+English+"chinese:"+chinese;
	}
}
