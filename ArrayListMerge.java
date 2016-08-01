package ds1.assignment;
/**
 * THis class is to test the custom array list class
 * @author Pranav_Pandey
 *
 */
public class ArrayListMerge {

		public static void main(String []args)
		{
			MyArrayList<String> array=new MyArrayList<String>();
			MyArrayList<String> array1=new MyArrayList<String>();
			
			
			array.add("25");
			array.add("Pranav");
			array.add("Pandey");
			array.add("P");
			array1.add("R");
			array1.add("A");
			array1.add("N");
			array1.add("A");
			array1.add("V");
			array.remove("25");
			array.remove(2);
			array1.sort();
			
			for(int i=0;i<array.getSize();i++)
			{
				System.out.print("  "+array.getElement(i));
			}
		
			System.out.println();
			for(int i=0;i<array1.getSize();i++)
			{
				System.out.print("  "+array1.getElement(i));
			}
			
			System.out.println();
			array.addAll(array1);
			for(int i=0;i<array.getSize();i++)
			{
				System.out.print("  "+array.getElement(i));
			}
		
			
			
		}
	}