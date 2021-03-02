package basic_practice;

import java.util.Scanner;

public class Sum_Of_Integer {

	public static void main(String[] args) {
		// Write a Java program and compute the sum of the digits of an integer.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		while (input != 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		System.out.println("Sum of the integer is: "+sum);
		sc.close();
	}

}
