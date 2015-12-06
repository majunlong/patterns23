package pattern22.interpreter;

/**
 * and表达式
 */

public class CriteriaAnd implements ActionExpression {

	private ActionExpression left, right;

	public CriteriaAnd(ActionExpression left, ActionExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(VariableContext context) {
		return this.left.interpret(context) && this.right.interpret(context);
	}

	@Override
	public String toString() {
		return "(" + this.left.toString() + " AND " + this.right.toString() + ")";
	}

}