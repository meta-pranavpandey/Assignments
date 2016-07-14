package assignment2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Removeduplicatetest {
	
	Removeduplicate rd=new Removeduplicate();
	


@Test
public void btotest()
{
int[] output = {1,2,3,4,};
int[] input= {1,2,3,4,2,1};
assertArrayEquals(output,rd.removeDuplicate(input));

}
}
	
