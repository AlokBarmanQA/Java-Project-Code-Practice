package strings;

import java.util.HashMap;
import java.util.Set;

public class Count_Character_Occurance {

	public static void main(String[] args) {
		// Write a Java program to find the second most frequent character in a given string.

		String str = "aabbbccccde";

		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();

		for(Character chr : set) {
			if(map.get(chr) > 0) {
				System.out.println(chr +"--"+ map.get(chr));
			}
		}
	}

}
