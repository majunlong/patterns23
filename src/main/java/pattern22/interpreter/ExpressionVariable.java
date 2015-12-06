package pattern22.interpreter;

/**
 * 变量表达式
 */

public class ExpressionVariable implements ActionExpression {

	private String name;

	public ExpressionVariable(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(VariableContext context) {
		return context.get(this);
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object != null && object instanceof ExpressionVariable) {
			return this.name.equals(((ExpressionVariable) object).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

}