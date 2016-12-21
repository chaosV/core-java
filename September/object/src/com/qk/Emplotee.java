package com.qk;

import java.util.HashSet;
import java.util.Set;

import com.qk19.Dog;

public class Emplotee {
	int id;
public static	String firstName;
public static 	String lastName;
	int salary;
	
	public Emplotee(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void Employee(int id,String firstName,String lastName,int salary){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	
	public int getID(int id){
		return id;
	}
	
	public void getFirstName(String firstName){
		this.firstName=firstName;
	}
	
	
	public void getLastName(String lastName){
	}
	
	public void getName(String firstName,String lastName){
		System.out.println("firstName lastName");
	}
	
	public int Salary(int salary){
		return salary;
	}
	
	public void SetSalary(int salary){
		this.salary=salary;
	}
	
	public int getAnnualSalary(int salary){
		return salary*12;
	}
	
	public int raiseSalary(int percent,int salary){
		return salary=salary+salary*percent;
	}
	
	public String  toString(){
		return "Employee[id="+id+",name="+firstName+lastName+",salary="+salary+"]";
	}
	
	public int hashCode(){
		String a=firstName+lastName;
		return a.hashCode();
	}
	 public boolean equals(Object o) {
	 if (!(o instanceof Emplotee))
	 return false;
	
	 Emplotee d = (Emplotee) o;
	 return d.firstName == this.firstName && d.lastName == this.lastName;
	 }
	public static void main(String[] args){
		Emplotee e1=new Emplotee("z","c");
		Emplotee e2=new Emplotee("z","c");
		System.out.println(e1.equals(e2));
		
		Set set=new HashSet();
		set.add(e1);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}
}
