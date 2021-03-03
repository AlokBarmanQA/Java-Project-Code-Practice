package conditional_statement;

public class Quadratic_Equation {

	public static void main(String[] args) {
		// Write a Java program to solve quadratic equations
		// Output: The roots are -0.4384471871911697 and -4.561552812808831
		double a = 1;
		double b = 5;
		double c = 2;
		
		double result = b * b - 4.0 * a * c;
		
		if (result > 0) {
			double root1 = (- b + Math.sqrt(result)) / (2.0 * a);
			double root2 = (- b - Math.sqrt(result)) / (2.0 * a);
			System.out.println("The roots are: "+ root1 +" and "+ root2);
		}
		else if (result == 0) {
			double root = -b / (2.0 * a);
			System.out.println("The root is: "+ root);
		}
		else {
			System.out.println("The equation has no real root");
		}
	}

}
