package pattern21.visitor;

/**
 * 女儿
 */

public class ChildrenDaughter implements ActionChildren {

	@Override
	public void callParents(ActionParents parents) {
		parents.callDaughter(this);
	}
	
	public String getName(){
		return "dauther";
	}
	
}
