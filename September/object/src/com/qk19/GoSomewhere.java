package com.qk19;

public class GoSomewhere {

	// public void go(String direction) {
	// System.out.println(direction);
	//
	// if (direction == DirectionConstent.direction_EAST) {
	// System.out.println("............");
	// } else if (direction == DirectionConstent.direction_NORTH) {
	// System.out.println("*************");
	// }if (direction == DirectionConstent.direction_WEST) {
	// System.out.println("!!!!!!!!!!!!!!!!");
	// } else if (direction == DirectionConstent.direction_SOUTH) {
	// System.out.println("####################");
	// }
	// }

	public void go(Direction direction) {
		System.out.println(direction.fullDirection());

		if (direction == Direction.EAST) {
			System.out.println("*������*");
		} else if (direction == Direction.NORTH) {
			System.out.println("*������*");
		}
		if (direction == Direction.WEST) {
			System.out.println("*������*");
		} else if (direction == Direction.SOUTH) {
			System.out.println("*������*");
		}
	}

	public static void main(String[] args) {
		
		GoSomewhere gs = new GoSomewhere();
		gs.go(Direction.SOUTH);
		gs.go(Direction.EAST);
		gs.go(Direction.WEST);
		gs.go(Direction.NORTH);
	}

}
