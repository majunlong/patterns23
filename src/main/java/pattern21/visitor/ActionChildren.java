package pattern21.visitor;

/**
 * 孩子接口
 */

public interface ActionChildren {

	/**
	 * 给父母打电话
	 * 
	 * @param parents 父母
	 */
	public void callParents(ActionParents parents);
	
}
