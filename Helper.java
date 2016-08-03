package assignment1;

import java.io.IOException;
import java.util.Scanner;
public class Helper {

	private int jobPriority;
	private String jobDesc;

	public static void main(String[] args) {
		Helper hlp = new Helper();
		hlp.getInput();
	}

	/**
	 * @return the jobPriority
	 */
	public int getJobPriority() {
		return jobPriority;
	}

	/**
	 * @param jobPriority
	 *            the jobPriority to set
	 */
	public void setJobPriority(int jobPriority) {
		this.jobPriority = jobPriority;
	}

	/**
	 * @return the department
	 */
	public String getJobDesc() {
		return jobDesc;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setJobDesc(String jobType) {
		this.jobDesc = jobType;
	}

	public void getInput() {
		int type = 0;
		try{
		System.out.println("Select The job Type: \n");
		System.out
				.println("1-Undergraduates \n 2-Graduate Students \n 3-Professor \n 4-Department Chair");
		Scanner sc=new Scanner(System.in);
		type=sc.nextInt();
		if(type>4)
		{
			throw new IOException("Invalid input");
		}
		else
		{
			System.out.println("Enter Job Description");
			jobDesc=sc.nextLine();
		}
		}
		catch(IOException e)
		{
			System.out.println("Please check the entered Type:");
			getInput();
		}
		
		{
			
		}
	}
}
