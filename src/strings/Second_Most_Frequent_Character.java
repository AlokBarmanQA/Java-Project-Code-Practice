package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Second_Most_Frequent_Character {
	public static void main(String[] args) {
		String  a = "aabbccddd";
		System.out.println(getSecondMostFrequent(a));
	}

	public static char getSecondMostFrequent(String text) {

		char[] charArray = text.toCharArray();
		// calculate char frequencies
		Map<Character, Integer> charFrequenciesMap = new HashMap<Character, Integer>();
		// loop1
		for (char c : charArray) {
			int frequency = 1;
			if (charFrequenciesMap.get(c) != null) {
				frequency = charFrequenciesMap.get(c) + 1;
			}
			charFrequenciesMap.put(c, frequency);
		}

		int currentMostFrequency = 0;
		int currentSecondMostFrequency = 0;
		char mostFrequentChar = '\u0000';
		char secondMostChar = '\u0000';

		// find second most frequent char
		Iterator<Entry<Character, Integer>> charFrequencies
		= charFrequenciesMap.entrySet().iterator();
		// loop2
		while (charFrequencies.hasNext()) {
			Entry<Character, Integer> entry = charFrequencies.next();

			char currentChar = entry.getKey();
			int frequency = entry.getValue();

			if (frequency > currentMostFrequency) {
				secondMostChar = mostFrequentChar;
				currentSecondMostFrequency = currentMostFrequency;
				currentMostFrequency = frequency;
				mostFrequentChar = currentChar;
			} else if (frequency > currentSecondMostFrequency) {
				currentSecondMostFrequency = frequency;
				secondMostChar = currentChar;
			}
		}
		return secondMostChar;
	}
}
