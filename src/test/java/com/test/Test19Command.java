package com.test;

import org.junit.Test;

import pattern19.command.ActionCommandMacro;
import pattern19.command.Client;
import pattern19.command.ListCommandMacro;
import pattern19.command.Server;
import pattern19.command.Service1;
import pattern19.command.Service2;

/**
 * 命令模式
 */

public class Test19Command {

	@Test
	public void testCommand() {
		Server server = new Server();
		Client client = new Client();
		client.setCommand(new Service1(server));
		client.executeCommand();
		client.setCommand(new Service2(server));
		client.executeCommand();
	}

	@Test
	public void testMacroCommand() {
		Server server = new Server();
		ActionCommandMacro command = new ListCommandMacro();
		command.add(new Service1(server));
		command.add(new Service2(server));
		Client client = new Client();
		client.setCommandMacro(command);
		client.executeCommandMacro();
	}

}
