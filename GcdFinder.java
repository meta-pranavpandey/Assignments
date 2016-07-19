package com.pf3.assignment;

public class GcdFinder {

	int gcd = 0;

	public static void main(String[] args) {

		GcdFinder gcd = new GcdFinder();
	}

	int findingGcd(int numberOne, int numberTwo) {

		if (numberOne < numberTwo) {
			int temp = numberOne;
			numberOne = numberTwo;
			numberTwo = temp;
		}

		if (numberOne == 1 || numberTwo == 1) {
			return 1;
		}
		
		else
		{
			if (numberOne < numberTwo)
			return findingGcd(number);
		}

	}

}