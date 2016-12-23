package beSuperCommand;

import beSuperInfo.Player;

public abstract class CommandFactory {
	
	// ���󹤳�����һ��ʵ����������ͨ��ʵ����������ʵ������
	//public static CommandFactory getFactory(Player player){
		if(player==null){
			return new SystemCommandFactory();
		}
		//return new PlayerCommandFactory(player);
	}
	
	public abstract Command buildCommand(String cmd);
}
