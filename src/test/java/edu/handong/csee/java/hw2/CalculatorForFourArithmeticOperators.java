package edu.handong.csee.java.hw2;


public class CalculatorForFourArithmeticOperators implements Calculator {

	int numberOfArithmeticOperatorProcessed = 0;

	/** 
	*This is main method.
	*This main method displays calculated value, so it doesn't need output value and its input values are two numbers which were wanted to calculate.
	**/
	public static void main(String[] args) {

		CalculatorForFourArithmeticOperators myCalculator = new CalculatorForFourArithmeticOperators();

		System.out.println("SUM: " + myCalculator.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		System.out.println("SUBTRACT: " + myCalculator.subtract(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		System.out.println("MULTIPLY: " + myCalculator.multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		System.out.println("DIVIDE: " + myCalculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

		myCalculator.displayNumberOfArithmeticOperatorProcessed();
	}

	/** 
	*This method has the function to add.
	*The input of this method is entered two numbers, and the output is to add two values.
	**/
	public int sum(int firstNumber,int secondNumber) {
		numberOfArithmeticOperatorProcessed++;
		return firstNumber+secondNumber;
	}

	/** 
	*This method has the function to subtract.
	*The input of this method is entered two numbers, and the output is to subtract the second input from the first input value.
	**/
	public int subtract(int firstNumber,int secondNumber) {
		numberOfArithmeticOperatorProcessed++;
		return firstNumber-secondNumber;
		}

	/** 
	*This method has the function to divide.
	*The input of this method is entered two numbers, and the output is to divide the second input from the first input value.
	**/
	public int divide(int firstNumber,int secondNumber) {
		numberOfArithmeticOperatorProcessed++;
		return firstNumber/secondNumber;
	}

	/** 
	*This method has the function to multiply.
	*The input of this method is entered two numbers, and the output is to multiply two values.
	**/
	public int multiply(int firstNumber,int secondNumber) {
		numberOfArithmeticOperatorProcessed++;
		return firstNumber*secondNumber;
	}

	/** 
	*This method counts how many display number of arithmetic operator processed.
	*This method doesn't need input and output value.
	**/
	public void displayNumberOfArithmeticOperatorProcessed(){
		System.out.println("The number of arithmetic operators processed!: " + numberOfArithmeticOperatorProcessed);
	}

}
