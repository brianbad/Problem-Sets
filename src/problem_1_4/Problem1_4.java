package problem_1_4;

public class Problem1_4 {

	/**
	 * Given a string, write a function to check if it is a permutation of a 
	 * palindrome. A palindrome is a word or phrase that is the same forwards and 
	 * backwards. A permutation is a rearrangement of letters. The palindrome does
	 * not need to be limited to just dictionary words. You can ignore casing and 
	 * non-letter characters.
	 * 
	 * IDEA: Track occurrences using a boolean array representing the alphabet.
	 * Palindromes must have an even number of characters, with the possible exception
	 * of 1 extra character. If we loop through the string and end with more than 1
	 * boolean flag flipped to True, then we return false. Otherwise return true.
	 * 
	 * @param s String to be evaluated.
	 * 
	 * @return Whether or not the string is a permutation of a palindrome.
	 */
	public static boolean isPalindrome(String s) {
		// Ignore case
		s = s.toLowerCase();
		
		boolean[] alphabet = new boolean[26];
		
		// Loop through string, toggling respective boolean fields for each character.
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// Ignoring special characters here...
			if (c >= 'a' && c <= 'z') {
				alphabet[c - 'a'] = !alphabet[c - 'a'];
			}
		}
		
		//foundTrue keeps track if there was already a True value.
		boolean foundTrue = false;
		for (int i = 0; i < alphabet.length; i++) {
			// If a True value is found and we have already seen another True value, return False.
			if (alphabet[i]) {
				if (foundTrue) return false;
				else foundTrue = true;
			}
		}
		return true;
	}
}
