/**
 * 
 * This class Implements the Tree sorting approach to sort the students on the
 * basis of rollno.
 * 
 * @author Pranav_Pandey
 */

public class StudentArrangement {

	/**
	 * Main class to control the flow of execution of the programm
	 * 
	 * @param arg
	 *            - (String[]) denotes command line arguments.
	 */
	public static void main(String args[]) {
		String choiceCharacter = "y";
		int choiceValue;

		do {
			System.out.println("Student Arrangement System");
			System.out.println("\nPress 1 to Peform the Arrangement Task");
			System.out.println("Press 0 to Exit the System");
			System.out.println("Please Enter your Choice");
			Helper help = new Helper();
			choiceValue = help.getIntegerInput();

			switch (choiceValue) {

			case 1:
				TreeSort rollnoSorting = new TreeSort();
				rollnoSorting.getUserInput();
				System.out.println("\n\nDo you want to continue (Press Y)");
				choiceCharacter = help.getCharacterValue();
				break;

			case 0:
				System.out.println("Thank You for Using the System");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Input please Try Again");

			}

		} while ((choiceCharacter.equalsIgnoreCase("y")));
		System.out.println("END OF PROGRAM");
	}

}
