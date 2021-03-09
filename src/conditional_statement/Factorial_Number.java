package conditional_statement;

public class Factorial_Number {

	public static void main(String[] args) {
		
		System.out.println(factorial(7));
		System.out.println(factorial(0));
	}
	 static int factorial(int n){  
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }  

}
