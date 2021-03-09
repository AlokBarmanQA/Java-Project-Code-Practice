package strings;

import java.text.DecimalFormat;

public class Integer_to_String_Conversions {

	public static void main(String[] args) {
		// Different ways for Integer to String Conversions In Java
		
		int number = 12345;
		
		String way1 = Integer.toString(number);
		String way2 = String.valueOf(number);
		String way3 = String.valueOf(98765);
		
		System.out.println("String number way1: "+ way1);
		System.out.println("String number way2: "+ way2);
		System.out.println("String number way3: "+ way3);

	    DecimalFormat df1 = new DecimalFormat("#");
	    String way4 = df1.format(number);
	    System.out.println("String number way4: "+ way4);
	    
	    DecimalFormat df = new DecimalFormat("#,###");
	    String way5 = df.format(number);
		System.out.println("String number way5: "+ way5);
		
	    StringBuffer sb = new StringBuffer();
	    sb.append(number);
	    String way6 = sb.toString();
	    System.out.println("String number way6: "+ way6);
	    
	    String way7 = new StringBuilder().append(12345).toString();
	    System.out.println("String number way7: "+ way7);
	}

}
