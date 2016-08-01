package ds1.assignment;

/**
 * Doubly Linked list implementation using only arrays in java
 * 
 * @author Pranav_Pandey
 * @param <E>
 *            the type of elements held in this collection
 */
public class DoublyLinkedList<E> {

	public NodeTwo<E> start;
	public NodeTwo<E> end;

	// public Node current;

	public DoublyLinkedList() {
		start = null;
		end = null;
	}

	public void addAtFront(E item) {

		NodeTwo<E> temp = new NodeTwo<E>();
		temp.setData(item);
		temp.setNext(null);
		temp.setPrevious(null);
		start = temp;
		end = temp;
	}

	/**
	 * Add the item at the given position in the linked list
	 * 
	 * @param loc
	 * @param item
	 */
	public void addItemAtPosition(int loc, E item) {

		NodeTwo<E> current = start;
		NodeTwo<E> temp = new NodeTwo<E>();
		temp.setData(item);
		for (int i = 1; i < loc - 1; i++) {
			if (current.getNext() == null) {
				System.out.println("less elements in List");
			}
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.getNext().setPrevious(temp);
		temp.setPrevious(current);
		current.setNext(temp);

	}

	/**
	 * Remove the element from the given linked list
	 * 
	 * @param ItemValue
	 */
	public void removeByValue(E ItemValue) {
		NodeTwo<E> previous = start;
		NodeTwo<E> current = previous.getNext();
		while (current.getNext() != null) {
			if (current.getData() == ItemValue) {
				previous.setNext(current.getNext());
				current.getNext().setPrevious(current.getPrevious());
				return;
			} else {
				previous = previous.getNext();
				current = current.getNext();
			}
		}
		System.out.println("item not found in the list");
	}

	/**
	 * Remove the element from the linked list from the given index
	 * 
	 * @param index
	 */
	public void removeByIndex(int index) {
		NodeTwo<E> current = start;
		for (int i = 1; i < index - 1; i++) {
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		current.getNext().setPrevious(current);
	}

	/**
	 * prints the value at the given position in the linked list
	 * 
	 * @param index
	 */
	public void getValue(int index) {
		NodeTwo<E> current = start;
		for (int i = 1; i < index - 1; i++) {
			current = current.getNext();
		}
		System.out.println(current.getData());

	}

	/**
	 * Add the element in the linked list
	 * 
	 * @param item
	 */
	public void add(E item) {
		NodeTwo<E> current = start;
		NodeTwo<E> temporary = new NodeTwo<E>();
		temporary.setData(item);
		while (current.getNext() != null) {
			current = current.getNext();
		}
		temporary.setPrevious(null);
		temporary.setNext(null);
		current.setNext(temporary);
		end = temporary;
	}

	/**
	 * Display the linked list
	 */
	public void display() {
		NodeTwo<E> current = start;

		while (current.getNext() != null) {

			System.out.println(current.getData() + "<->");
			current = current.getNext();
		}
		System.out.println(current.getData());
	}

	/**
	 * Reverse the order of elements in the linked list
	 */
	public void reverseList() {
		NodeTwo<E> current = end;
		System.out.println(current.getData());
		while (current.getPrevious() != null) {
			current = current.getPrevious();
			System.out.println(current.getData());
			// current=current.prev;
		}

	}

}