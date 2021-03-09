package strings;

public class String_Contains_Only_Digits {

	public static void main(String[] args) {
		// Write a Java program to test if a given string contains only digits. Return true or false.
		
	       String digit_string1 = "131231231231231231231231231212312312";
	       String digit_string2 = "13123123123Z1231231231231231212312312";
	       
	       System.out.println(test_only_digits(digit_string1));
	       System.out.println(test_only_digits(digit_string2));
	}

	public static boolean test_only_digits(String input) {
		
		for(int i=0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(! Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}
}
