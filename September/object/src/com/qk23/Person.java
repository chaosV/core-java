package com.qk23;

public class Person implements Cloneable{
	public String name;
	public int age;
	
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
//	public Object clone(){
//		Object o=null;
//		try{
//			o=super.clone();
//		}catch (CloneNotSupportedException e){
//			//e.printStackTrace();
//			System.out.println(e.toString());
//		}
//		return o;
//
//		
//	}

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

	public static void main(String[] args){
		Person p=new Person();
		p.setAge(20);
		p.setName("zc");
		System.out.println(p.name +p.age);
		Person p1;
		try {
			p1 = (Person)p.clone();
			p1.setName("cz");
			p1.setAge(22);
			System.out.println(p1.name +p1.age);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
