import java.util.Scanner;

/**
 * This class acts as the User Interface for the other class implementation Task
 * Performed are as follows- *Take Input from User * Validation of inputs *
 * Display of Outputs
 * 
 * @author Pranav_Pandey
 *
 */

public class Helper {

	public int getIntegerInput() {
		int integerValue = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean toContinue = true;
		String userinput = "";
		while (toContinue) {
			userinput = sc.next();
			if (!isIntegerInputValid(userinput)) {
				System.out.println("Enter only integers");
			} else {
				toContinue = false;
			}
		}
		integerValue = Integer.parseInt(userinput);
		return integerValue;
	}

	/**
	 * 
	 * @return the character value
	 */
	public String getCharacterValue() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String characterValue;
		characterValue = input.nextLine();
		return (characterValue);

	}

	public void display(int[] inputArray, int numberOfElements) {
		System.out.println();
		for (int index = 0; index < numberOfElements; index++) {
			System.out.print("\t" + inputArray[index]);
		}
	}

	/**
	 * This method verifies if the parameter given is an integer or not
	 * 
	 * @param userInput
	 * @return True if parameter is an integer
	 */
	public boolean isIntegerInputValid(String userInput) {
		int totalChar = userInput.length();
		if (totalChar == 0) {
			return false;
		}
		for (int index = 0; index < totalChar; index++) {
			if (userInput.codePointAt(index) < "0".codePointAt(0)
					|| userInput.codePointAt(index) > "9".codePointAt(0)) {
				return false;
			}
		}
		return true;
	}

	public void printSortedArray(int result[]) {

		for (int index = 0; index < result.length; index++) {
			System.out.println(result[index]);
		}
	}

	public void displayMessage() {
		System.out.println("\nSelect operation you want to perform.!");
		System.out.println("1. Enter Element Of Array");
		System.out.println("2. Comparison Sorting");
		System.out.println("3. Linear Sorting");
		System.out.println("4. Exit");
	}
}
