package assignment1;

import java.util.Scanner;

public class TreeTraversal {

    public static void main(String[] args) {
    	
    	TreeTraversal treeTraverse=new TreeTraversal();
    	Scanner sc=new Scanner(System.in);
    	int root;
    	System.out.println("Enter root node value");
    	root=sc.nextInt();
    	BinaryTree<Integer> bTree=new BinaryTree<Integer>(root);
    	treeTraverse.preOrder(bTree.getRoot());

    }

    /**
     * pre-order traversal for the binary tree
     * 
     * @param root
     */
    public void preOrder(BTNode<Integer> root) {
	if (root != null) {
	    System.out.println(root.getData());
	    preOrder(root.getLeft());
	    preOrder(root.getRight());
	}
    }

}
