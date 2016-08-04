package assignment1;

public class PreOrderTraversal<E> {

	/**
	 * This method is for traversing the Binary tree in pre order and print the
	 * node values
	 * 
	 * @author Pranav_Pandey
	 * @param <E>
	 *            To define the data type at the time of execution
	 */
	public void preOrder(BTNode<E> pNode) {
		if (pNode == null)
			return;
		System.out.print(pNode.getData()+" ");
		preOrder(pNode.getLeft());
		preOrder(pNode.getRight());
	}

}