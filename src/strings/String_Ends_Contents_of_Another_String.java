package strings;

public class String_Ends_Contents_of_Another_String {

	public static void main(String[] args) {
		// Write a Java program to check whether a given string ends with the contents of another string
		
		String str1 = "Java exercises";
		String str2 = "Java exercise";
		
		String end_string = "se";
		
		boolean checkpoint1 = str1.endsWith(end_string);
		boolean checkpoint2 = str2.endsWith(end_string);
		
		System.out.println(str1 + " ends with "+end_string+" ->> "+checkpoint1);
		System.out.println(str2 + " ends with "+end_string+" ->> "+checkpoint2);
		
        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " + "\"" + end_string + "\"? " + checkpoint1);
        System.out.println("\"" + str2 + "\" ends with " + "\"" + end_string + "\"? " + checkpoint2);
	}

}
