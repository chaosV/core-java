package com.qk25;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name,int age){
		this.name =name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public int compareTo(Person o){
	   return this.name.compareTo(o.name);
		
	}
	
	
}


public class LearnSet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> hashset=new HashSet<>();
//		hashset.add("cat");
//		hashset.add("dog");
//		hashset.add("mouse");
//		System.out.println(hashset);
//		
//		Set<String> s=new LinkedHashSet<String>();
//		s.add("cat");
//		s.add("dog");
//		s.add("mouse");
//		System.out.println(s);
//		
//		Set<Person> p=new TreeSet<Person>();
//		p.add(new Person("a",1));
//		p.add(new Person("b",2));
//		p.add(new Person("c",3));
//		p.add(new Person("d",4));
//		
//		System.out.println(p);
//		
		Set<Person> p=new TreeSet<Person>();
		p.add(new Person("a",1));
		p.add(new Person("b",2));
		p.add(new Person("c",3));
		p.add(new Person("d",4));
		
		System.out.println(p);
		

	}

}
