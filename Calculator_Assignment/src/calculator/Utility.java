package calculator;

public class Utility {
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		System.out.println("5 + 5 = " + calculator.add(5, 5));
		System.out.println("5 - 5 = " + calculator.subtract(5, 5));
		System.out.println("5 * 5 = " + calculator.multiply(5, 5));
		System.out.println("5 / 5 = " + calculator.divide(5, 5));
		System.out.println("square root of 25 = " + calculator.squareRoot(25));
		System.out.println("Percentage of 25 = " + calculator.percentage(25));

	}
}
