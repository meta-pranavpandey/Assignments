package assignment1;
 
import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;
 
/**
 * Class Heap to implement Binary  heap
 * @author Pranav_Pandey
 *
 */
class BinaryHeap    
{
    /*The number of child's each node can have*/
    private static final int childNum = 2;
    private int heapSize;
    private int[] heap;
 
    /**
     * Parameterized constructor to set the size of the heap and initialize other values   
     * @param capacity
     */
    
    public BinaryHeap(int capacity)
    {
        heapSize = 0;
        heap = new int[capacity + 1];
        Arrays.fill(heap, -1);
    }
 
    /**
     * This function returns true if the heap is empty
     * @return
     */
    public boolean isEmpty( )
    {
        return (heapSize == 0);
    }
 
    /**
     * 
     * @return True if the Heap is full
     */
    public boolean isFull( )
    {
        return (heapSize == heap.length);
    }
 
   /**
    * This function makes the heap empty by removing all the elements
    */
    public void makeEmpty( )
    {
        heapSize = 0;
    }
 
    /** Function to  get index parent of i **/
    private int parent(int i) 
    {
        return (i - 1)/childNum;
    }
 
    /** Function to get index of k the child of i **/
    private int kthChild(int i, int k) 
    {
        return childNum * i + k;
    }
 
   /**
    * 
    * @param x
    */
    public void insert(int x)
    {
        if (isFull( ) )
            throw new NoSuchElementException("Overflow Exception");
        /** Percolate up **/
        heap[heapSize++] = x;
        heapifyUp(heapSize - 1);
    }
 
    /** Function to find least element **/
    public int findMin( )
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");           
        return heap[0];
    }
 
    /** Function to delete min element **/
    public int deleteMin()
    {
        int keyItem = heap[0];
        delete(0);
        return keyItem;
    }
 
    /** Function to delete element at an index **/
    public int delete(int ind)
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        int keyItem = heap[ind];
        heap[ind] = heap[heapSize - 1];
        heapSize--;
        heapifyDown(ind);        
        return keyItem;
    }
 
    /** Function heapifyUp  **/
    private void heapifyUp(int childInd)
    {
        int tmp = heap[childInd];    
        while (childInd > 0 && tmp < heap[parent(childInd)])
        {
            heap[childInd] = heap[ parent(childInd) ];
            childInd = parent(childInd);
        }                   
        heap[childInd] = tmp;
    }
 
    /** Function heapifyDown **/
    private void heapifyDown(int ind)
    {
        int child;
        int tmp = heap[ ind ];
        while (kthChild(ind, 1) < heapSize)
        {
            child = minChild(ind);
            if (heap[child] < tmp)
                heap[ind] = heap[child];
            else
                break;
            ind = child;
        }
        heap[ind] = tmp;
    }