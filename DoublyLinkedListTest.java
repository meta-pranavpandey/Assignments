package ds1.assignment;
 
/**
 * This class is to test the doubly link list created 
 * @author Pranav_Pandey
 *
 */
public class DoublyLinkedListTest {
/**
 * Control the flow of execution of the program
 * @param args
 */
	public static void main(String args[]) {
		DoublyLinkedList<String> linkedList = new DoublyLinkedList<String>();
		linkedList.addAtFront("start");
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		linkedList.display();
		System.out.println();
		linkedList.addItemAtPosition(3, "Pranav");
		linkedList.display();
		System.out.println();
		linkedList.removeByIndex(4);

		linkedList.display();
		System.out.println();
		linkedList.removeByValue("a");
		linkedList.display();
		System.out.println();
		linkedList.reverseList();

	}
}