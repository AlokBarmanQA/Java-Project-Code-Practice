package conditional_statement;

import java.util.Scanner;

public class Small_Large {

	public static void main(String[] args) {
/*		Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
		Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, 
		or "large" if it exceeds 1,000,000.
*/
		Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0) {
        	if (input < 1) {
        		System.out.println(input + " is small number");
        	}
        	else if (input > 1000000) {
        		System.out.println(input + " is large number");
        	}
        	else {
        		System.out.println(input + " is positive number");
        	}
        }
        else if(input < 0) {
        	if (Math.abs(input) < 1) {
        		System.out.println(input + " is small negative number");
        	}
        	else if (Math.abs(input) > 1000000) {
        		System.out.println(input + " is large negative number");
        	}
        	else {
        		System.out.println(input + " is negative number");
        	}
        }
        else {
        	System.out.println(input + " is zero");
        }
        in.close();
	}

}
