package assignment1;

public class PostOrderTraversal<E> {
	
	/**
	 * This method is for traversing the Binary tree in post order and print the
	 * node values
	 * 
	 * @author Pranav_Pandey
	 * @param <E> To define the data type at the time of execution
	 */
	public void postOrder(BTNode<E> pNode) {
		if (pNode == null)
			return;
		postOrder(pNode.getLeft());
		postOrder(pNode.getRight());
		System.out.print(pNode.getData()+" ");
	}

}
