package conditional_statement;

import java.util.Scanner;

public class Compare_Two_Decimal {

	public static void main(String[] args) {
/*
 * Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal 
 * places.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number with minimum three decimal place:");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number with minimum three decimal place:");
		double num2 = sc.nextDouble();
		sc.close();
		
		if(Math.abs(num1 - num2) < 0.01) {
			System.out.println("Both numbers are the same");
		}
		else {
			System.out.println("Both numbers are different");
		}
		
	}

}
