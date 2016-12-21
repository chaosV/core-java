package object17;

public class Car {
	private String name;
	private Tyre tyre;

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void printCar(){
		System.out.println(name);
		System.out.println(tyre.name);
	}
}
