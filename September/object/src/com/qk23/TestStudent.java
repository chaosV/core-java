package com.qk23;

public class TestStudent implements Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p=new Professor("qqq",21);
		Student s=new Student("www",12);
		Student s1=(Student)s.clone();
	}

}
