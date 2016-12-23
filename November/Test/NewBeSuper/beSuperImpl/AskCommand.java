package beSuperImpl;

import beSuperCommand.PlayerCommand;
import beSuperDao.BeSuperConsole;
import beSuperInfo.Player;

public class AskCommand extends PlayerCommand{

	public AskCommand(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object execute() {
		if(player==null){
			BeSuperConsole.println("ÓÃ»§Î´µÇÂ½£¡");
			return null;
		}
		return player;
		
	}
	
}
