package problem_2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem2_1Test {

	@Test
	public void test1() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(2);
		Problem2_1.removeDuplicates(list);
		assertEquals("1->2->", list.toString());
	}
	
	@Test
	public void test2() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(1);
		list.addElement(1);
		list.addElement(2);
		list.addElement(2);
		list.addElement(2);
		list.addElement(2);
		Problem2_1.removeDuplicates(list);
		assertEquals("1->2->", list.toString());
	}
	
	@Test
	public void test3() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		Problem2_1.removeDuplicates(list);
		assertEquals("1->", list.toString());
	}
	
	@Test
	public void test4() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(4);
		list.addElement(5);
		Problem2_1.removeDuplicates(list);
		assertEquals("1->2->3->4->5->", list.toString());
	}

}
