package basic_practice;

public class Swipe_Two_Variables {

	public static void main(String[] args) {
		// Write a Java program to swap two variables.
		
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("New values : a = "+a+" and b = "+b);
		
		// with third variable
		int k = 30;
		int l = 40;
		int m = k;
			k = l;
			l = m;
		System.out.println("New values : k = "+k+" and l = "+l);
		
	}

}
