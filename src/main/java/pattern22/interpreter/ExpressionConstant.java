package pattern22.interpreter;

/**
 * 常量表达式
 */

public class ExpressionConstant implements ActionExpression {

	private boolean value;

	public ExpressionConstant(boolean value) {
		this.value = value;
	}

	@Override
	public boolean interpret(VariableContext context) {
		return this.value;
	}

	@Override
	public String toString() {
		return new Boolean(this.value).toString();
	}

}