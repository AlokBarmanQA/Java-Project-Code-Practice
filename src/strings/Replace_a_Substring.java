package strings;

public class Replace_a_Substring {

	public static void main(String[] args) {
/*
 * Write a Java program to replace each substring of a given string that matches the given 
 * regular expression with the given replacement.
 */
		String original = "The quick brown fox jumps over the lazy dog.";
		
		String replace_word = original.substring(16, 19);
		
		String new_string = original.replace(replace_word, "cat");
//		String new_string = original.replaceAll(replace_word, "cat");
		
		String new_string_2 = original.replaceAll("brown", "black");
		
		System.out.println(new_string);
		System.out.println(new_string_2);
	}

}
