package pattern19.command;

import java.util.LinkedList;
import java.util.List;

/**
 * 宏命令
 */

public class ListCommandMacro implements ActionCommandMacro {

	List<ActionCommand> commandList = new LinkedList<ActionCommand>();

	@Override
	public void add(ActionCommand command) {
		this.commandList.add(command);
	}

	@Override
	public void execute() {
		for (ActionCommand command : this.commandList) {
			command.execute();
		}
	}

}
