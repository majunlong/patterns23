package com.test;

import org.junit.Test;

import pattern22.interpreter.ActionExpression;
import pattern22.interpreter.CriteriaAnd;
import pattern22.interpreter.CriteriaNot;
import pattern22.interpreter.CriteriaOr;
import pattern22.interpreter.ExpressionConstant;
import pattern22.interpreter.ExpressionVariable;
import pattern22.interpreter.VariableContext;

/**
 * 解释器
 */

public class Test22Interpreter {

	@Test
	public void testInterpreter() {
		ExpressionVariable x = new ExpressionVariable("x");
		ExpressionVariable y = new ExpressionVariable("y");
		ExpressionConstant c = new ExpressionConstant(true);
		VariableContext context = new VariableContext();
		context.put(x, true);
		context.put(y, false);
		ActionExpression expression = new CriteriaOr(new CriteriaAnd(c, x), new CriteriaAnd(y, new CriteriaNot(x)));
		System.out.println("x = " + x.interpret(context));
		System.out.println("y = " + y.interpret(context));
		System.out.println(expression.toString() + " = " + expression.interpret(context));
	}

}
