package conditional_statement;

import java.util.Scanner;

public class Incresing_Decresing_Number {

	public static void main(String[] args) {
/*
 * Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing 
 * order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		
		if(num1 < num2 && num2 < num3) {
			System.out.println("increasing");
		}
		else if(num1 > num2 && num2 > num3) {
			System.out.println("decreasing");
		}
		else {
			System.out.println("Neither increasing or decreasing order");
		}
		sc.close();
	}

}
