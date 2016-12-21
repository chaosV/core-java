package com.qk23;

public class Professor implements Cloneable{
	public String name;
	public int age;
	Student stu;
	
	public Professor(){
		
	}
	
	public Professor(String name,int age,Student student){
		this.name=name;
		this.age=age;
		stu=student;
	
	}

	public Object clone(){
		Student stu=new Student(this.stu.name,this.stu.age);
		Professor p=new Professor(this.name,this.age,stu);
		return p;
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
	
	public String toString(){
		return name+age+stu;
	}
	
	public static void main(String[] ages){
		Student stu=new Student(" aa ",33);
		//Professor p=new Professor("qq ",11,(new Student(" aa ",33));
		Professor p=new Professor("qq ",11,stu);
		Professor p1;
//		try {
			p1 = (Professor)p.clone();
			p1.setName("ww ");
			p1.setAge(22);
			p1.stu.name=(" zz ");
			System.out.println(p);
			System.out.println(p1);
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
