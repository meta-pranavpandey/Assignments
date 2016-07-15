package com.pf2.assignment;

/**
 * This class makes a diamond shape numerical pattern on the screen of size as
 * instructed by the user
 */

/*
 * This part checks if the current row number is below half of total
 * number of rows and then add the number of spaces accordingly in the
 * string*/

import java.util.Scanner;

public class DiamondPatternMaker {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter the no of rows");
		n = sc.nextInt();
		DiamondPatternMaker obj = new DiamondPatternMaker();
		obj.patternArrangement(n);
		sc.close();
	}

	/**
	 * This method takes the current row number and total number of rows in the
	 * pattern and returns a string of spaces required on the specified row
	 * 
	 * @param int row - To store the current row number
	 * @param int n - To store the total number of rows
	 * @return String spaces - String of spaces to be printed
	 */

	public String spaceCount(int row, int n) {
		String spaces = "";
		for (int i = row; i < n; i++) // no of spaces= n-row
		{
			spaces += " ";
		}
		return spaces; // return string of spaces
	}

	/**
	 * This method takes the current row number and total number of rows in the
	 * pattern and returns a string of number required to be entered in the row
	 * 
	 * @param row
	 *            - To store current row number
	 * @param number
	 *            - To store total number of rows
	 * @return String numb - return string of numbers reuired the specified row
	 */
	public String numberSequence(int row, int n) {
		String numb = "";
		for (int i = 1; i <= row; i++) // number till row no in increasing order
		{
			numb = numb + i;
		}
		for (int j = row - 1; j >= 1; j--)// number from row-1 in descending
											// order till 1
		{
			numb = numb + j;
		}
		return numb;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public String[] patternArrangement(int n) {
		DiamondPatternMaker obj = new DiamondPatternMaker();
		String s1, s2;
		int count = 0; 							// keep record of index no of pattern string
		String s3[] = new String[2 * n - 1]; 	// length of string array 2n-1
		for (int row = 1; row <= n; row++) 		// pattern in increasing order
		{
			s1 = obj.spaceCount(row, n); 		// call method space count
			s2 = obj.numberSequence(row, n); 	// call method number sequence
			s3[count++] = s1 + s2; 				// concatenate the space and number sequence
		}
		for (int row = n - 1; row >= 1; row--)	 // pattern in increasing order
		{
			s1 = obj.spaceCount(row, n); 		// call method space count
			s2 = obj.numberSequence(row, n); 	// call method number sequence
			s3[count++] = s1 + s2;				 // concatenate the space and number sequence
		}
		return s3; 								// return string of array containing pattern
	}
}
