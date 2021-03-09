package strings;

import java.util.Calendar;

public class Current_Date_and_Time {

	public static void main(String[] args) {
		// Write a Java program to print current date and time in the specified format.
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Current Date and Time :");
		
		System.out.format("%tB %te, %tY%n", c, c, c);
		System.out.format("%tl %tM, %tp%n", c, c, c);
		System.out.format("%tD", c);
	}

}
