package conditional_statement;

public class Greatest_Number {

	public static void main(String[] args) {
		// Take three numbers from the user and print the greatest number.
		
		int number1 = 99;
		int number2 = 78;
		int number3 = 87;
		
		if (number1 > number2) {
			System.out.println(number1 +" is the greatest number");
		}
		else if (number2 > number3) {
			System.out.println(number2 +" is the greatest number");
		}
		else {
			System.out.println(number3 +" is the gretest number");
		}
	}

}
