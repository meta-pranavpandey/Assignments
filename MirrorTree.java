package assignment1;

public class MirrorTree<E> {

	BTNode<E> rootMirror; // To store the root of the mirror tree

	/**
	 * Unparameterized constructor to set the value of rootMirror to null
	 */

	public MirrorTree() {
		rootMirror = null;
	}

	/**
	 * This method is for the creation of mirror Binary tree
	 * 
	 * @param data
	 *            : Value to be Inserted
	 * @param node
	 */
	public void buildMirrorTree(E data, BTNode<E> node) {

		if (rootMirror == null) {// For the First node
			rootMirror = new BTNode<E>();
			rootMirror.setData(data);
			rootMirror.setLeft(null);
			rootMirror.setRight(null);
		}

		else if (data.toString().compareTo(node.getData().toString()) >= 0
				&& node.getLeft() == null) // we convert both data
											// node into string
											// and we compare them
		{
			BTNode<E> newNode = new BTNode<E>();
			newNode.setData(data);
			newNode.setLeft(null);
			newNode.setRight(null);
			node.setLeft(newNode);
			return;
		}

		else if (data.toString().compareTo(node.getData().toString()) < 0
				&& node.getRight() == null) // we convert both data
											// node into string
											// and we compare them
		{
			BTNode<E> newNode = new BTNode<E>();
			newNode.setData(data);
			newNode.setLeft(null);
			newNode.setRight(null);
			node.setRight(newNode);
			return;
		}

		// This conditions executes when the both left and right is not Null
		else {
			if (data.toString().compareTo(node.getData().toString()) >= 0) {
				buildMirrorTree(data, node.getLeft());
			} else {
				buildMirrorTree(data, node.getRight());
			}
		}
	}

	/**
	 * This function check whether the created tree is reversed or not
	 * 
	 * @param left
	 *            - Left node of the Root Node
	 * 
	 * @param right
	 *            - Right node of the Root Node
	 * 
	 * @return TRUE if the Tree is Mirror
	 */
	boolean mirrorEquals(BTNode<E> left, BTNode<E> right) {

		/* When both the trees are empty */
		if (left == null || right == null)
			return (left == null && right == null);

		return left.getData().toString().compareTo(right.getData().toString()) == 0
				&& mirrorEquals(left.getLeft(), right.getRight())
				&& mirrorEquals(left.getRight(), right.getLeft());
	}
}
