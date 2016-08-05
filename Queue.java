import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of queue using arrayList from the collections framework in
 * java
 * 
 * @author Pranav_Pandey
 *
 */
public class Queue<E> {
	private List<Object> data;
	private int front;

	public Queue() {
		front = 0;
		data = new ArrayList<Object>();
	}

	/**
	 * To add element in the queue i.e enqueue
	 */
	public void enQueue(E item) {
		data.add(item);
	}

	/**
	 * This method removes the element from the front of the queue i.e dequeue
	 * 
	 * @return
	 */
	public Object deQueue() {

		return data.get(front++);

	}

	/**
	 * Make the Queue empty
	 */
	public void makeEmpty() {
		data = null;
	}

	/**
	 * Return the least recently used element from the queue
	 * 
	 * @return
	 */
	public Object getFront() {
		return data.get(front);
	}

	/**
	 * 
	 * @return the number of elements in the queue
	 */
	public int getSize() {
		return data.size();
	}

	public boolean isEmpty() {
		return (data.size() == 0);
	}
}
