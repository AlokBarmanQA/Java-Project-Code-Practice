package arrays;

public class Maximum_Minimum_Value {

	public static void main(String[] args) {
		// 10. Write a Java program to find the maximum and minimum value of an array.

		int my_array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int max = my_array[0];
		int min = my_array[0];

		for(int i=0; i<my_array.length; i++) {

			if(my_array[i] > max) {
				max = my_array[i];	
			}
			else if(my_array[i] < min){
				min = my_array[i];	
			}
		}
		System.out.println(max+" is maximum number");
		System.out.println(min+" is minimum number");
	}

}
