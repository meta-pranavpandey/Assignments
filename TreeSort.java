
/**
 * This class implements the Binary Search Tree concept to sort the the Rollno. of Students
 * @author Pranav_Pandey
 *
 */
public class TreeSort {

	Helper help = new Helper();
	private int numberOfElements;
	private int index;
	private int inputArray[];


	/**
	 * This function takes input from the user.
	 */
	public void getUserInput() {

		System.out.println("Enter the total number of Students");

		numberOfElements = help.getIntegerInput();

		Node root = null;

		inputArray = new int[numberOfElements];

		for (int index = 0; index < numberOfElements; index++) {

			System.out.println("Enter the Roll No. of  " + (index + 1) + " Student : ");

			inputArray[index] = help.getIntegerInput();

			root = binarySearchTree(root, inputArray[index]);
		}

		System.out.println("\n\nStudents in unordered format :");
		help.display(inputArray, numberOfElements);

		System.out.println("\n\nStudents in Inorder form : ");
		inOrder(root);
		help.display(inputArray, numberOfElements);

	}

	/**
	 * This function searches for the given item
	 * @param root denotes the root node of tree
	 * @param itemint denotes the item to search
	 * @return the root node.
	 */
	public Node binarySearchTree(Node root, int item) {

		if (root == null) {
			Node newNode = new Node(item);
			root = newNode;
			return root;
		} 
		
		else if (root.getElement() > item) {
			root.setLeft(binarySearchTree(root.getLeft(), item));
		} 
		
		else {
			root.setRight(binarySearchTree(root.getRight(), item));
		}
		
		return root;
	}

	/**
	 * This function stores the elements of binary search tree in inorder traversal
	 * @param root
	 */
	public void inOrder(Node root) {
	
		if (root == null)
			return;
		inOrder(root.getLeft());
		inputArray[index++] = root.getElement();
		inOrder(root.getRight());
	}

}