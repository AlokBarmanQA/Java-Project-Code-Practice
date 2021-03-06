package conditional_statement;

import java.util.Scanner;

public class Equal_or_Different_Number {

	public static void main(String[] args) {
/*
 * Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, 
 * "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		if(num1 == num2 && num2 == num3) {
			System.out.println("All numbers are equal");
		}
		else if(num1 == num2 || num2 == num3 || num3 == num1) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal or different");
		}
		sc.close();
	}

}
