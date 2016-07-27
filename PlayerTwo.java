package oops3;

public class PlayerTwo implements Player {

	private String name;
	private String symbolTwo = "";

	/**
	 * This sets the the symbol for the player
	 */
	public void setSymbol(String symbolTwo) {
		this.symbolTwo = symbolTwo;
	}

	/**
	 * @return the name of the player
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of the user
	 */
	public void setName(String playerName) {
		name = playerName;
	}

	/**
	 * @return the symbol the player
	 */
	public String getSymbol() {
		return symbolTwo;
	}

}
