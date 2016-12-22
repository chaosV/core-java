package qk.reflect;

public class Dog {
	
	public String name;
	public int age;
	private String owner; 
	
	public Dog(){
		
	}
	
	public Dog(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void bark(){
		System.out.println("ÍôÍô£¡");
	}
	
	public void celebrateBirthday(){
		System.out.println(name+"ÉúÈÕ¿ìÀÖ£¡");
		addAge();
	}
	
	private void addAge(){
		age=age+1;
	}
}
