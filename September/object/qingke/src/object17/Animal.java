package object17;

public abstract class Animal {
	public String name;
	public String owner;
	protected int age;
	
	public void setAge(int age) {
		this.age = age;
	}


	public abstract void run ();
	
	
	public  void eat(){
		System.out.println("开始吃东西...");
		System.out.println("吃完了...");
	}
	
	
	public Animal(String name){
		this.name = name;
	}
	
	public Animal(String owner,int age){
		this.owner = owner;
		this.age = age;
	}
}
