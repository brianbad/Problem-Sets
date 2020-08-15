package problem_1_1;

import java.util.Arrays;

public class Problem1_1 {
	
	/**
	 * Problem 1.1
	 * Implement an algorithm to determine if a string has all unique characters. 
	 * 
	 * What if you cannot use additional data structures?
	 * 
	 * @char[] s - String received as array of characters. Not null.
	 * 
	 */
	public static boolean hasUniqueCharacters(char[] s) {
		// Sort the characters in the string
		Arrays.sort(s);
		
		// If any adjacent characters are the same, return false;
		for (int i = 1; i < s.length; i++) {
			if (s[i] == s[i-1]) {
				return false;
			}
		}
		return true;
	}
}
