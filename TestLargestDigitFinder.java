package com.pf3.assignment;

import org.junit.*;

import static org.junit.Assert.*;

public class TestLargestDigitFinder {


	LargestDigitFinder ldf=new LargestDigitFinder();
	
	@Test
	public void digitFindingTest()
	{
		
	assertEquals(2, ldf.findLargestDigit(2));
	assertEquals(9, ldf.findLargestDigit(1257369));
	assertEquals(4, ldf.findLargestDigit(444));
		
	}
	
}


