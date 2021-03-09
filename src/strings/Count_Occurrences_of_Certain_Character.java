package strings;

public class Count_Occurrences_of_Certain_Character {

	public static void main(String[] args) {
		// Write a Java program to counts occurrences of a certain character in a given string.
		
		String input = "abcdaefgahijakla";
		int length = input.length();
		char ch = 0;
		int count = 0;
		for(int i=0; i<length; i++) {
			ch = input.charAt(i);
			if(ch == 'a' || ch == 'A') {
				count++;
			}
		}
		System.out.println("Total count of "+ch+" is: "+count);
	}

}
