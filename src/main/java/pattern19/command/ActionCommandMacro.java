package pattern19.command;

/**
 * 宏命令接口
 */

public interface ActionCommandMacro extends ActionCommand {

	/**
	 * 添加命令
	 * 
	 * @param command 命令
	 */
	public void add(ActionCommand command);
	
}
