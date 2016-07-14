package assignment3;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Longestsequencetest 
{
Longestsequence ls=new Longestsequence();

@Test
public void lstest()
{
	int[] arr={1,2,3,4,5,6,7,8,9};
	int[] result={1,2,3,4,5,6,7,8,9};
	assertArrayEquals(result,ls.longestSequence(arr));
	
}


}

