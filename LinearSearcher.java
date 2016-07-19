package com.pf3.assignment;

public class LinearSearcher {

	public static void main(String[] args) {

		LinearSearcher ls=new LinearSearcher();
		int[] arrayOne={2,5,8,9,10, 77, 55};
		ls.searchLinear(arrayOne,2);
		
	}

	int index = 0;

	public int searchLinear(int arr[],int element) {
		
		
		if( arr[index] == element)
		{	
			System.out.println(index);
			return index;
			
		}
		
		else if(index>=arr.length-1) 
		{
			return -1;
			}
		else
		{	index++;
			return searchLinear( arr , element);
		}
	}
}
