import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is to create a concordance of characters occurring in a string
 * 
 * @author Pranav_Pandey
 *
 */
public class Concordance {

	/**
	 * SortedListMain method to control the flow of execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) { // Arguments are set from the run
												// configuration
												// "my name is pranav pandey" is the
												// argument passed here

		String inputString = "";

		/* To store the arguments passed in a single String */
		for (int i = 0; i < args.length; i++) {
			inputString = inputString + args[i];
		}

		int length = inputString.length(); // To store the length of the string

		Map<Character, List<Integer>> numChars = new HashMap<Character, List<Integer>>();

		for (int i = 0; i < length; ++i) {

			char character = inputString.charAt(i);
			List<Integer> indexList;
			/*
			 * If character is not present in the map as key then add the key in
			 * the map and store its index position in the list in the value
			 * place
			 */
			if (!numChars.containsKey(character)) {
				indexList = new ArrayList<Integer>();
				indexList.add(i);
				numChars.put(character, indexList);
				/*
				 * If key is already present the update the index list for that
				 * key by adding new position of the character
				 */
			} else if (numChars.containsKey(character)) {
				indexList = numChars.get(character);
				indexList.add(i);
				numChars.put(character, indexList);
			}
		}
		System.out.println(numChars);
	}
}
