package strings;

public class Create_New_String_Object {

	public static void main(String[] args) {
		// Write a Java program to create a new String object with the contents of a character array
		
		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		
		String str = String.copyValueOf(ch, 0, 4);
		
		System.out.println(str);
		
        // Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containig the contents of arr_num
        // starting at index 1 for length 2.
        String str1 = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("\nThe book contains " + str1 +" pages.\n");
	}

}
