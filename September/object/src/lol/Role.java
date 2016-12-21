package lol;

import java.util.Random;

public abstract class Role {
	protected String name;
	protected int blood;
	protected int currentBlood;
	protected int attackPower;

	public Role(String name) {
		this.name = name;
		this.blood = Role.getinitBlood();
		this.currentBlood = blood;
		this.attackPower = getinitAttackPower();
	}

	public Role(String name, int blood, int attackPower) {
		this.name = name;
		this.blood = blood;
		this.attackPower = attackPower;
	}

	public static int getinitBlood() {
		Random r = new Random();
		return r.nextInt(100) + 100;

	}

	public int getinitAttackPower() {
		Random r = new Random();
		return r.nextInt(10) + 10;
	}

	protected abstract void hit(Role role);

	protected abstract void beHit(int attack);

}
