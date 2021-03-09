package strings;

public class Palindromic_Substring {

	public static void main(String[] args) {
		// Write a Java program to find longest Palindromic Substring within a string.
		
		String original = "thequickbrownfoxxofnworbquickthe";
		
		//thequickbrownfoxxofnworbquickthe
		//ehtkciuqbrownfoxxofnworbkciuqeht
		//brownfoxxofnworb
		StringBuilder sb = new StringBuilder(original);
		sb.reverse();
		System.out.println(sb);
		
	}

}
