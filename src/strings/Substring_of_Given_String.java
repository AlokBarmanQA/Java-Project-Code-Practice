package strings;

public class Substring_of_Given_String {

	public static void main(String[] args) {
		// Write a Java program to get a substring of a given string between two specified positions.
		
		String original = "The quick brown fox jumps over the lazy dog";
		// brown fox jumps, 10, 25
		String new_string_index = original.substring(10, 25);
		
		System.out.println(new_string_index);
	}

}
