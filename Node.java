/**
 * Defining Class for Node.
 */
public class Node {
	private int info;
	private Node next;

	Node() {
		this.setInfo(0);
		this.setNext(null);
	}

	Node(int item) {
		this.setInfo(item);
		this.setNext(null);
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the info
	 */
	public int getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(int info) {
		this.info = info;
	}
}