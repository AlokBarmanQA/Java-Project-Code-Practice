package strings;

public class String_to_int_long_float_double {

	public static void main(String[] args) {
		// Write a Java program to convert a given String to int, long, float and double.
/* valueOf () returns an Integer object, while Integer.parseInt () returns an int primitive. 
 * parseInt () parses String to int while valueOf () additionally wraps this int into Integer.
 */
		String string_to_int = "1234";
		String string_to_long = "1234567890";
		String string_to_float = "1234.5678f";
		String string_to_double = "90.12d";
		
		Integer to_int1 = Integer.valueOf(string_to_int);
		int to_int2 = Integer.parseInt(string_to_int);
		System.out.println(to_int1);
		System.out.println(to_int2);
		
		Long to_long1 = Long.valueOf(string_to_long);
		long to_long2 = Long.parseLong(string_to_long);
		System.out.println(to_long1);
		System.out.println(to_long2);
		
		Float to_float1 = Float.valueOf(string_to_float);
		float to_float2 = Float.parseFloat(string_to_float);
		System.out.println(to_float1);
		System.out.println(to_float2);
		
		Double to_double1 = Double.valueOf(string_to_double);
		double to_double2 = Double.parseDouble(string_to_double);
		System.out.println(to_double1);
		System.out.println(to_double2);
	}

}
