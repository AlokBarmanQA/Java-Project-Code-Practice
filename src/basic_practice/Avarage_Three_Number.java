package basic_practice;

import java.util.Scanner;

public class Avarage_Three_Number {

	public static void main(String[] args) {
		// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		int avarag = (num1 + num2 + num3)/3;
		System.out.println("Avarage of above three numbers is: "+avarag);
		sc.close();
	}

}
