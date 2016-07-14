package assignment6;

public class Arrayjoin 
{

	/**This method takes two sorted arrays and their sizes and also
	 *  an empty array to store the first two joined arrays in a sorted manner*/ 
	
	int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		
		    int i = 0;
		    int j = 0;
		    int k = 0;
		    while (i < asize && j < bsize)
		    {
		        if (a[i] < b[j])
		        {
		            c[k] = a[i];
		            i++;
		        }
		        else
		        {
		            c[k] = b[j];
		            j++;
		        }
		        k++;
		    }

		    while (i < asize)
		    {
		        c[k] = a[i];
		        i++;
		        k++;
		    }

		    while (j < bsize)
		    {
		        c[k] = b[j];
		        j++;
		        k++;
		    }

		    return c;
		}
	
	
}
