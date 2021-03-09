package strings;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters_Set {
	//Write a Java program to find Length of the longest substring without repeating characters.
	// output: [u, b, s, t, r, i, n, g], Character=8
	public static void main(String[] args) {
		String inputString = "abcdabcdab";// pickoutthelongestsubstring
		int max_count = 0, i = 0, j = 0;
		int string_length = inputString.length();
		char ch[] = inputString.toCharArray();
		
		Set <Character> set = new HashSet <Character>();
		while(i < string_length && j < string_length) {
			if(!set.contains(ch[j])) {
				set.add(ch[j]);
				j++;
				max_count = Math.max(max_count, j-i);
			}
			else {
				set.remove(ch[j]);
				i++;
			}
		}
		System.out.println(set);
		System.out.println(max_count);
	}
}
