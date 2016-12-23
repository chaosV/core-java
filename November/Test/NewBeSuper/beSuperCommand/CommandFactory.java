package beSuperCommand;

import beSuperInfo.Player;

public abstract class CommandFactory {
	
	// 抽象工厂定义一个实例工厂并且通过实例工厂产生实例命令
	//public static CommandFactory getFactory(Player player){
		if(player==null){
			return new SystemCommandFactory();
		}
		//return new PlayerCommandFactory(player);
	}
	
	public abstract Command buildCommand(String cmd);
}
