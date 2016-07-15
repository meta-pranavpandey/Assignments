package com.pf2.assignment;

public class InvertedPatternMaker {

	public static void main(String[] args) {
		
		InvertedPatternMaker ipm=new InvertedPatternMaker();
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

	/**This function takes the number till which pattern is required as input 
	 * and then print the whole pyramid pattern as required
	 * 
	 * @param n - stores number of rows(highest number needed)
	 */
	public void printWholePyramid(int n)

	{
		int row = 1;			//To store the current row number being processed
		for (int j = 0; j <= n; j++) {
			String line = space(row, n) + number(row, n);		//To join the spaces and numbers and form the required pattern
			System.out.println(line);
			row++;
		}
	}
}
