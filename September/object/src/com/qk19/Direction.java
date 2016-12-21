package com.qk19;

public enum Direction {
	EAST(" 东方 "), WEST(" 西方 "), NORTH(" 北方 "), SOUTH(" 南方 ");

	public String chineseDirection;

	private Direction(String chineseDirection) {
		this.chineseDirection = chineseDirection;
	}

	public String fullDirection() {
		return (chineseDirection +this.name());
	}
}