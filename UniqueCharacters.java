package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is to find all the unique characters in a given string and if the
 * same string is given again then it can be retrieved from previously entered
 * string and number of unique characters can be told without and calculations
 * 
 * @author Pranav_Pandey
 *
 */
public class UniqueCharacters {

	private static Map<String, Integer> dataStorage = new HashMap<String, Integer>();
	private int uniqueCount;
	private char character;

	/**
	 * THis function takes the input string and calculates the number of unique
	 * characters in the string
	 * 
	 * @param inputString
	 * @return int number of unique characters in the string
	 */
	public int checkUnique(String inputString) {

		if (dataStorage.containsKey(inputString)) {
			return dataStorage.get(inputString);
		}

		else {
			List<Character> charList = new ArrayList<Character>();

			int length = inputString.length();

			for (int i = 0; i < length; i++) {
				character = inputString.charAt(i);

				if (charList.contains(character)) {
					continue;
				} else {
					uniqueCount++;
					charList.add(character);
				}
			}

			dataStorage.put(inputString, uniqueCount);

			return uniqueCount;
		}
	}

	/**
	 * @return the uniqueCount
	 */
	public int getUniqueCount() {
		return uniqueCount;
	}

	/**
	 * @param uniqueCount
	 *            the uniqueCount to set
	 */
	public void setUniqueCount(int uniqueCount) {
		this.uniqueCount = uniqueCount;
	}

	/**
	 * Main function to control the flow of execution
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		UniqueCharacters uc = new UniqueCharacters();
		String input = "Test Case for the program";
		uc.checkUnique(input);
		System.out
				.println("Number of unique characters in the given test case\n"
						+ input + "\n" + uc.getUniqueCount());
	}
}
