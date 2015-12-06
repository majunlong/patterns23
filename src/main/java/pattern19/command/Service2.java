package pattern19.command;

/**
 * 服务2
 */

public class Service2 implements ActionCommand {

	private Server service;

	public Service2(Server service) {
		this.service = service;
	}

	@Override
	public void execute() {
		this.service.service2();
	}

}