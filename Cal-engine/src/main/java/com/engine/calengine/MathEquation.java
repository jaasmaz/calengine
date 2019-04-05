package com.engine.calengine;

public class MathEquation {
	
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
	
	//Constructor
	public MathEquation () {};
	
	//2ndConstructor
	public MathEquation (char opCode) {
		this.opCode = opCode;
	}
	
	//3rd Constructor "chained"
	public MathEquation(char opCode, double leftVal, double rightVal) {
		this(opCode); 														//chained with the first constructor
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public void execute(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		execute();
		result = (int)result;
	}
	
	public void execute() {
		switch(opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'd':
			result = leftVal != 0.0d ? leftVal / rightVal : 0.0d;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		default:
			System.out.println("Error - invalid opCode");
			result = 0.0d;
			break;
		}
	}
}
 