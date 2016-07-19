package com.pf3.assignment;

/**
 * This class is for searching an array by using linear searching algorithm
 * 
 * @author Pranav_Pandey
 *
 */

public class LinearSearcher {

	public static void main(String[] args) {

		LinearSearcher ls = new LinearSearcher();
		int[] arrayOne = { 2, 5, 8, 9, 10, 77, 55 };
		ls.searchLinear(arrayOne, 2);

	}

	int index = 0;

	/**
	 * This method linearly searches for a given element in the given array
	 * using recursion
	 * 
	 * @param inputArray
	 *            -
	 * @param elementSearched
	 * @return int - returns the index position of the element being searched
	 */
	public int searchLinear(int inputArray[], int elementSearched) {

		/*
		 * If the element being searched is at the given index, return the index
		 * position
		 */
		if (inputArray[index] == elementSearched) {
			System.out.println(index);
			return index;

		}
		/* If element is not found in the aray return -1 */
		else if (index >= inputArray.length - 1) {
			return -1;
		}
		/* Recursive call to search for the given element further */
		else {
			index++;
			return searchLinear(inputArray, elementSearched);
		}
	}
}
