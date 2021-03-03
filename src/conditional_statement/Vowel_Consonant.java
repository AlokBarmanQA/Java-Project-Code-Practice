package conditional_statement;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		/*
		 * Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or 
		 * Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), 
		 * or is a string of length > 1, print an error message.
		 * need to use ASCII printable characters. A-Z: 65-90; a-z: 97-122
		 * https://theasciicode.com.ar/ascii-printable-characters/capital-letter-a-uppercase-ascii-code-65.html
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alphabet: ");
		String alphabet = sc.next().toLowerCase();
		
		boolean vowel = alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u");
		boolean uppercase_alphabet = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
		boolean lowercase_alphabet = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
		
		if (alphabet.length() > 1) {
			System.out.println("Error. Not a single character");
		}
		else if (! uppercase_alphabet || lowercase_alphabet) {
			System.out.println("Error. Not an alphabet. Enter an alphabet");
		}
		else if (vowel) {
			System.out.println("Input alphabet is vowel");
		}
		else {
			System.out.println("Input alphabet is consonant");
		}
		sc.close();
	}

}
