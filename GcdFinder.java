package com.pf3.assignment;

/**This class is written to find out gcd (greatest common divisor)
 * 
 * @author Pranav_Pandey
 *
 */
public class GcdFinder {

	int gcd = 0;

	public static void main(String[] args) {

		GcdFinder gcd = new GcdFinder();
	}
/**This methos 
 * 
 * @param numberOne - Store number one
 * @param numberTwo - Store number two
 * @return int - GCD of the numbers given by the user
 */
	int findingGcd(int numberOne, int numberTwo) {

		if (numberOne < numberTwo) {
			return findingGcd(numberTwo, numberOne);
		}

		if (numberOne == 1 || numberTwo == 1) {
			return 1;
		}
		
		if(numberOne%numberTwo==0)
			return numberOne;
		else
			return findingGcd(numberTwo,(numberOne%numberTwo));

		
		
	}
}
