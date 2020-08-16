package problem_2_1;

/**
 * Custom LinkedList implementation.
 * 
 * @author Brian Badura
 *
 * @param <E>
 */
public class LinkedList<E> {

	/**
	 * Private inner class for node.
	 */
	public class LinkedListNode {
		public E data;
		public LinkedListNode next;
		
		public LinkedListNode(E data, LinkedListNode next) {
			this.data = data;
			this.next = next;
		}
	}
	
	/**
	 * Reference to head node.
	 */
	private LinkedListNode head;
	
	/**
	 * Constructor
	 */
	public LinkedList() {
		this.head = null;
	}
	
	public LinkedListNode getHead() {
		return this.head;
	}
	
	/**
	 * Adds a new node with the specified value to the end of the list.
	 * 
	 * @param value
	 */
	public void addElement(E value) {
		if (this.head == null) {
			this.head = new LinkedListNode(value, null);
		} else {
			LinkedListNode currentNode = this.head;
			while (currentNode.next != null) currentNode = currentNode.next;
			currentNode.next = new LinkedListNode(value, null);
		}
	}
	
	/**
	 * Removes the first instance of 'value' from the list.
	 * 
	 * @param n
	 * 
	 */
	public void removeElement(E value) {
		LinkedListNode currentNode = this.head;
		if (currentNode != null && currentNode.data == value) {
			this.head = currentNode.next;
		} else {
			while (currentNode.next != null && currentNode.next.data != value) {
				currentNode = currentNode.next;
			}
			if (currentNode.next != null && currentNode.next.data == value) {
				currentNode.next = currentNode.next.next;
			}
		}
	}
	
	/**
	 * Removes a specific node from the list.
	 * 
	 * @param n
	 */
	public void removeNode(LinkedListNode n) {
		LinkedListNode currentNode = this.head;
		if (currentNode != null && currentNode == n) {
			this.head = currentNode.next;
		} else {
			while (currentNode.next != null && currentNode.next != n) {
				currentNode = currentNode.next;
			}
			if (currentNode.next != null && currentNode.next == n) {
				currentNode.next = currentNode.next.next;
			}
		}
	}
	
	/**
	 * Print the list as a string.
	 */
	public String toString() {
		String result = "";
		if (this.head != null) {
			LinkedListNode currentNode = this.head;
			while (currentNode != null) {
				result += currentNode.data + "->";
				currentNode = currentNode.next;
			}
		}
		return result;
	}
}
