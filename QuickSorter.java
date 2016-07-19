package com.pf3.assignment;


import java.util.Scanner;

/**This class 
 * 
 * @author Pranav_Pandey
 *
 */
public class QuickSorter
{	
		int[] quickSort(int arrayList[])
		{ 
			 if(arrayList.length==0)
			 return arrayList;
			 recursiveQuickSort(arrayList, 0, arrayList.length - 1);
			 return arrayList;
		}
		/**
		 * 
		 * @param array
		 * @param start
		 * @param end
		 */
		 void recursiveQuickSort(int[] array, int start, int end) 
		 {
			int index = partition(array, start, end); 
			// Recursively call quick sort with left part of the partitioned array 
			if (start < index - 1)
			{
				recursiveQuickSort(array, start, index - 1); 
			} 
			// Recursively call quick sort with right part of the partitioned array 
			if (end > index) 
			{ 
				recursiveQuickSort(array, index, end); 
			}
		}
		/**
		 * 
		 * @param array
		 * @param left
		 * @param right
		 * @return
		 */
		int partition(int[] array, int left, int right) 
		{
			int pivot = array[left]; 
			// taking first element as pivot 
			while (left <= right) 
			{ 
				//searching number which is greater than pivot, bottom up 
				while (array[left] < pivot) 
				{ 
					left++; 
				} //searching number which is less than pivot, top down
				while (array[right] > pivot)
				{
					right--; 
				} // swap the values 
				if (left <= right) 
				{ 
					int tmp = array[left];
					array[left] = array[right]; 
					array[right] = tmp; 
					//increment left index and decrement right index 
					left++;
					right--; 
				} 
			} 
			return left; 
		}
		
	
	public static void main(String[] args) 
	{
		//Object Declaration
		QuickSorter sortElement= new QuickSorter();
		//Variable Declaration
		int numberListSize,index; 
		
		Scanner Input = new Scanner(System.in);
		try
		{
			System.out.print("Enter the Size :");
			numberListSize = Input.nextInt();

		
		//Array Declaration 
		int []numberList = new int[numberListSize];
		
		//Input the array Elements
		System.out.println("Enter the Elements");
		for(index = 0;index<numberListSize;index++)
		{
			numberList[index]=Input.nextInt();
		}
		
		numberList = sortElement.quickSort(numberList);
		
		//Display OutPut
		System.out.print("Sorted array is :");
		
		for(index = 0;index<numberListSize;index++)
		{
			
				System.out.print(numberList[index]+" ");
		}
		Input.close();
		}
		catch(Exception exp)
		{
			System.out.println("Wrong Input");
		}
		
		}
	
}
