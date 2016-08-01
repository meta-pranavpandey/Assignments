package ds1.assignment;

public class NodeTwo<E> {
	private E data; // To store the data
	private NodeTwo<E> next; // To store the address for the next node in the
								// linked list
	private NodeTwo<E> previous; // To store the address for the previous node
									// in the linked list

	/**
	 * Sets value for data with the given parameter
	 * 
	 * @param data
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**
	 * 
	 * @return the value of data
	 */
	public E getData() {
		return data;
	}

	/**
	 * sets the value of next node with the given parameter
	 * 
	 * @param next
	 */
	public void setNext(NodeTwo<E> next) {
		this.next = next;
	}

	/**
	 * 
	 * @return the value of the next node
	 */
	public NodeTwo<E> getNext() {
		return next;
	}

	/**
	 * sets the value of previous node with the given parameter
	 * 
	 * @param next
	 */
	public void setPrevious(NodeTwo<E> previous) {
		this.previous = previous;
	}

	/**
	 * 
	 * @return the value of the previous node
	 */
	public NodeTwo<E> getPrevious() {
		return previous;
	}

}
