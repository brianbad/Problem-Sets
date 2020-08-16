package problem_2_1;

import java.util.HashMap;

import problem_2_1.LinkedList.LinkedListNode;

public class Problem2_1 {

	/**
	 * Write code to remove duplicates from an unsorted Linked List.
	 * 
	 * IDEA:
	 * - Use a HashMap to keep track of values that we've already seen.
	 * - For each node in the list, compare its value with the HashMap.
	 * - If that value already exists, remove the node.
	 * - If not, add its value to the HashMap.
	 * 
	 * - This takes O(n) time and O(n) space.
	 * 
	 * @param list
	 */
	public static void removeDuplicates(LinkedList<Integer> list) {
		LinkedListNode currentNode = list.getHead();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		while (currentNode != null) {
			if (map.containsKey(currentNode.data)) {
				list.removeElement((Integer) currentNode.data);
			} else {
				map.put((Integer) currentNode.data, true);
			}
			currentNode = currentNode.next;
		}
		
	}
	
	/**
	 * What if you could not use an additional buffer?
	 * 
	 * IDEA:
	 * - Using two "pointers" to basically check each node individually, while
	 *   removing the duplicates that exist deeper in the list.
	 * - Use the reference to a "previous" value, that way we still have access
	 *   to all necessary pointers in order to hook everything up.
	 * - Worst case scenario is O(n^2), though we only use O(1) space.
	 * 
	 * @param list
	 */
	public static void removeDuplicatesNoBuffer(LinkedList<Integer> list) {
		// References to the current and runner nodes
		LinkedListNode currentNode = list.getHead();
		LinkedListNode runnerNode = list.getHead();
		
		// Current node iterating through list
		while (currentNode !=  null) {
			
			// Runner node that iterates the remainder of the list for each "current" node
			while (runnerNode.next != null) {
				// If the next node matches the value of current, we remove that node
				if (currentNode.data.equals(runnerNode.next.data)) {
					runnerNode.setNext(runnerNode.next.next);
				} else {
					// If it doesn't match, iterate the runner node
					runnerNode = runnerNode.next;
				}
			}
			
			// When the runner node iteration finishes, increment the current node, and
			// restart the runner node at that same position.
			currentNode = currentNode.next;
			runnerNode = currentNode;
		}
	}
}
