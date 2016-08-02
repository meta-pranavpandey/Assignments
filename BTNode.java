package assignment1;

/**
 * BTNode is a class for defining data type for tree data structure
 * 
 * @author Pranav_Pandey
 *
 * @param <E>
 *            - For setting the element type for the class
 */
public class BTNode<E> {

    private E data; // To store the data
    private BTNode<E> left; // To store the reference to the left node
    private BTNode<E> right; // To store the reference to the right node

    /**
     * parameterized constructor for initializing the values of the class
     * variables
     * 
     * @param data
     */
    public BTNode(E data) {
	this.data = data;
	setLeft(null);
	setRight(null);
    }

    /**
     * 
     * @param data
     *            The data to set
     */
    public void setData(E data) {
	this.data = data;
    }

    /**
     * 
     * @return the data of the node
     */
    public Object getData() {
	return data;
    }

    /**
     * @return the left node
     */
    public BTNode<E> getLeft() {
	return left;
    }

    /**
     * 
     * @param left
     *            - the left node to set
     */
    public void setLeft(BTNode<E> left) {
	this.left = left;
    }

    /**
     * @return the right node
     */
    public BTNode<E> getRight() {
	return right;
    }

    /**
     * @param right
     *            - the right node to set
     */
    public void setRight(BTNode<E> right) {
	this.right = right;
    }

}
