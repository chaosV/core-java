package beSuperImpl;

import beSuperCommand.SystemCommand;

public class ExitCommand extends SystemCommand {

	@Override
	public Object execute() {
		System.out.println("再见，欢迎下次使用！");
		System.exit(0);
		return null;
	}

}
