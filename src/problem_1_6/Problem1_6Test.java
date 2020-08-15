package problem_1_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_6Test {

	@Test
	public void test1() {
		String result = Problem1_6.stringCompression("aabcccccaaa");
		assertEquals("a2b1c5a3", result);
	}
	
	@Test
	public void test2() {
		String result = Problem1_6.stringCompression("ghrtttttiioooooooooo");
		assertEquals("g1h1r1t5i2o10", result);
	}
	
	@Test
	public void test3() {
		String result = Problem1_6.stringCompression("abc");
		assertEquals("abc", result);
	}
	
	@Test
	public void test4() {
		String result = Problem1_6.stringCompression("aa");
		assertEquals("aa", result);
	}
	
	@Test
	public void test5() {
		String result = Problem1_6.stringCompression("");
		assertEquals("", result);
	}

}
