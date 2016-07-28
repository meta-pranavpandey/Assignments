package oops4.assignment;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class displays the menu to the user and asks the user for a selection
 * and then performs the operations accordingly
 * 
 * @author Pranav_Pandey
 *
 */
public class DisplayMenu {

	private static int menuCount; // To store the slection number of main menu
									// heads

	private static Scanner sc = new Scanner(System.in);

	/**
	 * This is the main function to control the flow of execution of the program
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Helper displayMenu = new Helper();
		System.out.println("Select option");
		/*
		 * Here we are getting the MENU type list and then getting the menu head
		 * of the menu and printing all the menu heads using an iterator
		 */

		while (displayMenu.getMenuList().listIterator().next().getMenuName() != null) {
			menuCount = sc.nextInt();
			System.out.println(displayMenu.getMenuList().get(menuCount)
					.getMenuName());
		}
		menuCount = sc.nextInt();
		System.out.println("Select option");
		/*
		 * Here we are getting the MENU type list and then the item present at
		 * the asked position given by the user and then accessing the menu
		 * items present in the list and printing it one by one using an
		 * iterator
		 */

		System.out.println(displayMenu.getMenuList().get(menuCount)
				.getMenuItems().listIterator().next());

	}

}
