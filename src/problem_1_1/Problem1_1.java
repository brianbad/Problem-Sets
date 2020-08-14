package problem_1_1;

import java.util.Arrays;

public class Problem1_1 {
	
	/**
	 * Problem 1.1
	 * Implement an algorithm to determine if a string has all unique characters. 
	 * 
	 */
	public static boolean hasUniqueCharacters(String s) {
		// Sort the characters in the string
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		
		// If any adjacent characters are the same, return false;
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == charArray[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * What if you
	 * cannot use additional data structures?
	 */
}
