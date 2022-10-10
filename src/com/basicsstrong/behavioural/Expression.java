package com.basicsstrong.behavioural;

public abstract class Expression {
	public abstract int interpret();
}

//terminal expression 
class Number extends  Expression {
	protected int value = 0;
	public Number(int value) {
		this.value = value;
		}
	public int interpret() {
		return value;
	}
}
//non terminal expression 
class Add extends Expression{
	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Add(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public int interpret() {
		return lhs.interpret() + rhs.interpret();
	}

}
class Subtract extends Expression{
	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Subtract(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	public int interpret() {
		return lhs.interpret() - rhs.interpret();
	}
}
class Multiply extends Expression{
	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Multiply(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	public int interpret() {
		return lhs.interpret() * rhs.interpret();
	}
}
class Divide extends Expression{
	protected Expression lhs = null;
	protected Expression rhs = null;
	
	public Divide(Expression lhs, Expression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	public int interpret() {
		return lhs.interpret() / rhs.interpret();
	}
}








