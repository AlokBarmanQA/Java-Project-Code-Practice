package basic_practice;

import java.util.Scanner;

public class Compare_Two_Numbers {

	public static void main(String[] args) {
		// Write a Java program to compare two numbers.
		
		//Input first integer: 25
		//Input second integer: 39
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("num1 and num2 are equal");
		}
		else if (num1 != num2) {
			System.out.println("num1 and num2 are not equal");
		}
		else if (num1 < num2) {
			System.out.println("num2 is greter than num1");
		}
		else if (num1 > num2) {
			System.out.println("num1 is greter than num2");
		}
		else {
			System.out.println("num1 and num2 are not valid");
		}
		sc.close();
	}

}
