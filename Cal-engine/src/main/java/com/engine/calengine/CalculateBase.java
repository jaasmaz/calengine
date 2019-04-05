package com.engine.calengine;

public abstract class CalculateBase {
	private double leftVal;
	private double rightVal;
	private char opCode = 'a';
	private double result;
	
	//Accessors 
	public double getLeftVal() { return leftVal; }
	public double getRightVal() { return rightVal; }
	public char getOpCode() { return opCode; }
	public double getResult() { return result; }
	
	//Mutators
	public void setLeftVal(double left) { this.leftVal = left; }
	public void setRightVal(double right) {  this.rightVal = right; }
	public void setOpCode(char code) { this.opCode = code; }
	public void setResult(double result) {this.result = result; }
	
	public CalculateBase() {}
	public CalculateBase(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public abstract void calculate();
}
