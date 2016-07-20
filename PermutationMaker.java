package com.pf4.assignment;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is written to find out all the permutations of a given string
 * 
 * @author Pranav_Pandey
 *
 */

public class PermutationMaker {

	/**
	 * This method generates permutation of a given string and stores the
	 * permutations in a HashSet ignoring all the duplicates
	 * 
	 * @param inputString
	 *            - (String) is a string which is to be permuted
	 * @return result (Set<String>) - returns the set of permutations of string
	 */

	public Set<String> generatePermutations(String inputString) {
		Set<String> resultSet = new HashSet<String>();

		if (inputString.length() == 0) { // To check for empty String
			resultSet.add("");
			return resultSet;
		}

		char firstChar = inputString.charAt(0);
		String remainingString = inputString.substring(1);
		Set<String> combinations = generatePermutations(remainingString);
		/* Loop to pass different strings one by one to find their permutations */
		for (String newString : combinations) {
			for (int i = 0; i <= newString.length(); i++) {
				resultSet.add(charAdd(newString, firstChar, i));
			}
		}
		return resultSet;
	}

	/**
	 * This method takes a new string and make different sets of the string by
	 * changing the position of the characters
	 * 
	 * @param newString
	 *            - Input string
	 * @param character
	 *            - The character to interchange
	 * @param index
	 *            - position at which change is to be done
	 * @return
	 */
	public static String charAdd(String newString, char character, int index) {
		String first = newString.substring(0, index);
		String last = newString.substring(index);
		/* returns the new string after changing the positions of the characters */
		return first + character + last;
	}

	/**
	 * This is the main method, used to control the execution of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "ABCD";
		PermutationMaker pm=new PermutationMaker();


		System.out.println("\nPermutations of String " + s + " : \n"
				+ pm.generatePermutations(s));
	}

}
