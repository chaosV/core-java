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
		System.out.println("��ʼ����...");
		temp++;
		System.out.println("������  "+temp +" Ȧ");
	}

	public void run(){
		System.out.println("è��.....");
	}
	
	public void run(boolean isHungry){
		if(isHungry){
			System.out.println("����.....");
		}else {
			System.out.println("è��.....");
		}
	}
}
