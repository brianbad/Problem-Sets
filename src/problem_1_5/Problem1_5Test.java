package problem_1_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_5Test {

	@Test
	public void test1() {
		boolean result = Problem1_5.isOneAway("pale", "ple");
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		boolean result = Problem1_5.isOneAway("pales", "pale");
		assertEquals(true, result);
	}
	
	@Test
	public void test3() {
		boolean result = Problem1_5.isOneAway("pale", "bale");
		assertEquals(true, result);
	}
	
	@Test
	public void test4() {
		boolean result = Problem1_5.isOneAway("pale", "bae");
		assertEquals(false, result);
	}
	
	@Test
	public void test5() {
		boolean result = Problem1_5.isOneAway("pale", "paless");
		assertEquals(false, result);
	}
	
	@Test
	public void test6() {
		boolean result = Problem1_5.isOneAway("brian", "rian");
		assertEquals(true, result);
	}
	
	@Test
	public void test7() {
		boolean result = Problem1_5.isOneAway("", "aa");
		assertEquals(false, result);
	}
	
	@Test
	public void test8() {
		boolean result = Problem1_5.isOneAway("", "");
		assertEquals(true, result);
	}
	
	@Test
	public void test9() {
		boolean result = Problem1_5.isOneAway("test", "test");
		assertEquals(true, result);
	}
	
	@Test
	public void test10() {
		boolean result = Problem1_5.isOneAway("a much longer string", "a much longer strings");
		assertEquals(true, result);
	}

}
