package Assignment1;
import java.util.Scanner;
public class Binarytooctal {

	/*scanner for taking binary number input*/ 
	private Scanner sc; 
	
	/*To store the eqivalent octal number for the given binary number*/
	private int octal=0;
	
	/*To store the binary number given by the user*/
	private int binary=0;
	
	public static void main(String[] args)
	{
		
		Binarytooctal bto=new Binarytooctal();
		bto.getInput();
		bto.getOutput();
		
		// TODO Auto-generated method stub
	
}
	/*This method takes the input from the user using keyboard*/
	public void getInput()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		binary=sc.nextInt();
		
	}
	
	/**
	 * This method will convert binary to octal
	 * It will return int octal for the given int binary*/
	
	int convertBinaryToOctal(int n)
	{	int reverseOctal=0;				//For storing the octal number's reverse
		int count=1;				
		int binaryOctalFactor=1;	//For converting to octal by multiplication
		int bit=0;					//For storing each bit of the binary number
		int temp=0;					//FOr storing temporary data
		int tempOctal=0;			//For storing temporary octal number
		while(n!=0)
		{
			while(count<=3)
		
			{
				bit=n%10;
				n=n/10;
				temp=temp+(bit*binaryOctalFactor);
				binaryOctalFactor=binaryOctalFactor*2;
				tempOctal=tempOctal+temp;
				count++;
				temp=0;
			}
			binaryOctalFactor=1;
			count=1;
		reverseOctal=(reverseOctal*10)+tempOctal;
		tempOctal=0;
		
		}
	
		while(reverseOctal!=0)
			{
			int digit=reverseOctal%10;
			reverseOctal=reverseOctal/10;
			octal=(octal*10)+digit;
			}
		return octal;
	
	}
	
	public void getOutput()
	{
		int oct=convertBinaryToOctal(binary);
		System.out.println("The octal equivalent for the given binary number is"+oct);
	}

}
