package pattern20.memo;

/**
 * 副本存储接口
 */

public interface ActionTranscriptRepository {

	/**
	 * 计算容量
	 * 
	 * @return 容量
	 */
	public int size();

	/**
	 * 创建副本
	 */
	public void create();

	/**
	 * 恢复副本
	 */
	public void restore();
	
	/**
	 * 按下标恢复副本
	 * 
	 * @param index 下表
	 */
	public void restore(int index);

	/**
	 * 恢复上一个副本
	 */
	public void restorePrevious();

	/**
	 * 恢复下一个副本
	 */
	public void restoreNext();

}
