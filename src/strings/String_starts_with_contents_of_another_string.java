package strings;

public class String_starts_with_contents_of_another_string {

	public static void main(String[] args) {
		// Write a Java program to check whether a given string starts with the contents of another string.
		
		String str1 = "Red is favorite color.";                                                                 
		String str2 = "Orange is also my favorite color.";
		
		String start_string = "Red";
		
		boolean checkpoint1 = str1.startsWith(start_string);
		
		boolean checkpoint2 = str2.startsWith(start_string);
		
		System.out.println(checkpoint1);
		System.out.println(checkpoint2);
	}

}
