package com.pf3.assignment;

public class LargestDigitFinder {

	public static void main(String[] args) {

	}

	public int findLargestDigit(int number) {
		if (number < 10)
			return number;
		else {
			if (number % 10 > findLargestDigit((number / 10))) {
				return (number % 10);
			}
			else {
				return (findLargestDigit(number / 10));
			}

		}
	}
}
