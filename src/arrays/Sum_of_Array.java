package arrays;

public class Sum_of_Array {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array.
		
		int numbers[] = {2,9,3,8,4,7,5};
		int sum = 0;
		for(int number : numbers) {
			sum = sum + number;
		}
		System.out.println("Sum of array "+ sum);
	}
}
