package pattern21.visitor;

/**
 * 父亲
 */

public class ParentsFather implements ActionParents {

	@Override
	public void callSon(ChildrenSon son) {
		System.out.println("Father call to " + son.getName());
	}

	@Override
	public void callDaughter(ChildrenDaughter daughter) {
		System.out.println("Father call to " + daughter.getName());
	}

}
