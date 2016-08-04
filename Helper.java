package assignment1;

import java.util.Scanner;

/**
 * This is a helper class for creating the binary tree using other class and
 * printing the pre order and post order traversal data of the tree
 * 
 * @author Pranav_Pandey
 *
 */
public class Helper {
/**
 * Main method which controls the flow of execution of the program
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree<Integer> bt = new BinaryTree<Integer>();
		PreOrderTraversal<Integer> pre = new PreOrderTraversal<Integer>();
		PostOrderTraversal<Integer> post = new PostOrderTraversal<Integer>();
		int val;
		int nodeNum;
		int root;
		System.out.println("Enter total number of nodes to be entered");
		nodeNum = sc.nextInt();
		System.out.println("Enter root node value");
		root = sc.nextInt();
		bt.createBTree(root, bt.getRoot());
		for (int i = 0; i < nodeNum - 1; i++) {
			System.out.println("Enter the node value :");
			val = sc.nextInt();
			bt.createBTree(val, bt.getRoot());

		}
		System.out.print("Preorder of the inserted element of BT\n");
		pre.preOrder(bt.getRoot());
		System.out.print("\n Postorder of the inserted element of BT\n");
		post.postOrder(bt.getRoot());
		sc.close();
	}

}
