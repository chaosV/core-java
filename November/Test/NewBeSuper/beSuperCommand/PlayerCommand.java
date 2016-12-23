package beSuperCommand;

import beSuperInfo.Player;

public abstract class PlayerCommand implements Command {

	protected Player player;   //享元模式  所有子类都可以使用
	
	public PlayerCommand(Player player) {
		this.player=player;
	}
	
}
