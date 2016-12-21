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
			System.out.println("共有3条狗");
		}
	}
	
	
	public void eat(Food food){
		food.beEat();
	}
	
	
	//方法内部类
	public void run(){
		System.out.println("开始跑。。。。");
		
		 class DogAngry{
			public DogAngry(){
				System.out.println("愤怒！！！");
			}
			public void speedup(){
				System.out.println("开始加速。。。。");
			}
		}
		
		 DogAngry dg=new DogAngry();
		dg.speedup();
		
		System.out.println("跑完了。。。。");
	}
	
	//private 内部类
	private class SmallDog{
		public SmallDog(double height){
			System.out.println("小狗窝  "+height);
		}
	}
	//public 内部类
	public class DogHouse {

		public DogHouse(double height) {
			System.out.println("制作的狗窝高： " + height);
		}

		public void newHouse() {
			System.out.println("Tom的新家。");
		}
	}

	public Dog(String name, double height) {
		this.name = name;
		this.height = height;
		doghouse = new DogHouse(height);
		smalldog=new SmallDog(height);
	}

	public void show() {
		System.out.println(name + "Tom的身高 " + height);
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
