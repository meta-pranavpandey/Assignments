package assignment1;

import java.util.Scanner;
/**
 * This class is to control the whole process to be done 
 * @author Pranav_Pandey
 *
 */
public class Helper {
	/**
	 * Main method to control the flow of execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Priority Queue Test\n");
		Heap<String> heap = new Heap<String>();
		Helper scheduling = new Helper();

		// Insert data in heap
		while (true) {
			int userChoice = 0;
			heap.insert(new HeapNode<String>(scheduling
					.getIntfromUser("Priority"), scheduling
					.getStringfromUser("Name")));
			System.out.println("\nPress 1 for continue, 2 for exit");
			while (true) {
				userChoice = scheduling.getIntfromUser("Choice ");
				if (userChoice == 1 || userChoice == 2) {
					break;
				} else {
					System.out.println("try again, Enter 1 or 2");
				}
			}
			if (userChoice == 2) {
				break;
			}
		}
		scan.close();

		// Show all data according to priority
		while (heap.getSize() != 0) {
			System.out.println(heap.extractMax());
		}

	}

	/**
	 * Method to read string data from standard input
	 * 
	 * @param Name
	 *            of variable to print
	 * @return String value input by user
	 */
	public String getStringfromUser(String Name) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String string = "";
		while (true) {
			try {
				System.out.println("Enter " + Name);
				string = s.next();
				if (string.length() > 0) {
					break;
				} else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}

		}
		return string;
	}

	/**
	 * Method to read integer data from standard input
	 * 
	 * @param Name
	 *            of variable to print
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.println("Enter " + Name);
				number = s.nextInt();
				if (number > 0) {
					break;
				} else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}
}
