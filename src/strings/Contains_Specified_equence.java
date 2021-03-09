package strings;

public class Contains_Specified_equence {

	public static void main(String[] args) {
		// Write a Java program to test if a given string contains the specified sequence of char values
		
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
	}

}
