package pattern09.facade;

/**
 * 个人电脑
 */

public class PC {

	CPU cpu = new CPU();
	Memory memory = new Memory();
	HardDisk hardDisk = new HardDisk();

	/**
	 * 启动
	 */
	public void startup() {
		this.hardDisk.startup();
		this.memory.startup();
		this.cpu.startup();
	}

	/**
	 * 关闭
	 */
	public void shutdown() {
		this.cpu.shutdown();
		this.memory.shutdown();
		this.hardDisk.shutdown();
	}

}
