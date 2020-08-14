package problem_1_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_1Test {

	@Test
	public void test1() {
		boolean result = Problem1_1.hasUniqueCharacters("unique");
		assertEquals(false, result);
	}
	
	@Test
	public void test2() {
		boolean result = Problem1_1.hasUniqueCharacters("brian");
		assertEquals(true, result);
	}
	
	@Test
	public void test3() {
		boolean result = Problem1_1.hasUniqueCharacters("a bigger test");
		assertEquals(false, result);
	}
	
	@Test
	public void test4() {
		boolean result = Problem1_1.hasUniqueCharacters("%$^*()_!");
		assertEquals(true, result);
	}
	
	@Test
	public void test5() {
		boolean result = Problem1_1.hasUniqueCharacters("");
		assertEquals(true, result);
	}

}
