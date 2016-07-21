package com.oops.assignment1;

import java.util.Scanner;

/**
 * This class is written to perform multiple operations on a matrixOne as asked
 * by the user
 *
 * @author Pranav_Pandey
 */
public class MatrixOperator {

	private static int[][] matrixOne;
	private static int[][] matrixTwo;

	private static int rowNum1; // To store number of rows in the first matrix
	private static int columnNum1; // To store the number of columns in first
									// matrix
	// matrixOne
	private static int rowNum2; // To store number of rows in the second matrix
	private static int columnNum2; // To store number of rows in the second
									// matrix
	private static int[][] transposeResult;
	private static int[][] multiplicationResult;
	private static int operationNumber;
	private static int matrixCount = 1; // To store number of matrix that has
										// been entered by the user
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MatrixOperator matrixObject = new MatrixOperator();
		matrixObject.setInput(matrixOne);
		do {
			System.out.println("What operation do you  want to perform?");
			System.out
					.println("Press 1 to DISPLAY the matrix \n Press 2 to TRANSPOSE the matrixOne \n "
							+ "Press 3 to MULTIPLY two matrices \n Press 4 to EXIT");
			operationNumber = sc.nextInt();
			switch (operationNumber) {

			case (1):
				matrixObject.show(matrixOne, rowNum1, columnNum1);
				break;
			case (2):
				matrixObject.show(matrixOne, rowNum1, columnNum1);
				matrixObject.transposeMatrix(matrixOne, rowNum1, columnNum1);
				System.out.println("Matrix after transpose");
				for (int row = 0; row < rowNum1; row++) {
					for (int coloumn = 0; coloumn < columnNum1; coloumn++) {
						System.out.print(transposeResult[row][coloumn]);
					}
					System.out.println();
				}

				break;
			case (3):
				System.out.println("Enter the new matrix to multiply");
				matrixObject.setInput(matrixTwo);
				matrixObject.multiply(matrixOne, matrixTwo, rowNum1,
						columnNum1, rowNum2, columnNum2);
				System.out.println("Resultant matrix after multiplication");
				matrixObject.show(multiplicationResult, rowNum1, columnNum2);
				break;
			case (4):
				break;
			default:
				System.out.println("ILLEGAL SELECTION..!!");
			}
		} while (operationNumber != 4);
		System.exit(0);
	}

	/**
	 * This method gets the input from the user related to matrix that is being
	 * required
	 * 
	 * @param matrix
	 *            - input matrix
	 */
	public void setInput(int[][] matrix) {
		System.out.println();
		System.out.println("Enter number of rows of the matrix:");
		if (rowNum1 == 0)
			rowNum1 = sc.nextInt();
		else
			rowNum2 = sc.nextInt();
		System.out.println("Enter number of coloumns of the matrix:");
		if (columnNum1 == 0)
			columnNum1 = sc.nextInt();
		else
			columnNum2 = sc.nextInt();
		matrixOne = new int[rowNum1][columnNum1];
		matrixTwo = new int[rowNum2][columnNum2];
		System.out.println("Enter the values in the matrix");
		if (matrixCount == 1) {
			addElements(matrixOne, rowNum1, columnNum1);
			matrixCount++;
		} else
			addElements(matrixTwo, rowNum2, columnNum2);

	}

	/**
	 * This method displays the matrix entered by the user
	 * 
	 * @param matrix
	 *            - Input matrix
	 * @param rows
	 *            - To store number of rows of the matrix
	 * @param columns
	 *            - To store number of columns of the matrix
	 */
	public void show(int[][] matrix, int rows, int columns) {
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int coloumnCount = 0; coloumnCount < columns; coloumnCount++) {
				System.out.print(matrix[rowCount][coloumnCount]);
			}
			System.out.println();
		}
	}

	/**
	 * This method is used to find out transpose of a given matrix and return
	 * the resultant matrix
	 * 
	 * @param matrix
	 *            - Input matrix to find the transpose
	 * @param rows
	 *            - To store number of rows of the matrix
	 * @param columns
	 *            - To store the number of columns of the input matrix
	 * @return int[][] transposeResult - resultant transposed matrix
	 */
	public int[][] transposeMatrix(int matrix[][], int rows, int columns) {

		transposeResult = new int[columns][rows];
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int columnCount = 0; columnCount < columns; columnCount++) {

				transposeResult[columnCount][rowCount] = matrix[rowCount][columnCount];

			}
		}
		return transposeResult;
	}

	/**
	 * This method is used to add elements in a given matrix
	 * 
	 * @param matrix
	 *            - Input matrix in which elements are to be added
	 * @param rows
	 *            - Number of rows in the matrix
	 * @param columns
	 *            -To store number of columns in the matrix
	 */
	private void addElements(int matrix[][], int rows, int columns) {
		for (int rowCount = 0; rowCount < rows; rowCount++) {

			for (int columnCount = 0; columnCount < columns; columnCount++) {
				matrix[rowCount][columnCount] = sc.nextInt();

			}
		}
		show(matrix, rows, columns);
	}

	/**
	 * This method is used to multiply two input matrix and return the resultant
	 * matrix
	 * 
	 * @param matrix1
	 *            - First matrix
	 * @param matrix2
	 *            - Second matrix
	 * @param rowOne
	 *            - To store number of rows in first matrix
	 * @param columnOne
	 *            - To store number of columns in first matrix
	 * @param rowTwo
	 *            - To store number of rows in second matrix
	 * @param columnTwo
	 *            - To store number of columns in second matrix
	 * @return int[][] multiplicationResult - TO return the resultant multiplied
	 *         matrix
	 */
	public int[][] multiply(int matrix1[][], int matrix2[][], int rowOne,
			int columnOne, int rowTwo, int columnTwo) {

		if (columnOne != rowTwo) {
			System.out.println("Illegal input \n multiplication not possible");
			System.exit(0);
		} else {
			multiplicationResult = new int[rowOne][columnTwo];
			for (int i = 0; i < rowOne; i++) {
				for (int j = 0; j < columnTwo; j++) {
					for (int k = 0; k < columnOne; k++) {
						multiplicationResult[i][j] = multiplicationResult[i][j]
								+ (matrix1[i][k] * matrix2[k][j]);
					}
				}
			}
		}
		return multiplicationResult;
	}
}
