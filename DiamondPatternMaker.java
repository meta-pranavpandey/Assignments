package com.pf2.assignment;

/**
 * This class makes a diamond shape numerical pattern on the screen of size as
 * instructed by the user
 */

public class DiamondPatternMaker {

	public static void main(String[] args) {

		DiamondPatternMaker dpm = new DiamondPatternMaker();
		dpm.printWholePyramid(Integer.parseInt(args[0]));
	}

	/**
	 * This method takes the current row number and total number of rows in the
	 * pattern and returns a string of spaces required on the specified row
	 * 
	 * @param int row - To store the current row number
	 * @param int n - To store the total number of rows
	 * @return String spaces - String of spaces to be printed
	 */

	public String space(int row, int n) {
		String spaces = "";

		/*
		 * This part checks if the current row number is below half of total
		 * number of rows and then add the number of spaces accordingly in the
		 * string
		 */
		if (row <= (n / 2)) {
			for (int i = 0; i < ((n / 2) - row); i++) {
				spaces = spaces.concat(" ");
			}
		} else {
			for (int j = 0; j < (row - (n / 2)); j++) {
				spaces = spaces.concat(" ");
			}

		}
		return spaces;
	}

	/**
	 * This method takes the current row number and total number of rows as
	 * input
	 * 
	 * @param row
	 *            - To store the row number
	 * @param n
	 *            - To store the total number of rows
	 * @return String number - String of number to be printed
	 */
	public String number(int row, int n) {

		String numbers = "";
		int counter = 0;
		int num = 1;
		for (int i = 1; i <= (2 * row - 1); i++) {
			if (counter < (i / 2)) {
				numbers = numbers + num;
				counter++;
				num++;
			}
			if (counter == (i / 2)) {
				numbers = numbers + num;
				counter++;
				num--;
			} else {
				numbers = numbers + num;
				num--;
			}

		}
		return numbers;

	}

	public void printWholePyramid(int n) {
		int row = 1;
		for (int k = 0; k < n; k++) {
			String line = space(row, n) + number(row, n);
			row++;
			System.out.println(line);
			line="";
		}
	}
}
