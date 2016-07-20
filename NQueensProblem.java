package com.pf4.assignment;

import java.io.*;

/**
 * This class is written to solve the N Queen problem, that is to put N number
 * of queens on a N X N squares board such that no queen can attack other queen
 * in horizontal, vertical or diagonal direction
 * 
 * @author pranav_Pandey
 *
 */
public class NQueensProblem {

	int ValidToPlace = 1;
	int NoOfSolutions = 0;

	/**
	 * This method puts the queen on the 2D array by finding the position of
	 * queen and returns 1 if valid position is found
	 * 
	 * @param row
	 *            - (int) stores the current row
	 * @param column
	 *            - (int) stores the current column
	 * @param position
	 *            - (int[]) stores the array for positions
	 * @return(int) - returns 1 if a valid position is found else returns 0
	 */
	int placeQueen(int row, int column, int position[]) {
		// check for invalid entries
		for (int i = 1; i < row; i++) {
			if ((position[i] == column || (Math.abs(row - i) == Math.abs(column
					- position[i])))) {
				return 0;
			}
		}
		return 1;
	}

	/**
	 * This method try to put queens on their respective place and checks if
	 * that place is valid or not and if not it backtracks to previous state and
	 * try another place to put the queen
	 * 
	 * @param presentRow
	 *            (int) denotes the current position in the row
	 * @param totalRow
	 *            (int) it is the total number of rows
	 * @param position
	 *            (int[]) denotes the array for positions
	 * @param result
	 *            (int[][][]) returns the 3-D array
	 * @return
	 */
	public int[][][] queen(int presentRow, int totalRow, int position[],
			int result[][][]) {

		// check possible places for queen at current row
		for (int i = 1; i <= totalRow; i++) {
			if (placeQueen(presentRow, i, position) == 1) {
				position[presentRow] = i;
				// Base condition and get result for each row
				if (presentRow == totalRow) {
					for (int j = 1; j <= totalRow; j++) {
						result[NoOfSolutions][j][position[j]] = 1;
					}
					NoOfSolutions++;
					return result;

				}
				// if more number of row present then check solution for them
				// also
				else {
					queen(presentRow + 1, totalRow, position, result);
				}
			}
		}
		return result;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This is a getter method to take the input and check if its valid or not
	 * 
	 * @return
	 */
	public int getInput() {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInput();
		}
		return inputNumber;
	}

	/**
	 * This is the main method which controls the flow of execution of the
	 * program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final int MAX_POSSIBLE_SOLUTION_STORE = 100000;
		NQueensProblem nQueen = new NQueensProblem();
		int boardSize;
		// get the size of board
		System.out.println("Enter the size of board");
		boardSize = nQueen.getInput();
		// define size of array according to board size
		int position[] = new int[boardSize + 1]; // store position of queen for
													// each row

		int result[][][] = new int[MAX_POSSIBLE_SOLUTION_STORE][boardSize + 1][boardSize + 1];

		// Call method to get all possible solution
		result = nQueen.queen(1, boardSize, position, result);

		/* show all the possible solutions */
		for (int k = 0; k < nQueen.NoOfSolutions; k++) {
			for (int i = 1; i <= boardSize; i++) {
				for (int j = 1; j <= boardSize; j++) {
					if (result[k][i][j] == 1) {
						System.out.print("Q" + "\t");
					} else {
						System.out.print("0" + "\t");
					}
				}
				System.out.println();
			}
			System.out.println("total result " + nQueen.NoOfSolutions
					+ " this solution " + (k + 1));
		}
	}

}