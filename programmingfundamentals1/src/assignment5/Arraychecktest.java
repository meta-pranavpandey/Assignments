package assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Arraychecktest 
{

	Arraycheck ac=new Arraycheck();
@Test
public void act()
{
	int asc[]={1,2,3,4,5,6,7,8,9};
	int dsc[]={9,8,7,6,5,4,3,2,1};
	int uns[]={1,4,2,8,79,3,5};
	assertEquals(1,ac.checkArray(asc));
	assertEquals(2,ac.checkArray(dsc));
	assertEquals(0,ac.checkArray(uns));
	
}
	
	
	
}
