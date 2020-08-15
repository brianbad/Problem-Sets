package problem_1_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_4Test {

	@Test
	public void test1() {
		boolean result = Problem1_4.isPalindrome("Tact Coa");
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		boolean result = Problem1_4.isPalindrome("Racecar");
		assertEquals(true, result);
	}
	
	@Test
	public void test3() {
		boolean result = Problem1_4.isPalindrome("brian");
		assertEquals(false, result);
	}
	
	@Test
	public void test4() {
		boolean result = Problem1_4.isPalindrome("r   ac^ec))ar");
		assertEquals(true, result);
	}
	
	@Test
	public void test5() {
		boolean result = Problem1_4.isPalindrome("");
		assertEquals(true, result);
	}

}
