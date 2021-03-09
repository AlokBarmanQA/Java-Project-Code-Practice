package strings;

public class Convert_String_Lowercase {

	public static void main(String[] args) {
		// Write a Java program to convert all the characters in a string to lowercase.
		
		String original = "The Quick BroWn FoX  !     ";
		
		String lowercase_string = original.toLowerCase();
		
		String uppercase_string = original.toUpperCase();
		
		String trim_string = original.trim().toLowerCase();
		
		System.out.println(lowercase_string);
		System.out.println(uppercase_string);
		System.out.println(trim_string);
	}

}
