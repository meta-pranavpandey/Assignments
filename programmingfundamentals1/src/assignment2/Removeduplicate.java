package assignment2;

public class Removeduplicate 


{
	




	
	/*To store the output array*/
	public int output[];
	
	/*To store the size of the input array*/
	private int end;
		
	int[] removeDuplicate(int input[])
	{

	    end = input.length;

	    /*First we shift the numbers in the input array 
	     * and leave the duplicates one and mark the end position
	     * till where distinct numbers are present*/

	    for (int i = 0; i < end; i++) 
	    {
	        for (int j = i + 1; j < end; j++) 
	        {
	            if (input[i] == input[j]) 
	            {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++) 
	                {
	                    input[shiftLeft] = input[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] output = new int[end];	//To store the output arra
	    for(int i = 0; i < end; i++){
	        output[i] = input[i];
	    }
	    return output;
	}
	
}
	
	
	
	
	
