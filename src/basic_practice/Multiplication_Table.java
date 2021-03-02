package basic_practice;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// Write a Java program that takes a number as input and prints its multiplication table upto 10.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		
		int num1 = sc.nextInt();

		for (int i=1; i<=10; i++){
			
			System.out.println(num1 + " x " + (i) + " = " + (num1 * (i)));
		}
		sc.close();
	}
}
