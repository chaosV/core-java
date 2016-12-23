package beSuperImpl;

import beSuperCommand.SystemCommand;
import beSuperDao.BeSuperConsole;

public class HelpCommand extends SystemCommand {

	@Override
	public Object execute() {
		BeSuperConsole.println("======== I want to be XUE BA commands ========");
		BeSuperConsole.println("= EXIT   - Exit the application");
		BeSuperConsole.println("= HELP   - Print command usage");
		BeSuperConsole.println("= LOGIN  - Login the application");
		BeSuperConsole.println("= SIGNUP - Sign up an player account");
		BeSuperConsole.println("= LIST   - List questions for ALL|MINE|OPEN|ID mode");
		BeSuperConsole.println("= ASK    - Ask a question");
		BeSuperConsole.println("= ANSWER - Answer a question");
		BeSuperConsole.println("= ACCEPT - Set best answer for a question");
		BeSuperConsole.println("= SCORE  - Show player's score");
		return null;
	}

}
