package strings;

import java.util.HashMap;
import java.util.Set;

public class Maximum_Occurance {
	public static void countOccurrence(String str){

		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;

		for (char ch : arr) {
			if(ch == ' '){
				continue;
			}
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> set = map.keySet();

		for (char c : set) {
			if (max == 0 || map.get(c) > max) {
				max = map.get(c);
			}
		}

		for (Character o : map.keySet()) {
			if (map.get(o).equals(max)) {
				System.out.println(o);
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		countOccurrence("aabbbcdddde");
	}
}
