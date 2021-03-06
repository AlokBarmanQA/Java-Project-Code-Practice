package conditional_statement;

import java.util.Scanner;

public class Count_Integer_Digits {

	public static void main(String[] args) {
		// Write a Java program that reads an positive integer and count the number of digits the number 
		//(less than ten billion) has.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number less than ten billion:");
		boolean long_number = sc.hasNextLong();
		
		if(long_number) {
			long num = sc.nextLong();
			
			if(num < 0) {
				num *= -1;
				System.out.println("-"+num);
			}
			else if(num > 10000000000L) {
				System.out.println(num+" is more than ten billion");
			}
			else {
				int digit = 1;
				if(num >= 10 && num < 100) {
					digit = 2;
				}
				else if(num >= 100 && num < 1000) {
					digit = 3;
				}
				else if(num >= 1000 && num < 10000) {
					digit = 4;
				}
				else if(num >= 10000 && num < 100000) {
					digit = 5;
				}
				else if(num >= 100000 && num < 100000) {
					digit = 6;
				}
				else if(num >= 1000000 && num < 10000000) {
					digit = 7;
				}
				else if(num >= 10000000 && num < 100000000) {
					digit = 8;
				}
				else if(num >= 100000000 && num < 1000000000) {
					digit = 9;
				}
				else if(num >= 1000000000 && num < 10000000000L) {
					digit = 10;
				}
				System.out.println("Number of digits in the number: "+digit);
			}
		}
		else {
			System.out.println("The number is not a integer");
		}
		sc.close();
	}

}
