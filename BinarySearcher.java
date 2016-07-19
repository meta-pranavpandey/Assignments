package com.pf3.assignment;

/**
 * This class is defined for performing Binary search on a given array using
 * recursion
 * 
 * @author Pranav_Pandey
 *
 */
public class BinarySearcher {

	int elementPosition = 0; // Stores the position of the element that is being
								// searched for

	public static void main(String[] args) {

	}

	/**
	 * This method performs binary search on a given array using recursion and
	 * return the index postion of the element that is being searched in the
	 * array, it return -1 if the element is not found in the array
	 * 
	 * @param array
	 *            - Input array on which search is to be performed
	 * @param element
	 *            - Stores the element to be searched in the array
	 * @param start
	 *            - Stores starting index of the array
	 * @param end
	 *            - Stores end index of the array
	 * @return int - the index position of the of the element being searched in
	 *         the array
	 */
	public int searchBinary(int array[], int element, int start, int end) {

		if (elementPosition > end)
			return -1;
		/*
		 * If the element is present at the current index, the index value is
		 * returned
		 */
		if (array[elementPosition] == element)
			return elementPosition;
		/*
		 * If the searched element is less than the middle element
		 */
		else {

			if (element < array[(start + end) / 2]) {
				elementPosition++;
				return searchBinary(array, element, start, (start + end) / 2);
			}

			else // if (element > array[(start + end / 2)])
			{
				elementPosition++;
				return searchBinary(array, element, (start + end) / 2, end);

			}
		}
	}

}
