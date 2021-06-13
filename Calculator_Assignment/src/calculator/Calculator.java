package calculator;

public class Calculator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public double divide(int num1, int num2) {
		return ((double)num1 / num2);
	}
	public double squareRoot(double num) {
		return Math.sqrt(num);
	}	
	public double percentage(double num) {
		return num/100.00;
	}	
}
