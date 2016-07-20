package com.pf4.assignment;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.*;

/**
 * This is a JUnit test class for TowerOfHanoi class to check the outputs for
 * the speicfied inputs
 * 
 * @author Pranav_Pandey
 *
 */
public class TestTowerOfHanoi {

	List<String> stepsOneDisc;
	List<String> stepsTwoDiscs;
	TowerOfHanoi toh = new TowerOfHanoi();

	TowerOfHanoi towerOfHanoiObject;

	@Before
	public void setUp() throws Exception {
		towerOfHanoiObject = new TowerOfHanoi();
		stepsOneDisc = new ArrayList<String>();
		stepsTwoDiscs = new ArrayList<String>();
		stepsOneDisc.add("A -> C");
		stepsTwoDiscs.add("A -> B");
		stepsTwoDiscs.add("A -> C");
		stepsTwoDiscs.add("B -> C");
	}

	@Test
	public void testTowerOfHanoi() {
		assertEquals(stepsOneDisc, toh.solve("A", "B", "C", 1)); // checking
																	// for
																	// 1
																	// disk
		toh.outputList.clear(); // clears the set obtained from 1st check
		assertEquals(stepsTwoDiscs, toh.solve("A", "B", "C", 2)); // checking
																	// for
																	// 2
																	// disks
	}

}
