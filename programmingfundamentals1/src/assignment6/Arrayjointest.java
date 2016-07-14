package assignment6;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Arrayjointest
{
Arrayjoin aj=new Arrayjoin();

@Test
public void ajt()

	{
	int firstArray[]={1,4,8,9,12,14};
	int secondArray[]={2,3,6,11,15,32};
	int result[]={1,2,3,4,6,8,9,11,12,14,15,32};
	int thirdArray[]=new int[12];
	assertArrayEquals(result,aj.join(firstArray,6,secondArray,6,thirdArray));
	}

}
