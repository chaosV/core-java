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
			BeSuperConsole.println("�û�δ��½��");
			return null;
		}
		return player;
		
	}
	
}
