package beSuperCommand;

import beSuperImpl.ExitCommand;
import beSuperImpl.HelpCommand;

public class SystemCommandFactory extends CommandFactory{
	public Command buildCommand(String identifier){
		if(identifier.equalsIgnoreCase("exit")){
			return new ExitCommand();
		}
		
		if(identifier.equalsIgnoreCase("help")){
			return new HelpCommand();
		}
		return null;
	}
}