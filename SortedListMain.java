import java.util.Scanner;

public class SortedListMain {

	/**
	 * Main class method to control the execution of SortedLinkedList class
	 * 
	 * @param args
	 *            [](String) Command Line Arguments.
	 */
	public static void main(String args[]) {
		SortedLinkedList obj = new SortedLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int elementNum = sc.nextInt();
		for (int i = 0; i < elementNum; i++) {
			System.out.println("Enter Element " + (i + 1) + " : ");
			obj.add(sc.nextInt());
		}
		System.out.println("Sorted List : ");
		obj.display();
		sc.close();
	}
}