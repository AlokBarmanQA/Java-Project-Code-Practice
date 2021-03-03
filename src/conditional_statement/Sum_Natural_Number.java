package conditional_statement;

import java.util.Scanner;

public class Sum_Natural_Number {

	public static void main(String[] args) {
		// Write a program in Java to display n terms of natural numbers and their sum.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of "+n+" natural number: "+sum);
		sc.close();
	}

}
