package conditional_statement;

public class Three_DecimalPlace_Comparison {

	public static void main(String[] args) {
		// Write a Java program that reads in two floating-point numbers and tests whether they are the same up to 
		// three decimal places.
		
		double number1 = 23.2345;
		double number2 = 23.2346;
		number1 = Math.round(number1 * 100);
		number1 = number1 / 100;
		number2 = Math.round(number2 * 100);
		number2 = number2 / 100;
		if (number1 == number2) {
			System.out.println("Both are the same up to three decimal places");
		}
		else {
			System.out.println("Both are not equal");
		}
	}

}
