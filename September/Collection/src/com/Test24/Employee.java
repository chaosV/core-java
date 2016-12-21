package com.Test24;

public class Employee {
	private String name;
	private int num;
	private double salary;
	
	
	public Employee(){
		
		
	}
	
	public Employee(String name,int num,double salary){
		this.name=name;
		this.num=num;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
