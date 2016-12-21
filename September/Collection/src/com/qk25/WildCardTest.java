package com.qk25;

import java.util.ArrayList;

public class WildCardTest {

	static class Animal {

		@Override
		public String toString() {
			return "I am a dog";
		}

		public void eat() {
			System.out.println("Animal is eating");

		}
	}
	static class Dog extends Animal{ 
		public void back(){
			System.out.println("woooooooow");
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Animal());
		list.add(new Animal());
		showList(list);
		
		ArrayList<Dog> list2=new ArrayList<Dog>();
		list2.add(new Dog());
		list2.add(new Dog());
//		
//		showList(list);
//		showList2(list);
//		showList2(list2);
//		
		
	}
	
	//通配符上限animal
	public static void showList(ArrayList<? extends Animal> list){
		for(Animal animal:list){
			System.out.println(animal);
			animal.eat();
		}
	}
		//通配符下限dog
		public static void showList2(ArrayList<? super Dog> list){
			for(Object animal:list){
				System.out.println(animal);
		}
	}
}
