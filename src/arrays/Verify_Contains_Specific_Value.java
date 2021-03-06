package arrays;

public class Verify_Contains_Specific_Value {

	public static void main(String[] args) {
		// Write a Java program to test if an array contains a specific value.
		int[] my_array = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
		
		System.out.println(verifySpecificNumber(my_array, 2265));
		
		System.out.println(verifySpecificNumber(my_array, 1459));
	}

	public static boolean verifySpecificNumber(int[] array1, int number) {
		for(int numbers : array1) {
			
			if(numbers == number) {
				return true;
			}
		}
		return false;
	}

}
