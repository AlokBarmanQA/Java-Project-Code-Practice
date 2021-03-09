package strings;

public class Compare_Given_String_To_The_Specified_Character {

	public static void main(String[] args) {
		// Write a Java program to compare a given string to the specified character sequence.
		
		String str1 = "example.com";
		String str2 = "Example.com";
		
		CharSequence cs = "example.com";
		
		System.out.println(str1.contentEquals(cs));
		System.out.println(str2.contains(cs));
	}

}
