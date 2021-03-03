package conditional_statement;

import java.util.Scanner;

public class Weekday_Logic_02 {

	public static void main(String[] args) {
		// Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays
		//the name of the weekday.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int day = sc.nextInt();

		System.out.println(getDayName(day));
		sc.close();
	}

	public static String getDayName(int day) {
		String dayName = "";
		switch(day) {
		case 1: 
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default:
			dayName = "Out of range";
		}
		return dayName;
	}
}
