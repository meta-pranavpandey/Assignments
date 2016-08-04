package assignment1;

/**
 * This class is for the creation of binary tree in which the values are entered
 * by the user
 *
 * @author Pranav_Pandey
 * @param <E>
 *            -Object Type
 */

public class BinaryTree<E> extends BTNode<E> {

	private BTNode<E> root; // To store root of the Binary tree

	/**
	 * Non-parameterized constructor to set the value of root to null
	 */

	public BinaryTree() {
		root = null;
	}

	public BTNode<E> getRoot() {
		return root;
	}

	/**
	 * create a Binary Tree Dynamically by taking each node as input by the User
	 * 
	 * @param data
	 *            : Value to be Inserted
	 * @param node
	 */
	public void createBTree(E data, BTNode<E> node) {
		/*
		 * If the tree is an empty tree, create a root and set its value with
		 * the given data
		 */
		if (root == null) {
			root = new BTNode<E>();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
		}
		/*
		 * If the left child of the node is empty then create a new node and set
		 * it as left child of the previous node
		 */
		else if (data.toString().compareTo(node.getData().toString()) < 0
				&& node.getLeft() == null) {
			BTNode<E> newnode = new BTNode<E>();
			newnode.setData(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			node.setLeft(newnode);
			return;
		}
		/*
		 * If the right child of the node is empty then create a new node and
		 * set it as right child of the previous node
		 */
		else if (data.toString().compareTo(node.getData().toString()) >= 0
				&& node.getRight() == null) {
			BTNode<E> newnode = new BTNode<E>();
			newnode.setData(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			node.setRight(newnode);
			return;
		} 
		/*Otherwise recursively go to the lower level and recursively check the same conditions again*/
		else {
			if (data.toString().compareTo(node.getData().toString()) < 0) {
				createBTree(data, node.getLeft());
			} else {
				createBTree(data, node.getRight());
			}
		}
	}

}
