package strings;

import java.util.HashMap;
import java.util.Map;

public class First_Non_Repeated_Character {

	public static void main(String[] args) {
		// Write a Java program to find first non repeating character in a string.
		
		String input = "ABCABCDEFGEFGHIJKIJKLMNOMNOP";
		int length = input.length();
		char ch;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<length; i++) {
			ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(int j=0; j<length; j++) {
			ch = input.charAt(j);
			if(map.get(ch) == 1) {
				System.out.println("First non-repeated character is: "+ch);
				break;
			}
		}
	}

}
