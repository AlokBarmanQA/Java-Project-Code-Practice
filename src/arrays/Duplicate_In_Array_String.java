package arrays;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_In_Array_String {

	public static void main(String[] args) {
		// Write a Java program to find the duplicate values of an array of string values. 

		String arr[] = {"Qtp", "QTP", "Python", "qtp", "Javascript", "Java", "java"};
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String words : arr) {
			if(map.containsKey(words)) {
				map.put(words, map.get(words)+1);
			}
			else {
				map.put(words, 1);
			}
		}
		for(String word : map.keySet()) {
			if(map.get(word) > 1) {
				System.out.println(word + "-" + map.get(word));
			}
		}
	}

}
