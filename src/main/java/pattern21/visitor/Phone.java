package pattern21.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话
 */

public class Phone {

	private List<ActionChildren> childrenList = new ArrayList<ActionChildren>();

	/**
	 * 呼叫
	 * 
	 * @param parents 父母
	 */
	public void call(ActionParents parents){
		for (ActionChildren children : childrenList) {
			children.callParents(parents);
		}
	}
	
	/**
	 * 添加电话使用人
	 * 
	 * @param children 孩子
 	 */
	public void add(ActionChildren children){
		this.childrenList.add(children);		
	}
	
}
