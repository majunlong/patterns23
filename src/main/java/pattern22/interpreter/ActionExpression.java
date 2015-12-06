package pattern22.interpreter;

/**
 * 表达式接口
 */

public interface ActionExpression {

	/**
	 * 解析
	 * 
	 * @param context 变量上下文
	 * @return 结果
	 */
	public boolean interpret(VariableContext context);

}
