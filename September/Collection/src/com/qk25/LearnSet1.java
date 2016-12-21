package com.qk25;

import java.util.Set;
import java.util.TreeSet;

class Person1 implements Comparable<Person1> {
	String name;
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;

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

	public int compareTo(Person1 o) {
		return this.name.compareTo(o.name);

	}

}

public class LearnSet1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set<String> hashset=new HashSet<>();
		// hashset.add("cat");
		// hashset.add("dog");
		// hashset.add("mouse");
		// System.out.println(hashset);
		//
		// Set<String> s=new LinkedHashSet<String>();
		// s.add("cat");
		// s.add("dog");
		// s.add("mouse");
		// System.out.println(s);
		//
		Set<Person1> p = new TreeSet<Person1>();
		Set<Person1> p1 = new TreeSet<Person1>(new NameComp());
		Set<Person1> p2 = new TreeSet<Person1>(new AgeComp());
		p1.add(new Person1("a", 1));
		p1.add(new Person1("d", 5));
		p1.add(new Person1("c", 3));
		p1.add(new Person1("b", 4));
		System.out.println(p1);
		
		
		p2.add(new Person1("a", 1));
		p2.add(new Person1("d", 5));
		p2.add(new Person1("c", 3));
		p2.add(new Person1("b", 4));
		System.out.println(p2);
		
		p.add(new Person1("z", 1));
		p.add(new Person1("c", 2));
		p.add(new Person1("b", 3));
		p.add(new Person1("d", 4));
		System.out.println(p);

	}

}
