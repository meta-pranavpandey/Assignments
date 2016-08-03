package assignment1;

public class Helper {
	
	private int jobPriority;
	private String department;
	
	public static void main(String[] args) {
		Helper hlp=new Helper();
		hlp.getInput();
		}

	/**
	 * @return the jobPriority
	 */
	public int getJobPriority() {
		return jobPriority;
	}

	/**
	 * @param jobPriority the jobPriority to set
	 */
	public void setJobPriority(int jobPriority) {
		this.jobPriority = jobPriority;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	
	public void getInput()
	{
		
	}
}
