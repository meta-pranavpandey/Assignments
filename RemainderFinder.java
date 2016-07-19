package com.pf3.assignment;

/**
 * This class is made to find the remainder of a number divided by another as
 * given by the user
 * 
 * 
 * @author Pranav_Pandey
 *
 */
public class RemainderFinder {

	public static void main(String[] args) {

		RemainderFinder remfind = new RemainderFinder();
		remfind.findRemainder(1485, 147);

	}

	int remainder = 0; // To store the remainder of the division process
	int quotient = 0; // To store the quotient of the division
	/*
	 * variable INFINITE is used to return some value in case division is not
	 * possible
	 */
	public static final int INFINITE = 000000; // To return something when
												// divisor is zero
	public static final int UNDEFINED = 000; // To return something when both
												// divisor and dividend are zero

	/**
	 * This function takes
	 * 
	 * @param numberOne
	 *            - Number to be divide
	 * @param numberTwo
	 *            - Divisor
	 * @return remainder - To store the remainder of the calculation
	 */
	int findRemainder(int numberOne, int numberTwo) {
		if (numberOne < numberTwo) {
			return numberOne;
		}
		if (numberTwo == 0 && numberOne != 0)
			return (INFINITE); // In case divisor is zero(0)

		if (numberOne == 0 && numberTwo == 0)
			return (UNDEFINED);

		/*
		 * This block divides the number by the divisor singlt time and then
		 * again go for a recursive call to find the remainder
		 */
		else {
			return findRemainder((numberOne - numberTwo), numberTwo);
		}

	}
}
