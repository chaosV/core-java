package com.qk18.test;

public class TestAnimal {
	
	
	public static void change(Animal72 animal){
		Animal72 animal1=new Cat72();
		animal1.greeting();
		Animal72 animal2=new Dog72();
		animal2.greeting();
		Animal72 animal3=new BigDog();
		animal3.greeting();
		//Animal72 animal4=new Animal72();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat72 c=new Cat72();
		c.greeting();
		
		Dog72 d=new Dog72();
		d.greeting();
		
		BigDog bd=new BigDog();
		bd.greeting();
		

		//Dog72 d2=(Dog72)animal3;
	}

}
