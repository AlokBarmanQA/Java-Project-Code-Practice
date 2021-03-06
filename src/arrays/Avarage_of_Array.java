package arrays;

public class Avarage_of_Array {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements.
		
		int numbers[] = {2, 3, 9, 8, 4, 7};
		
		int length = numbers.length;
		
		int sum = 0;
		
		for(int number : numbers) {
			sum = sum + number;
		}
		double avg = sum / length;
		
		System.out.println("Avarage of the given integer array: "+avg);
		
	       int[] number = new int[]{20, 30, 25, 35, -16, 60, -100};
	       //calculate sum of all array elements
	       int sum1 = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum1 = sum1 + number[i];
	       //calculate average value
	        double average = sum1 / number.length;
	        System.out.println("Average value of the array elements is : " + average); 
	}

}
