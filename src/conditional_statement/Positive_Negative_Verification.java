package conditional_statement;

import java.util.Scanner;

public class Positive_Negative_Verification {

	public static void main(String[] args) {
		// Write a Java program to get a number from the user and print whether it is positive or negative.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println(num+" is a positive number");
		}
		else if (num < 0) {
			System.out.println(num+" is a negative number");
		}
		else if (num == 0) {
			System.out.println(num+" is Zero");
		}
		sc.close();
	}

}
