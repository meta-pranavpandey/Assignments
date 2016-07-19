package com.pf3.assignment;

import java.util.*;
/**
 * This class is used to find the largest digit of a given number
 * @author Pranav_Pandey
 *
 */
public class LargestDigitFinder {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=sc.nextInt();
		LargestDigitFinder ldf=new LargestDigitFinder();
		ldf.findLargestDigit(number);
		sc.close();
	}
	
	
	/**
	 * 
	 * @param number - The number in which the largest digit is to be searched
	 * @return int - It returns the largest digit of the given number
	 */
	public int findLargestDigit(int number) {
		if (number < 10)		//If number is single digit
			return number;
		else {
			if (number % 10 > findLargestDigit((number / 10))) {		//To check which digit is larger
				return (number % 10);
			}
			else {
				return (findLargestDigit(number / 10));			//To check all the digits recursively
			}

		}
	}
}
