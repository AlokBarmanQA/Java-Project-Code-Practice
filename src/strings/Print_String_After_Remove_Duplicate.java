package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Print_String_After_Remove_Duplicate {

	public static void main(String[] args) {
		// Write a Java program to print after removing duplicates from a given string.
		
		String input = "w3resourrrceee";
		char cha[] = input.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		for(Character ch : cha) {
			set.add(ch);
		}
		System.out.println(set.toString());
		
		String new_string ="";
		for(Character c : cha) {
//The java string indexOf() method returns index of given character value or substring. 
//If it is not found, it returns -1. The index counter starts from zero.
			System.out.println(new_string.indexOf(c));
			if(new_string.indexOf(c) == -1) {
				new_string = new_string + c;
			}
		}
		System.out.println(new_string);
	}

}
