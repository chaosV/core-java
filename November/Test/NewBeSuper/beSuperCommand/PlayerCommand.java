package beSuperCommand;

import beSuperInfo.Player;

public abstract class PlayerCommand implements Command {

	protected Player player;   //��Ԫģʽ  �������඼����ʹ��
	
	public PlayerCommand(Player player) {
		this.player=player;
	}
	
}
