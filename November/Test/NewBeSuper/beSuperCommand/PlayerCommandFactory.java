package beSuperCommand;

import beSuperImpl.AskCommand;
import beSuperInfo.Player;

public class PlayerCommandFactory  extends SystemCommand{
	
	private Player player;
	
	public PlayerCommandFactory(Player player) {
		this.player=player;
	}

	public Command buildCommand(String cmd) {
		if(cmd.equalsIgnoreCase("ask")){
			return new AskCommand(player);
		}
		return null;
	}

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return null;
	}

}
