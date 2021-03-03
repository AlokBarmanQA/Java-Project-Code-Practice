package conditional_statement;

import java.util.Scanner;

public class Sum_Avarage_02 {

	public static void main(String[] args) {
		//12. Write a program in Java to input 5 numbers from keyboard and find their sum and average.
		
		System.out.println("Input the 5 numbers : ");
		
		int i, num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("Sum of five numbers is: "+ sum);
		
		double avarage = sum/5;
		
		System.out.println("Avarage of five numbers is: "+ avarage);
		
		sc.close();
	}

}
