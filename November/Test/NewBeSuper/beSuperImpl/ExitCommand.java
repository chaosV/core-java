package beSuperImpl;

import beSuperCommand.SystemCommand;

public class ExitCommand extends SystemCommand {

	@Override
	public Object execute() {
		System.out.println("�ټ�����ӭ�´�ʹ�ã�");
		System.exit(0);
		return null;
	}

}
