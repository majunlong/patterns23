package pattern21.visitor;

/**
 * 父母接口
 */

public interface ActionParents {

	/**
	 * 给儿子打电话
	 * 
	 * @param son 儿子
	 */
	public void callSon(ChildrenSon son);
	
	/**
	 * 给女儿打电话
	 * 
	 * @param daughter 女儿
	 */
	public void callDaughter(ChildrenDaughter daughter);
	
}
