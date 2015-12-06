package pattern10.proxy;

/**
 * QQ
 */

public class QQ implements ActionQQ {

	@Override
	public void sendVoice(String name) {
		System.out.println(name + "开始发送语音");
	}

	@Override
	public void sendMessage(String name) {
		System.out.println(name + "开始发送消息");
	}

}
