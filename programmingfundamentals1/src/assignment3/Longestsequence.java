package assignment3;

public class Longestsequence 
	{

	int[] longestSequence(int input[])	
	{
		int k,i,j,prevcount=0,l,count=0;
		l=input.length;
		int brr[]=new int[l];
		for(i=0;i<l-1;i++)
		{
			if(input[i]<input[i+1])
				count++;
			else
			{
				if(prevcount<count)
				{
					for(j=i-count,k=0;j<=i;j++,k++)
					{
						brr[k]=input[j];
					}
					
					prevcount=count;
				}
				count=0;
			}
		}
		
		if(prevcount<count)
		{
			for(j=i-count,k=0;j<=i;j++,k++)
			{
				brr[k]=input	[j];
			}
			
			prevcount=count;
		}
		
		count =0;
		for(i=0;i<brr.length;i++)
		{
			if(brr[i]!=0)
				count++;
		}
		
		int result[]=new int[count];
		
		for(i=0;i<count;i++)
		{
			result[i]=brr[i];
		}
		
		return result;	
		}
	}