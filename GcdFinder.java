package com.pf3.assignment;

/**
 * This class is written to find out gcd (greatest common divisor)
 * 
 * @author Pranav_Pandey
 *
 */
public class GcdFinder {

	int gcd = 0;

	public static void main(String[] args) {

	}

	/**
	 * This method finds the gcd of two given numbers and returns the gcd, if
	 * either of the number is 1 then it returns 1
	 * 
	 * @param numberOne
	 *            - Store number one
	 * @param numberTwo
	 *            - Store number two
	 * @return int - GCD of the numbers given by the user
	 */
	int findingGcd(int numberOne, int numberTwo) {

		/*
		 * If first number one is less than number two , we call the function by
		 * interchanging the two numbers
		 */
		if (numberOne < numberTwo) {
			return findingGcd(numberTwo, numberOne);
		}

		if (numberOne == 1 || numberTwo == 1) {
			return 1;
		}
		/*
		 * If number one divides the number two completely, return number one,
		 * it will be the gcd of the two numbers
		 */
		if (numberOne % numberTwo == 0)
			return numberOne;
		/*
		 * If on division on number one by number two it leaves a remainder the
		 * pass number two in position one and remainder as number two
		 */
		else
			return findingGcd(numberTwo, (numberOne % numberTwo));

	}
}
