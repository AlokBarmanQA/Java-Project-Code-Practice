package basic_practice;

public class Reverse_String {

	public static void main(String[] args) {
		// 37. Write a Java program to reverse a string.
		//***expected output: xof nworb kciuq ehT
		String input = "The quick brown fox";
		int len = input.length();
		String reverse = "";
		for (int i=len-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);
		
		//***expected output: fox brown quick The
		String reverse2 = "";
		String[] words = input.split(" ");
		int length = words.length;
		for (int j=length-1; j>=0; j--) {
			reverse2 = reverse2 + words[j]+ " ";
		}
		System.out.println(reverse2);
		
		// Reverse String keep Reverse White Space
		//***expected output: namr aBram uKkolA
		String input2 = "Alok Kumar Barman";
		char[] character = input2.toCharArray();
		int length2 = character.length;
		int start = 0;
		int end = length2-1;

		while(start<end) {
			if (character[start]==' ') {
				start++;
			}
			else if (character[end]==' ') {
				end--;
			}
			else {
				char temp = character[start];
				character[start] = character[end];
				character[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(character);
		System.out.println(String.valueOf(character));
	}

}
