package arrays;

import java.util.Arrays;

public class Longest_Common_Prefix_in_Array_String {

	public static void main(String[] args) {
		String[] arr = {"mint", "mimi", "mineral"};
		int size = arr.length;
		if(size == 0) {
			System.out.println("Longest common prefix: ");
		}
		else if(size == 1) {
			System.out.println("Longest common prefix: " + arr[0]);
		}
		else {
			System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			int length = arr[0].length();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<length; i++) {
				if(arr[0].charAt(i) == arr[size-1].charAt(i)) {
					sb.append(arr[0].charAt(i));
				}
				else {
					break;
				}
			}
			String result = sb.toString();
			System.out.println("Longest common prefix: " + result);
		}
	}

}
