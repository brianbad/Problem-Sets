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
}
