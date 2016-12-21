package object17;

public class BuildCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buildBWM();
	}

	public static void buildBWM(){
		Car c = new Car();
		c.setName("BWM");
		Tyre t = new Tyre();
		t.setName("³¬¼¶ÂÖÌ¥");
		c.setTyre(t);
		c.printCar();
		
	}
}
