package problem_1_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_3Test {

	@Test
	public void test1() {
		String result = Problem1_3.URLify("Mr John Smith    ".toCharArray(), 13);
		assertEquals(result, "Mr%20John%20Smith");
	}
	
	@Test
	public void test2() {
		String result = Problem1_3.URLify("My name is Brian      ".toCharArray(), 16);
		assertEquals(result, "My%20name%20is%20Brian");
	}
	
	@Test
	public void test3() {
		String result = Problem1_3.URLify("I really like to program        ".toCharArray(), 24);
		assertEquals(result, "I%20really%20like%20to%20program");
	}
	
	@Test
	public void test4() {
		String result = Problem1_3.URLify("         ".toCharArray(), 3);
		assertEquals(result, "%20%20%20");
	}

}
