package conditional_statement;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// Write a Java program that takes a year from user and print whether that year is a leap year or not.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = sc.nextInt();

		boolean a = (year % 4 == 0);
		boolean b = (year % 400 == 0);
		boolean c = (year % 100 != 0);

		if (a && (b || c)) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
		sc.close();
	}

}
