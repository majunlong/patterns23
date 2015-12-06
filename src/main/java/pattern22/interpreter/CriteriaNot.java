package pattern22.interpreter;

/**
 * not表达式
 */

public class CriteriaNot implements ActionExpression {

	private ActionExpression expression;

	public CriteriaNot(ActionExpression expression) {
		this.expression = expression;
	}

	@Override
	public boolean interpret(VariableContext context) {
		return !this.expression.interpret(context);
	}

	@Override
	public String toString() {
		return "not " + this.expression.toString();
	}

}