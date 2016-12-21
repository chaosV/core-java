package com.qk19;

public class Person implements Cloneable {
	String name;
	int age;
	
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	public Person(){
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected Object clone() throws CloneNotSupportedException{
		return (Person)super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p=new Person("zc",22);
		Person p1=(Person) p.clone();
		System.out.println(p);
		System.out.println(p1.age+p.name+p);
	}

}
