package assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Firstcomefirstservetest {

	
	Firstcomefirstserve conversion=new Firstcomefirstserve();

int at[] ={1,5,9,25} ;
int et[] ={12,7,2,5} ;

int expected[][] ={{0,1,12},{8,13,19},{11,20,21},{0,25,29}} ;

@Test
public void Fcfstest() {
	
assertArrayEquals(expected,conversion.firstComeFirstServe(at, et));

}

}