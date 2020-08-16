package problem_2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void testInitial() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals("", list.toString());
	}
	
	@Test
	public void testAddIntegers() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		assertEquals("1->2->3->", list.toString());
	}
	
	@Test
	public void testAddStrings() {
		LinkedList<String> list = new LinkedList<String>();
		list.addElement("Java");
		list.addElement("Angular");
		list.addElement("React");
		assertEquals("Java->Angular->React->", list.toString());
	}
	
	@Test
	public void testRemoveInteger() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.removeElement(2);
		assertEquals("1->3->", list.toString());
	}
	
	@Test
	public void testRemoveFirstInteger() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.removeElement(1);
		assertEquals("2->3->", list.toString());
	}
	
	@Test
	public void testRemoveLastInteger() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.removeElement(3);
		assertEquals("1->2->", list.toString());
	}

}
