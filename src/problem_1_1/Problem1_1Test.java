package problem_1_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_1Test {

	@Test
	public void test1() {
		boolean result = Problem1_1.hasUniqueCharacters("unique".toCharArray());
		assertEquals(false, result);
	}
	
	@Test
	public void test2() {
		boolean result = Problem1_1.hasUniqueCharacters("brian".toCharArray());
		assertEquals(true, result);
	}
	
	@Test
	public void test3() {
		boolean result = Problem1_1.hasUniqueCharacters("a bigger test".toCharArray());
		assertEquals(false, result);
	}
	
	@Test
	public void test4() {
		boolean result = Problem1_1.hasUniqueCharacters("%$^*()_!".toCharArray());
		assertEquals(true, result);
	}
	
	@Test
	public void test5() {
		boolean result = Problem1_1.hasUniqueCharacters("".toCharArray());
		assertEquals(true, result);
	}

}
