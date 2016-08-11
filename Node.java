/**
 * Node abstract data type for the tree
 * 
 * @author Pranav_Pandey
 */
class Node {
	private int element;
	private Node left;
	private Node right;

	/**
	 * parameterized constructor for initializing the node
	 * 
	 * @param theElement
	 */
	public Node(int theElement) {
		this(theElement, null, null);
	}

	/**
	 * parameterized constructor for initializing the node
	 * 
	 * @param theElement
	 */
	public Node(int theElement, Node lLink, Node rLink) {
		setElement(theElement);
		this.setLeft(lLink);
		this.setRight(rLink);
	}

	/**
	 * @return the element
	 */
	public int getElement() {
		return element;
	}

	/**
	 * @param element
	 *            the element to set
	 */
	public void setElement(int element) {
		this.element = element;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}
}