package problem_1_6;

public class Problem1_6 {

	/**
	 *  Implement a method to perform basic string compression using the counts
	 *  of repeated characters. For example, the string 'aabcccccaaa' would become 
	 *  'a2b1c5a3'. If the compressed string would not become smaller than the original
	 *  string, your method should return the original string you can assume the string
	 *  has only uppercase and lowercase letters (a-z).
	 *  
	 *  IDEA:
	 *  - Loop through String [O(n)]
	 *  	- Track 'currentChar' and the number of occurences so far.
	 *  	- If the next character is different from 'currentChar', 
	 *  	  write (currentChar + occurences) to the compressedString.
	 *  - if (compressed.length < s.length)
	 *  	- return compressed;
	 *  - else return s;
	 *  
	 *  HINT:
	 *  - Updated to use StringBuilder.
	 *  
	 * @param s
	 * @return
	 */
	public static String stringCompression(String s) {
		// Disqualify strings with 0 length.
		if (s.length() == 0) {
			return s;
		}
		
		// Initialize compressedString and initial character trackers.
		StringBuilder compressedString = new StringBuilder();
		char currentChar = s.charAt(0);
		int charOccurences = 1;
		
		// Loop through remainder of the string
		for (int i = 1; i < s.length(); i++) {
			// If a new character is found, record trackers to compressedString and reset
			// the trackers.
			if (s.charAt(i) != currentChar) {
				compressedString.append(currentChar + "" + charOccurences);
				currentChar = s.charAt(i);
				charOccurences = 1;
			}
			// Else increment counter.
			else {
				charOccurences++;
			}
		}
		
		// After the loop, we need to record the final tracker values.
		compressedString.append(currentChar + "" + charOccurences);
		
		// Return the shorter of compressedString and s.
		if (compressedString.toString().length() < s.length()) return compressedString.toString();
		else return s;
	}
}
