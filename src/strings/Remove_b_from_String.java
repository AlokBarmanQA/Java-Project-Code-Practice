package strings;

public class Remove_b_from_String {

	public static void main(String[] args) {
		// Write a Java program to remove "b" and "ac" from a given string.
		
		String str = "ababaac";
		char ch[] = str.toCharArray();
		int n = str.length();
		StringBuilder sb = new StringBuilder();
		String new_str = "";
		for(int i=0; i<n; i++) {
			if(ch[i] == 'b') {
				continue;
			}
			else if(ch[i] == 'a' && ch[i+1] == 'c') {
				
				continue;
			}
			else {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}

}
