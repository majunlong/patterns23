package pattern21.visitor;

/**
 * 母亲
 */

public class ParentsMother implements ActionParents {

	@Override
	public void callSon(ChildrenSon son) {
		System.out.println("Mother call to " + son.getName());
	}

	@Override
	public void callDaughter(ChildrenDaughter daughter) {
		System.out.println("Mother call to " + daughter.getName());
	}

}
