package pattern21.visitor;

/**
 * 儿子
 */

public class ChildrenSon implements ActionChildren {

	@Override
	public void callParents(ActionParents parents) {
		parents.callSon(this);
	}
	
	public String getName(){
		return "son";
	}
	
}
