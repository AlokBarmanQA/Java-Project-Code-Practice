package arrays;

public class Index_of_Array_Element {

	public static void main(String[] args) {
		// Write a Java program to find the index of an array element.
		
		int[] my_array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
		int[] array = {};
		System.out.println(find_Index(my_array, 2035));
		System.out.println(find_Index(my_array, 2036));
		System.out.println(find_Index(array, 2036));
	}
	
	public static int find_Index(int[] arr, int number) {

		int len = arr.length;
		int i = 0;
		while(i < len) {
			if(arr[i] == number)
				return i;
			else
				i = i+1;
		}
		return -1;
	}

}
