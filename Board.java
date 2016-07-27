package oops3;

/**
 * This class sets up the board for playing the TicTacToe game
 * 
 * @author Pranav_Pandey
 *
 */
public class Board {

	private static String boardInput[][] = new String[3][3];

	/**
	 * Non parameterized constructor to initialize the game board
	 */

	/**
	 * This function marks the symbol of the current player at the given row and
	 * column
	 * 
	 * @param row
	 *            - row number to place the mark
	 * @param column
	 *            - column number to place to mark
	 */
	public void markSymbol(int row, int column) {

		boardInput[row][column] = new TicTacToe().getActiveSymbol();

	}

	public void setBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				boardInput[i][j] = "";
			}
		}
	}

	/**
	 * 
	 * @return boardInput variable
	 */
	public String[][] getBoard() {
		return boardInput;
	}

	/**
	 * This function prints the game board to check the status of the game
	 */
	public void printBoard() {
		System.out.println("-------------");
		System.out.println("|" + " " + boardInput[0][0] + " " + "|" + " "
				+ boardInput[0][1] + " " + "|" + " " + boardInput[0][2] + " "
				+ "|");

		System.out.println("------------");

		System.out.println("|" + " " + boardInput[1][0] + " " + "|" + " "
				+ boardInput[1][1] + " " + "|" + " " + boardInput[1][2] + " "
				+ "|");
		System.out.println("-------------");

		System.out.println("|" + " " + boardInput[2][0] + " " + "|" + " "
				+ boardInput[2][1] + " " + "|" + " " + boardInput[2][2] + " "
				+ "|");

		System.out.println("-------------");

	}

}
