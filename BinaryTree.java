package assignment1;
/**
 * This class is for the creation of binary tree in which the values are entered by the user
 * @author Pranav_Pandey
 *
 * @param <E>
 */
public class BinaryTree<E> {

    private BTNode<E> root;
    

    public BinaryTree(E data) {
    	BTNode<E> root=new BTNode(data);
    	root.setLeft(null);
    	root.setRight(null);
    }
    
    
    public void createBTree(BTNode root, E data)
    {
    	if(root.getLeft()==null)
    	{
    		
    	}
    	else if(root.getRight()==null)
    	{
    		
    	}
    
    }
}
