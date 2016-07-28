package oops4.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * This is a helper class used for accessing and storing the items that we get
 * from the source file in a manner so that they can be used further as required
 * 
 * @author Pranav_Pandey
 *
 */
public class Helper {
	private String item;
	public static int menuLevel = 1;
	String menuHead = "";
	private List<String> itemsList = new ArrayList<String>();
	private List<Menu> menuList = new ArrayList<Menu>();

	public Helper() throws IOException {

		@SuppressWarnings("resource")
		BufferedReader readerBuff = new BufferedReader(
				new FileReader(
						"C:\\Users\\Admin\\workspace\\oops4\\src\\oops4\\assignment\\input.txt"));
		while (readerBuff.readLine() != null) {
			item = readerBuff.readLine();
			if (item.charAt(menuLevel) == '.') {
				while (item.charAt(menuLevel) == '.')
					// To identify if a line is menu type or sub menu type
					itemsList.add(item);
			} else if (item.charAt(menuLevel) == ' ') {
				menuHead = "item";
			}
			menuList.add(new Menu(menuHead, itemsList));
		}
		menuLevel = menuLevel + 2;

	}

	/**
	 * returns the menu items list
	 * 
	 * @throws IOException
	 */

	public List<Menu> getMenuList() {
		return menuList;
	}
}
