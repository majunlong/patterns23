package pattern19.command;

/**
 * 服务1
 */

public class Service1 implements ActionCommand {

	private Server service;

	public Service1(Server service) {
		this.service = service;
	}

	@Override
	public void execute() {
		this.service.service1();
	}

}