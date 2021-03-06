package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_In_Array {

	public static void main(String[] args) {
		// Write a Java program to find the duplicate values of an array of integer values.
		
		int my_array[] = {11, 93, 23, 39, 56, 11, 92, 23, 23, 23, 39, 39};
		System.out.println("Duplicate number: ");
		for(int i=0; i<my_array.length; i++) {
			for(int j=i+1; j<my_array.length; j++) {
				if(my_array[i] == my_array[j]) {
					System.out.print(my_array[j]+" ");
				}
			}
		}
		System.out.println();
		// Second method
		Set <Integer> set = new HashSet<Integer>();
		for(Integer number: my_array) {
			if(!set.add(number)) {
				System.out.print(number+" ");
			}
		}
		System.out.println();
		// Third method
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer numbers:my_array) {
			if(map.containsKey(numbers)) {
				map.put(numbers, map.get(numbers)+1);
			}
			else {
				map.put(numbers, 1);
			}
		}
		Set <Integer> keyset = map.keySet();
		for(Integer number:keyset) {
			if(map.get(number) > 1) {
				System.out.println(number + "-" +map.get(number));
			}
		}
	}

}
