package com.qk19;

public enum Direction {
	EAST(" ���� "), WEST(" ���� "), NORTH(" ���� "), SOUTH(" �Ϸ� ");

	public String chineseDirection;

	private Direction(String chineseDirection) {
		this.chineseDirection = chineseDirection;
	}

	public String fullDirection() {
		return (chineseDirection +this.name());
	}
}