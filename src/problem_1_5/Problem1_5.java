package problem_1_5;

public class Problem1_5 {
	
	/**
	 * There are three types of edits that can be performed on strings
	 * 	- Insert a character
	 * 	- Remove a character
	 * 	- Replace a character
	 * 
	 * Given two strings, write a function to check if they are one 
	 * edit (or zero edits) away.
	 * 
	 * IDEA:
	 *  - If the difference in length is >2, we can return false automatically.
	 *  - If the difference in length is exactly 1, we remove the character at 
	 *    that index in the longer string, then compare the two strings for equality.
	 *  - If the difference in length is exactly 0, we simply verify that there is at
	 *    most 1 character mismatch throughout the two strings.
	 * 
	 * @param s1 The first string.
	 * @param s2 The second string.
	 * 
	 * @return
	 */
	public static boolean isOneAway(String s1, String s2) {
		// If length difference is >2, return false.
		if (Math.abs(s1.length() - s2.length()) >= 2) {
			return false;
		}
		// If length difference is exactly 1...
		else if (Math.abs(s1.length() - s2.length()) == 1) {
			// Determine the longer string, and the minimum length between the two.
			boolean s1Longer = (s1.length() > s2.length()) ? true : false;
			int minLength = (s1.length() > s2.length()) ? s2.length() : s1.length();
			
			// Loop through the strings, stopping at minLength
			for (int i = 0; i < minLength; i++) {
				// If there is a character mismatch...
				if (s1.charAt(i) != s2.charAt(i)) {
					// ... remove the mismatched character from the longer string
					if (s1Longer) {
						s1 = s1.substring(0, i) + s1.substring(i + 1, s1.length());
					} else {
						s2 = s2.substring(0, i) + s2.substring(i + 1, s2.length());
					}
					// Compare the result
					return (s1.equals(s2));
				}
			}
			
			// If this block is reached, the only difference between the two strings is the 
			// last character of the longer string. Meaning this is a 1 insert difference.
			return true;
		}
		// If the lengths are the same
		else {
			boolean foundMismatch = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s1.charAt(i)) {
					if (foundMismatch) return false;
					else foundMismatch = true;
				}
			}
			return true;
		}
	}

}
