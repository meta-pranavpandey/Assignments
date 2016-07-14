package assignment5;

public class Arraycheck {
	
	/**This method will check if the input array is in ascending,
     *  descending or unsorted order*/
	   public int checkArray(int input[])
	    {
		   	/*ascending array check couner*/
	        int ascendingcheck=1;
	        
	        /*descending array check counter*/
	        int descendingcheck=1;
	        
	        
	        /*The loop will check the whole array to check the order and
	        increase the counter accordingly*/
	        for(int i=0;i<input.length-1;i++)
	        {
	            if(input[i]<input[i+1])
	            {
	                ascendingcheck++;
	               
	            }
	           
	            else if(input[i]>input[i+1])
	            {
	                descendingcheck++;
	            }    
	         }
	        
	        if(ascendingcheck==input.length)
	        {
	            return 1;
	            
	        }
	        
	        else if(descendingcheck==input.length)
	        {
	            return 2;
	        }
	        else
	        {
	            return 0;
	        }
	        
	    }
	    

	    
	}



