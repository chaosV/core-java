package beSuperDao;

import beSuperCommand.CommandFactory;
import beSuperCommand.Command;
import beSuperInfo.Player;

public class BeSuperApplication{
	
	private static BeSuperApplication instance=null;
	
	private BeSuperApplication(){
		
	}
	
	public static synchronized BeSuperApplication getInstance(){
		if(instance==null){
			instance=new BeSuperApplication();
		}
		
		return instance;
	}
	
	private static Player playerProfile;
	
	public static void main(String[] args){
		BeSuperConsole.println("You can use the \"HELP\" for command usage. Have fun!");
		
		while(true){
			String cmd=BeSuperConsole.askUserInput("cmd");
			
			CommandFactory factory=CommandFactory.getFactory(BeSuperApplication.getInstance().getPlayerProfile());
			Command command=factory.buildCommand(cmd);
			command.execute();
		}
		
	}

	public Player getPlayerProfile() {
		return playerProfile;
	}

	
}