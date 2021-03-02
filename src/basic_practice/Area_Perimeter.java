package basic_practice;

public class Area_Perimeter {

	public static void main(String[] args) {
		// Write a Java program to print the area and perimeter of a circle.
		
		final double redious = 7.5;

		double perimeter = 2 * Math.PI * redious;
		double area = Math.PI * redious * redious;
		
		System.out.println("Perimeter is: "+perimeter);
		System.out.println("Area is: "+area);
	}

}
