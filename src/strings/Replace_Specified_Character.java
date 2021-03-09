package strings;

public class Replace_Specified_Character {

	public static void main(String[] args) {
		// Write a Java program to replace a specified character with another character.
		
		String original = "The quick brown fox jumps over the lazy dog";
		
		String new_string = original.replace('d', 'f');
		
		System.out.println(new_string);
	}

}
