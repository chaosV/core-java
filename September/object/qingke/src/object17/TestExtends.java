package object17;

public class TestExtends {

	public static void main(String[] args){
		
	}
	// TODO Auto-generated method stub

	public static void liu(Animal animal) {
		System.out.println("");

		if (animal instanceof Cat) {     
			System.out.println("1");
			Cat c = (Cat) animal;
			c.roll();
		} else {
			System.out.println("2");
		}

	}

	public static void liuCat(Cat c) {

	}
}


