package com.pf2.assignment;

public class InvertedPatternMaker {

	public static void main(String[] args) {

		InvertedPatternMaker ipm = new InvertedPatternMaker();
		ipm.printWholePyramid(5);
	}

	/**
	 * This method takes the current row number and total number of rows in the
	 * pattern and returns a string of spaces required on the specified row
	 * 
	 * @param int row - To store the row number
	 * @param int number - To store the number till which pattern is required
	 * @return String spaces - String of spaces to be printed
	 */
	public String space(int row, int number) {
		String spaces = ""; // To store the the spaces

		for (int i = 1; i < row; i++) {
			spaces = spaces + " ";
		}

		return spaces;
	}

	/**
	 * 
	 * @param row
	 * @param number
	 * @return String numb
	 */
	public String number(int row, int number) {
		String numb = "";
		for (int i = 1; i <= number - (row - 1); i++) {

			numb = numb + i;

		}
		return numb;
	}

	/**
	 * This function takes the number till which pattern is required as input
	 * and then print the whole pyramid pattern as required
	 * 
	 * @param int n - takes number of rows(highest number required)
	 * @param String
	 *            s1 - To store the spaces returned from the space function
	 * @String String s2 - To store the numbers returned from the number
	 *         function
	 * @return String[] s3 - Returns the
	 */
	public String[] printWholePyramid(int n)

	{
		InvertedPatternMaker obj = new InvertedPatternMaker();
		String s1, s2;
		int count = 0; // keep record of index no of pattern string
		String s3[] = new String[n]; // length of string array 2n-1
		for (int row = 1; row <= n; row++) // loop to increase the row number
		{
			s1 = obj.space(row, n); // call method space count
			s2 = obj.number(row, n); // call method number sequence
			s3[count++] = s1 + s2; // concatenate the space and number sequence
		}
		return s3; // return string of array containing pattern
	}
}
