package strings;

import java.util.LinkedHashMap;

public class Longest_Substring_Without_Repeating_Characters_Map {
	//Write a Java program to find Length of the longest substring without repeating characters.
	public static void main(String[] args) {

		String inputString = "abcdeabcd";// pickoutthelongestsubstring
		char[] arr1 = inputString.toCharArray();
		int str_length = 0;
		
		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<arr1.length; i++) {
			char ch = arr1[i];
			if(!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			}
			else {
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
		}
		if(charPosMap.size() > str_length) {
			str_length = charPosMap.size();
			String long_str = charPosMap.keySet().toString();
			System.out.println(long_str);
		}
		System.out.println(str_length);
	}
}
