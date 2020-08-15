package problem_1_2;

import java.util.Arrays;

public class Problem1_2 {
	
	/**
	 * Given two strings, write a method to decide if one is a permutation
	 * of the other.
	 * 
	 * @char[] s1 - String 1 input as char array. Not null.
	 * @char[] s2 - String 2 input as char array. Not null.
	 * 
	 */
	public static boolean isPermutation(char[] s1, char[] s2) {
		// Sort both strings - O(nlogn)
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		// If the strings are the same, return true.
		if (new String(s1).equals(new String(s2))) return true;
		else return false;
	}

}
