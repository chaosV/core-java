package com.qk18;
interface Food{
	public void beEat();
}
public class Dog {
	private String name;
	private double height;
	private DogHouse doghouse;
	private SmallDog smalldog;
	
	
	public static class DogStat{
		public void total(){
			System.out.println("����3����");
		}
	}
	
	
	public void eat(Food food){
		food.beEat();
	}
	
	
	//�����ڲ���
	public void run(){
		System.out.println("��ʼ�ܡ�������");
		
		 class DogAngry{
			public DogAngry(){
				System.out.println("��ŭ������");
			}
			public void speedup(){
				System.out.println("��ʼ���١�������");
			}
		}
		
		 DogAngry dg=new DogAngry();
		dg.speedup();
		
		System.out.println("�����ˡ�������");
	}
	
	//private �ڲ���
	private class SmallDog{
		public SmallDog(double height){
			System.out.println("С����  "+height);
		}
	}
	//public �ڲ���
	public class DogHouse {

		public DogHouse(double height) {
			System.out.println("�����Ĺ��Ѹߣ� " + height);
		}

		public void newHouse() {
			System.out.println("Tom���¼ҡ�");
		}
	}

	public Dog(String name, double height) {
		this.name = name;
		this.height = height;
		doghouse = new DogHouse(height);
		smalldog=new SmallDog(height);
	}

	public void show() {
		System.out.println(name + "Tom����� " + height);
	}

	public static void main(String[] args) {
		Dog d = new Dog("Tom ", 55);
//		d.show();
//		
//		System.out.println("==============");
//		
//		d.run();
//		
//		System.out.println("==============");
//		
//		Dog.DogHouse dd = d.new DogHouse(65);
//		dd.newHouse();
//		System.out.println("==============");
		
		
//		Food food =new Food(){
//			public void beEat(){
//				System.out.println("*****");
//			}
//		};
//		d.eat(food);
		
//		d.eat(Food food=new Food(){);
//			public void beEat(){ 
//				System.out.println("*****");
//			}
//		};
//		
//		Dog.DogStat ds=new Dog.DogStat();
//		ds.total();
		
	}
	
}
