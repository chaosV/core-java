package object17;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("zc ",4);
		System.out.println(c.owner + c.age);
		c.run();
		c.run(true);
		c.run(false);
		c.eat();
		c.roll();
		c.setAge(3);
		System.out.println(c.age);

	}
}
