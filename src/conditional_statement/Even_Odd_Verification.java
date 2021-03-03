package conditional_statement;

import java.util.Scanner;

public class Even_Odd_Verification {

	public static void main(String[] args) {
		// Write a Java program to get a number from the user and print whether it is even or odd.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num+" is a even number");
		}
		else if (num % 2 != 0) {
			System.out.println(num+" is a odd number");
		}
		else {
			System.out.println("Input is not a valid integer");
		}
		sc.close();
	}

}
