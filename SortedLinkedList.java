/**
 * This is the SortedLinkedList class for creating a linked list which is
 * sorting on being entered with a new item in the list and reamin sorted
 * 
 * @author Pranav_Pandey
 *
 */
public class SortedLinkedList {

	private Node head;
	private int sizeOfLinkedList;

	/**
	 * Non-parameterized Constructor
	 */
	SortedLinkedList() {

		sizeOfLinkedList = 0;
	}

	/**
	 * Following function is a recursive merge sort function.
	 * 
	 * @param head
	 *            (Node) denotes the head node of linked list.
	 * @return returns(Node) head node of linked list.
	 */
	public Node merge_sort(Node head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		Node middle = getMiddle(head); // get the middle of the list
		Node sHalf = middle.getNext();
		middle.setNext(null); // split the list into two halfs

		return merge(merge_sort(head), merge_sort(sHalf)); // recurse on that
	}

	/**
	 * This function merges the 2 parts of sorted linked lists.
	 * 
	 * @param a
	 *            (Node) denotes head node for first part.
	 * @param b
	 *            (Node) denotes head node for second part.
	 * @return returns(Node) the head node of merged sorted linked lists.
	 */
	public Node merge(Node a, Node b) {
		Node tempHead, current;
		tempHead = new Node();
		current = tempHead;
		while (a != null && b != null) {
			if (a.getInfo() <= b.getInfo()) {
				current.setNext(a);
				a = a.getNext();
			} else {
				current.setNext(b);
				b = b.getNext();
			}
			current = current.getNext();
		}
		current.setNext((a == null) ? b : a);
		return tempHead.getNext();
	}

	/**
	 * Following function finds the middle element for separating linked lists
	 * in 2 parts.
	 * 
	 * @param head
	 *            (Node) denotes the head node of Linked Lists
	 * @return slow(Node) denotes the middle node of linked lists.
	 */
	public Node getMiddle(Node head) {
		if (head == null) {
			return head;
		}
		Node slow, fast;
		slow = fast = head;
		while (fast.getNext() != null && fast.getNext().getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	/**
	 * Following function adds element in the Linked Lists.
	 * 
	 * @param item
	 *            (int) denotes the element to be added in the linked lists.
	 * @return true/false depending on whether item added or not.
	 */
	public boolean add(int item) {
		if (head == null) {
			Node newNode = new Node(item);
			head = newNode;
			newNode.setNext(null);
			sizeOfLinkedList++;
			return true;
		}
		Node temp = head;
		Node newNode = new Node(item);
		newNode.setNext(null);
		while (temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(newNode);
		sizeOfLinkedList++;
		head = merge_sort(head);
		return true;
	}

	/**
	 * This function function diplays the Sorted Linked lists.
	 */
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print("\t" + temp.getInfo());
			temp = temp.getNext();
		}
	}
}