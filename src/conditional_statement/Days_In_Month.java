package conditional_statement;

import java.util.Scanner;

public class Days_In_Month {

	public static void main(String[] args) {
		// Write a Java program to find the number of days in a month.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for month: ");
		int month = sc.nextInt();
		System.out.println("Enter a number for year: ");
		int year = sc.nextInt();
		int number_of_daysInMonth = 0;
		String month_Name = "";
		switch (month) {
		case 1:
			month_Name = "January";
			number_of_daysInMonth = 31;
			break;
		case 2:
			month_Name = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				number_of_daysInMonth = 29;
			}
			else {
				number_of_daysInMonth = 29;
			}
			break;
		case 3:
			month_Name = "March";
			number_of_daysInMonth = 31; 
			break;
		case 4:
			month_Name = "April";
			number_of_daysInMonth = 30; 
			break;
		case 5:
			month_Name = "May";
			number_of_daysInMonth = 31; 
			break;
		case 6:
			month_Name = "June";
			number_of_daysInMonth = 30; 
			break;
		case 7:
			month_Name = "July";
			number_of_daysInMonth = 31; 
			break;
		case 8:
			month_Name = "August";
			number_of_daysInMonth = 31; 
			break;
		case 9:
			month_Name = "September";
			number_of_daysInMonth = 30; 
			break;
		case 10:
			month_Name = "October";
			number_of_daysInMonth = 31; 
			break;
		case 11:
			month_Name = "November";
			number_of_daysInMonth = 30; 
			break;
		case 12:
			month_Name = "December";
			number_of_daysInMonth = 31;
		}
		System.out.print(month_Name + " " + year + " has " + number_of_daysInMonth + " days\n");
		sc.close();
	}
}
