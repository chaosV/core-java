package com.qk.test;

import com.qk.Person;
import com.qk.Student;
import com.qk.Stuff;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setAddress("111");
		p.name="zzz";
		p.getName();
		p.getAddress();
		p.toString();
		System.out.println(p.toString());
		
		
		Student s=new Student("z","222","math",2,2.1);
		System.out.println(s.toString());
		
		
		Stuff sf=new Stuff("c","cc","zzz",3.1);
		System.out.println(sf.toString());
	}

}
