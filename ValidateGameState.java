package oops3;

/**
 * This class only checks all the winning condition and returns values
 * accordingly
 * 
 * @author Pranav_Pandey
 *
 */
public class ValidateGameState {
	private int crossSymbol;
	private int zeroSymbol;
	private int row;
	private String[][] boardState = new Board().getBoard();
	public static final boolean WIN = true;

	/**
	 * This function check all the rows columns and diagonals for any winning
	 * condition and returns true if there is a Win else returns False
	 * 
	 * @return
	 */
	public boolean checkStatus() {
		if (checkRow() == true || checkColumn() == true
				|| checkDiagonal() == true) {
			return WIN;
		} else
			return false;
	}

	/**
	 * This function checks if there is any winning condition in any row and
	 * returns true i.e WIN if there is otherwise returns false
	 * 
	 * @return
	 */
	public boolean checkRow() {
		crossSymbol = 0;
		zeroSymbol = 0;

		for (int i = 0; i < 3; i++) { /* checks all the rows for winning condition */
			for (int j = 0; j < 3; j++) {
				if (boardState[i][j] == "X") {
					crossSymbol++;
				}
				if (boardState[i][j] == "O") {
					zeroSymbol++;
				}
			}

		}
		if (crossSymbol == 3 || zeroSymbol == 3)
			return WIN;
		else
			return (false);

	}

	/**
	 * This function checks if there is any winning condition in any column and
	 * returns true i.e WIN if there is otherwise returns false
	 * 
	 * @return
	 */
	public boolean checkColumn() {
		crossSymbol = 0;
		zeroSymbol = 0;
		for (int i = 0; i < 3; i++) { /*
									 * Check all the columns for winning
									 * condition
									 */
			for (int j = 0; j < 3; j++) {
				if (boardState[j][i] == "X") {
					crossSymbol++;
				}
				if (boardState[j][i] == "O") {
					zeroSymbol++;
				}
			}

		}
		if (crossSymbol == 3 || zeroSymbol == 3)
			return WIN;
		else
			return (false);
	}

	/**
	 * This function checks if there is any winning condition diagonally and
	 * returns true i.e WIN if there is otherwise returns false
	 * 
	 * @return
	 */
	public boolean checkDiagonal() {
		crossSymbol = 0;
		zeroSymbol = 0;
		row = 0;
		for (int i = 0; i < 3; i++) { /* Check the left diagonal */
			if (boardState[i][i] == "X") {
				crossSymbol++;
			}
			if (boardState[i][i] == "O") {
				zeroSymbol++;
			}
			for (int j = 2; j >= 0; j--) { /* Check the right diagonal */
				if (boardState[row][j] == "X") {
					crossSymbol++;
					row++;
				}
				if (boardState[row][j] == "O") {
					zeroSymbol++;
					row++;
				}
			}

		}
		if (crossSymbol == 3 || zeroSymbol == 3)
			return WIN;
		else
			return (false);
	}

}
