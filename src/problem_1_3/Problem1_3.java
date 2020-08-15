package problem_1_3;

public class Problem1_3 {
	
	/**
	 * Write a method to replace all spaces in a string with '%20'. 
	 * 
	 * You may assume that the string has sufficient space at the end to hold the 
	 * additional characters, and that you are given the "true" length of the strings. 
	 * 
	 * (Note: if implementing in Java, please use a character array so that you can 
	 * perform this operation in place.)
	 * 
	 * @param s The String to be modified.
	 * @param l The true length of the String s.
	 * @return The modified String.
	 * 
	 * 'Mr John Smith    ', 13
	 */
	public static String URLify(char[] s, int l) {
		// Keep track of which index we write new characters to.
		int tailIndex = s.length - 1;
		
		// Loop backwards, starting at the "true" end of the String.
		for (int i = l - 1; i >= 0; i--) {
			// If the char is ' ', write '%20' in the next available slots.
			if (s[i] == ' ') {
				s[tailIndex] = '0';
				s[--tailIndex] = '2';
				s[--tailIndex] = '%';
			} 
			// Else, simply move the character.
			else {
				s[tailIndex] = s[i];
			}
			tailIndex--;
		}
		
		return new String(s);
	}

}
