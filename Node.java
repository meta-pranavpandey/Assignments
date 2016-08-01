package ds1.assignment;

/**
 * Node data type for use in singly linked list creation and operation
 * 
 * @author Pranav_Pandey
 * @param <E> : object type
 */
public class Node<E> {
	
	public E data;
	Node<E> next;
	
	/**
	 * Unparameterized constructor for value initialization
	 */
	public Node() {
	
		data=null;
		next=null;
	}
	
	/**
	 * parameterized constructor
	 * @param dataValue :  input node value 
	 */
	public Node(E dataValue){
		
		data=dataValue;
		next=null;
	}
	
}
