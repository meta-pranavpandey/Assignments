package assignment3;

public class Longestsequence {
	
	 
	
	public int[] longestSequence(int[] input)
	    {        
	        int size = input.length;
	        int temp1[]=new int[size+1];
	        int temp2[]=new int[size+1];
	        int output[]=new int[size+1];
	        int count=0;
	        int sequence=0;
	        temp1[0]=input[0];
	        
	        while (sequence<size)
	        {
	        	for(int i=1;i<size;i++)
	        	{
	        		if(input[i]>input[i-1])
	        		{
	        			temp1[count]=input[i];
	        			count++;
	        		}
	        		else if(count>sequence)
	        		{
	        			for(int k=0;k<=count;k++)
	        			{
	        				output[k]=temp1[k];
	        			}
	        			sequence=count;
	        			break;
	        		}
	        	}
	        }
	    
	 
	     
	        return output;             
	    
		 

	
		 
		 
	   }
	
	 
}
