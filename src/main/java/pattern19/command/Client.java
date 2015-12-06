package pattern19.command;

/**
 * 客户端
 */

public class Client {

	private ActionCommand command;
	private ActionCommandMacro commandMacro;

	public void setCommand(ActionCommand command) {
		this.command = command;
	}

	public void setCommandMacro(ActionCommandMacro commandMacro) {
		this.commandMacro = commandMacro;
	}

	/**
	 * 执行命令
	 */
	public void executeCommand() {
		this.command.execute();
	}

	/**
	 * 执行宏命令
	 */
	public void executeCommandMacro() {
		this.commandMacro.execute();
	}

}
