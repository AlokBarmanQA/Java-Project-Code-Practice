package arrays;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_From_Array {

	public static void main(String[] args) {
		// Write a Java program to remove duplicate elements from an array.
		// 1. First method
		int[] intarray = {1, 2, 5, 5, 8, 9, 7, 10, 9};
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(Integer number : intarray) {
			hashset.add(number);
		}
		System.out.println(hashset);
		
		String[] strarray = {"qtp", "SQL", "Python", "qtp", "Javascript", "Java", "Java"};
		Set<String> set = new HashSet<String>();
		for(String word : strarray) {
			set.add(word);
		}
		System.out.println(set);
	}

}
