package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Common_Element_Between_Two_Array {

	public static void main(String[] args) {
		// Write a Java program to find the common elements between two arrays.

		String arr1[] = {"Qtp", "SQL", "Python", "qtp", "Javascript", "Java", "java"};
		String arr2[] = {"Perl", "SQL", "Python", "PHP", "Javascript", "Ruby", "java"};

		HashSet <String> set = new HashSet <String> ();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i].equals(arr2[j])) {
					set.add(arr1[i]);
					list.add(arr2[j]);
				}
			}
		}
		System.out.println(set);
		System.out.println(list);
		System.out.println("**************************************************");
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
		int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array1[i] == array2[i]) {
					hashset.add(array1[i]);
				}
			}
		}
		System.out.println(hashset);
	}

}
