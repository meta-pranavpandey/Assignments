package com.pf4.assignment;

import java.util.*;

/**
 * This class is implemented to solve the tower of hanoi problem i.e to put all
 * discs of different sizes from one rod to another using a temporary
 * rod(storage) in minimum number of movements given that any bigger disc cannot
 * be put above a smaller sized rod
 * 
 * @author Pranav_Pandey
 *
 */
public class TowerOfHanoi {

	List<String> outputList = new ArrayList<String>();		//An ArrayList which stores the  

	/**
	 * This method solves the tower of hanoi problem using recursion using base
	 * case when number of discs is 1 then put the disc from start to end
	 * position
	 * 
	 * @param numDiscs
	 *            - To store the number of discs
	 * @param start
	 *            - Starting position of discs(name)
	 * @param auxiliary
	 *            - temporary rod name
	 * @param end
	 *            - Final rod name or position
	 */
	public List<String> solve(String start, String auxiliary, String end,
			int numDiscs) {
		/*
		 * If number of discs is 1 then transfer the disc as start position to
		 * end position
		 */
		if (numDiscs == 1) {
			outputList.add(start + " -> " + end);
		} else {
			solve(start, end, auxiliary, numDiscs - 1);
			outputList.add(start + " -> " + end);
			solve(auxiliary, start, end, numDiscs - 1);
		}
		return outputList;
	}

	public static void main(String[] args) {
		TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
		System.out.print("Enter number of discs: ");
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		towersOfHanoi.solve("A", "B", "C", discs); // A,B and C are rod names of
													// start, auxilliary and end
													// respectively
		scanner.close();
	}
}