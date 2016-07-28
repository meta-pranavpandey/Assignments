package oops4.assignment;

import java.util.*;
/**
 * This class is used for creating menu data type
 * @author Pranav_Pandey
 *
 */
public class Menu {
	
	private String menuName;
	
	private List<String> menuItems=new ArrayList<String>();
	/**
	 * Parameterized constructor to set the value of the class level variables menu name and menu items list
	 * @param menuName
	 * @param itemsList
	 */
	public Menu(String menuName, List<String> itemsList)
	{
		this.menuName=menuName;
		this.menuItems.addAll(itemsList);
	}
	/**
	 * 
	 * @return the menu name(menu head)
	 */
	public String getMenuName()
	{
		return menuName;
	}
	
	public List<String> getMenuItems()
	{
		return menuItems;
	}
	
	}
