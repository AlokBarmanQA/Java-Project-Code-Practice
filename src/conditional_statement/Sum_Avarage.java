package conditional_statement;

import java.util.Scanner;

public class Sum_Avarage {

	public static void main(String[] args) {
		// Write a program in Java to input 5 numbers from keyboard and find their sum and average.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		System.out.println("Enter fourth number:");
		int num4 = sc.nextInt();
		System.out.println("Enter fifth number:");
		int num5 = sc.nextInt();
		
		int sum = (num1 + num2 + num3 + num4 + num5);
		System.out.println("Sum of five numbers is: "+ sum);
		double avarage = (num1 + num2 + num3 + num4 + num5)/5;
		System.out.println("Avarage of five numbers is: "+ avarage);
		sc.close();
	}

}
