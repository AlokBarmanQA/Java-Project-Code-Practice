package conditional_statement;

import java.util.Scanner;

public class Fibonnaci_Numbers {

	public static void main(String[] args) {

		int num = 7;
		int first = 0;
		int next = 1;
		System.out.print(first + " " + next);		
		for(int i = 1; i <= num-2; i++) {
			int sum = first + next;
			first = next;
			next = sum;
			System.out.print(" "+ sum);
		}
		System.out.println();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			System.out.print(fibonaccinumber(i)+" ");
		}
		sc.close();
	}
	public static int fibonaccinumber(int n) {

		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonaccinumber(n-1) + fibonaccinumber(n-2);

	} 
}
