package com.qk19;

import java.util.HashSet;
import java.util.Set;

public class Dog {
	public String name;
	public String owner;

	public Dog(String name, String owner) {
		this.name = name;
		this.owner = owner;
	}

	public int hashCode() {
		String a = name + owner;
		return a.hashCode();

	}

//	public boolean equals(Object o) {
//		if (o instanceof Dog) {
//			Dog d = (Dog) o;
//			if (d.name == this.name && d.owner == this.owner) {
//				return true;
//			} else
//				return false;
//		} else {
//
//			return false;
//		}
//	}
	 public boolean equals(Object o) {
	 if (!(o instanceof Dog))
	 return false;
	
	 Dog d = (Dog) o;
	 return d.owner == this.owner && d.name == this.name;
	 }

	public static void main(String[] args) {
		Dog d1 = new Dog("a", "z");
		Dog d2 = new Dog("a", "z");
		Dog d3 = new Dog("a", "c");
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));

		Set set = new HashSet();
		set.add(d1);
		System.out.println(set.contains(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}

}
