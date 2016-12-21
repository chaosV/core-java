package object17;

public class Cat extends Animal {
	
	
//	public Cat(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}

	public Cat(String owner, int age) {
		// TODO Auto-generated constructor stub
		super(owner,age);
		
	}

	private int temp;
	
	public void roll() {
		System.out.println("¿ªÊ¼·­¹ö...");
		temp++;
		System.out.println("·­¹öÁË  "+temp +" È¦");
	}

	public void run(){
		System.out.println("Ã¨²½.....");
	}
	
	public void run(boolean isHungry){
		if(isHungry){
			System.out.println("ÃÐÑÛ.....");
		}else {
			System.out.println("Ã¨²½.....");
		}
	}
}
