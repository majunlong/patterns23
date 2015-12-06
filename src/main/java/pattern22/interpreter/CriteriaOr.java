package pattern22.interpreter;

/**
 * or表达式
 */

public class CriteriaOr implements ActionExpression {

	private ActionExpression left, right;

	public CriteriaOr(ActionExpression left, ActionExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(VariableContext context) {
		return this.left.interpret(context) || this.right.interpret(context);
	}

	@Override
	public String toString() {
		return "(" + this.left.toString() + " OR " + this.right.toString() + ")";
	}

}