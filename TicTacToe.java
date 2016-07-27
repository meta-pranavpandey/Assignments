package oops3;

import java.util.Scanner;

/**
 * This class sets the symbols for the players as required and proceeds the
 * game.
 * 
 * @author Pranav_Pandey
 *
 */
public class TicTacToe {

	private String symbolOne = "";
	private String symbolTwo = "";
	private int turnCount = 0; // To count the total number of turns taken by
								// both the user
	private static String activeSymbol; // To store the current symbol active
										// according to the players turn
	private static Scanner sc = new Scanner(System.in);
	private static String playerOneName = "";
	private static String playerTwoName = "";

	public void setSymbolOne(String symbolOne) {
		this.symbolOne = symbolOne;
		if (this.symbolOne == "X")
			setSymbolTwo("O");
		else
			setSymbolTwo("X");
	}

	/**
	 * 
	 * @return the symbolOne
	 */
	public String getSymbolOne() {
		return symbolOne;
	}

	/**
	 * @return the activeSymbol
	 */
	public String getActiveSymbol() {
		return activeSymbol;
	}

	/**
	 * @param activeSymbol
	 *            the activeSymbol to set
	 */
	public void setActiveSymbol(String activeSymbol) {
		if (activeSymbol == "X")
			TicTacToe.activeSymbol = "O";
		else
			TicTacToe.activeSymbol = "X";
	}

	/**
	 * @return the symbolTwo
	 */
	public String getSymbolTwo() {
		return symbolTwo;
	}

	/**
	 * @param symbolTwo
	 *            the symbolTwo to set
	 */
	public void setSymbolTwo(String symbolTwo) {
		this.symbolTwo = symbolTwo;
	}

	/**
	 * This function works to play the game and continues till a player wins or
	 * the all board get filled up
	 */
	public void playGame() {
		Board gameBoard = new Board();
		gameBoard.setBoard();
		PlayerOne playerOne = new PlayerOne();
		PlayerTwo playerTwo = new PlayerTwo();
		playerOne.setName(playerOneName); // To set name for first player
		playerTwo.setName(playerTwoName); // To set name for second player
		Player currentPlayer;
		int row = 0;
		int column = 0;
		boolean status;

		/*
		 * Here we continue the game till the whole board fills up or a winner
		 * is found
		 */
		while (turnCount != 9) {
			if (turnCount % 2 == 1) {
				currentPlayer = playerOne;
				activeSymbol = symbolOne; // activates the symbol according to
											// the players turn
			} else {
				currentPlayer = playerTwo;
				activeSymbol = symbolTwo; // activates the symbol according to
											// the players turn
			}

			System.out.println(currentPlayer.getName()
					+ " Enter new location to place your mark ");
			row = sc.nextInt();
			column = sc.nextInt();
			gameBoard.markSymbol(row, column);
			gameBoard.printBoard();
			status = new ValidateGameState().checkStatus();
			if (status == true) {
				System.out.println(currentPlayer.getName() + " Won.!!! ");
				break;
			}
			turnCount++;
		}
	}

	/**
	 * Main method to control the flow of execution of the program
	 * 
	 * @param args
	 *            - arguments from the console
	 */
	public static void main(String[] args) {
		TicTacToe newGame = new TicTacToe();
		String symbolOne = "";

		System.out.println("Enter name for player one: ");
		playerOneName = sc.nextLine();
		System.out.println("Enter name for player one: ");
		playerTwoName = sc.nextLine();
		System.out.println("Enter symbol for player one 'X' or 'O'");
		symbolOne = sc.nextLine();
		newGame.setSymbolOne(symbolOne);
		System.out
				.println("The Symbols for the game are as Follows \n Player One:"
						+ newGame.getSymbolOne()
						+ "\n Player Two:"
						+ newGame.getSymbolTwo());
		newGame.playGame();
	}

}
