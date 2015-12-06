package pattern22.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 变量上下文
 */

public class VariableContext {

	private Map<ExpressionVariable, Boolean> map = new HashMap<ExpressionVariable, Boolean>();

	public void put(ExpressionVariable variable, boolean value) {
		this.map.put(variable, new Boolean(value));
	}

	public boolean get(ExpressionVariable variable) {
		Boolean value = this.map.get(variable);
		return value.booleanValue();
	}

}
