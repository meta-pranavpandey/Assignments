package com.pf4.assignment;

import org.junit.*;

import static org.junit.Assert.*;

import java.util.*;

/**
 * This is JUnit test class for the PermutationMaker class
 * @author Pranav_Pandey
 *
 */
public class TestPermutationMaker {
	
	PermutationMaker pm=new PermutationMaker();


	Set<String> outputList1;
/**
 * This method provide a setup for testing the generatePermutations method
 * @throws Exception
 */
	@Before
	public void setUp() throws Exception {
		
		outputList1 = new HashSet<String>();
		outputList1.add("ABC");
		outputList1.add("ACB");
		outputList1.add("BAC");
		outputList1.add("BCA");
		outputList1.add("CBA");
		outputList1.add("CAB");
	}

	@Test
	public void testPermutation() {
		assertEquals(outputList1, pm.generatePermutations("ABC"));
	}

}

