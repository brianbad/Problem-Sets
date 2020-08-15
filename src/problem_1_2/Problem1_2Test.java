package problem_1_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_2Test {

	@Test
	public void test1() {
		boolean result = Problem1_2.isPermutation("brian".toCharArray(), "nairb".toCharArray());
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		boolean result = Problem1_2.isPermutation("brian".toCharArray(), "nairba".toCharArray());
		assertEquals(false, result);
	}
	
	@Test
	public void test3() {
		boolean result = Problem1_2.isPermutation("a bigger test".toCharArray(), "sa bg teirget".toCharArray());
		assertEquals(true, result);
	}

	@Test
	public void test4() {
		boolean result = Problem1_2.isPermutation("java7".toCharArray(), "java8".toCharArray());
		assertEquals(false, result);
	}
	
	@Test
	public void test5() {
		boolean result = Problem1_2.isPermutation("something".toCharArray(), "".toCharArray());
		assertEquals(false, result);
	}

	


}
