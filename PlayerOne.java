package oops3;

/**
 * This is PLayer one class which implements Player interface and stores data of
 * the first player
 * 
 * @author Pranav_Pandey
 *
 */
public class PlayerOne implements Player

{
	private String name;
	private String symbolOne = "";

	/**
	 * Sets symbol for the first player
	 */
	public void setSymbol(String symbolOne) {
		this.symbolOne = symbolOne;

	}

	/**
	 * @return the symbol given to the first player
	 */
	public String getSymbol() {
		return symbolOne;
	}

	/**
	 * Sets the name of the player
	 * 
	 * @param playerName
	 *            - the name for the player
	 */
	public void setName(String playerName)

	{
		name = playerName;
	}

	/**
	 * @return the name of the first player
	 */
	public String getName() {
		return name;
	}
}
