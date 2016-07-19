package com.pf3.assignment;

import java.util.Scanner;

/**
 * This class sorts a given array using quick sort technique
 * 
 * @author Pranav_Pandey
 *
 */
public class QuickSorter {

	public static void main(String[] args) {

		QuickSorter qSort = new QuickSorter();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length=");
		int arrLength = sc.nextInt();
		int[] array = new int[arrLength];

		System.out.println("Enter array elements=");
		for (int rowNo = 0; rowNo < arrLength; rowNo++) {
			array[rowNo] = sc.nextInt();
		}
		array = qSort.getSortedArray(array, 0, arrLength - 1);

		System.out.println("Sorted array: ");
		for (int row = 0; row < arrLength; row++) {
			System.out.print(array[row] + " ");
		}
		sc.close();
	}

	/**
	 * This method implements quick sort algorithm and sorts the given array
	 * using recursive method
	 * 
	 * @param inputArray
	 *            - Stores the integer array to be sorted
	 * @param start
	 *            - It stores first position of array
	 * @param last
	 *            - It stores last position of array
	 * @return int[] - It returns integer sorted array
	 */
	public int[] getSortedArray(int inputArray[], int start, int last) {
		if (start > last) {
			return inputArray;
		}
		int pivot = partition(inputArray, start, last); // Partition method is
														// called to find the
														// pivot index
		getSortedArray(inputArray, start, pivot - 1); // Quick sort the first
														// part of the array
		getSortedArray(inputArray, pivot + 1, last); // Quick sort the second
														// part of the array
		return inputArray;
	}

	/**
	 * This method divides the array into two parts for further processing in
	 * quick sorting the array
	 * 
	 * @param arr
	 *            - Stores an array of integers
	 * @param start
	 *            - It stores the first position of array
	 * @param last
	 *            - It stores the last position of array
	 * @return int - It returns the index of the pivot element
	 */
	public int partition(int arr[], int start, int last) {

		int initialPivotIndex = arr[last];
		int finalPivotIndex = start - 1;
		int temporary; // To store the value of some element temporarily

		/*
		 * It checks one by one all the elements if it is smaller or greater
		 * than pivot element and then shifts the elements to left if smaller
		 * and to right if greater to the pivot element
		 */
		for (int checkIndex = start; checkIndex <= last; checkIndex++) {
			if (arr[checkIndex] < initialPivotIndex) {
				finalPivotIndex++;
				temporary = arr[finalPivotIndex];
				arr[finalPivotIndex] = arr[checkIndex];
				arr[checkIndex] = temporary;
			}
		}
		/*
		 * This part shifts the pivot element to the correct position where all
		 * elements smaller than pivot are to the left and all the greater ones
		 * are to the right
		 */
		temporary = arr[finalPivotIndex + 1];
		arr[finalPivotIndex + 1] = arr[last];
		arr[last] = temporary;
		return (finalPivotIndex + 1);
	}
}