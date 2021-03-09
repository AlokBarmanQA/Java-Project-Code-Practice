package strings;

import java.util.Scanner;

public class Compare_Two_String {

	public static void main(String[] args) {
		// Write a Java program to check whether two String objects contain the same data.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first sentence:");
		String sentence1 = sc.next();
		System.out.println("Enter second sentence:");
		String sentence2 = sc.next();
		
		if(sentence1.equalsIgnoreCase(sentence2)) {
			System.out.println("\""+sentence1+"\" and "+"\""+sentence2+"\" contain same data");
		}
		else {
			System.out.println("\""+sentence1+"\" and "+"\""+sentence2+"\" contain different data");
		}
				
		String original = "Stephen Edwin King";
		String compare1 = "Walter Winchell";
		String compare2 = "stephen edwin king";
		
		boolean checkpoint1 = original.equalsIgnoreCase(compare1);
		boolean checkpoint2 = original.equalsIgnoreCase(compare2);
		
		System.out.println(checkpoint1);
		System.out.println(checkpoint2);
	}

}
