package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_Array_To_ArrayList {

	public static void main(String[] args) {
		// Write a Java program to convert an array to ArrayList.
		Integer[] intArr = {1, 1, 2, 2, 2, 10, 10, 11, 11, 11};
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(intArr));
		
		System.out.println(arrlist);
		
		String[] strArr = {"Qtp", "QTP", "Python", "qtp", "Javascript", "Java", "java"};
		
		ArrayList <String> list = new ArrayList <String> (Arrays.asList(strArr));
		
		System.out.println(list);
	}

}
