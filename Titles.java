/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class Titles {

	private String title_Id;
	private String title_Name;
	private int subject_Id;
	private int publisher_Id;

	/**
	 * @return the title_Id*\
	 * 
	 */
	public String getTitle_Id() {
		return title_Id;
	}

	/**
	 * @param title_Id
	 *            the title_Id to set
	 */
	public void setTitle_Id(String title_Id) {
		this.title_Id = title_Id;
	}

	/**
	 * @return the title_name
	 */
	public String getTitle_Name() {
		return title_Name;
	}

	/**
	 * @param title_name
	 *            the title_name to set
	 */
	public void setTitle_Name(String title_Name) {
		this.title_Name = title_Name;
	}

	/**
	 * @return the subject_Id
	 */
	public int getSubject_Id() {
		return subject_Id;
	}

	/**
	 * @param subject_Id
	 *            the subject_Id to set
	 */
	public void setSubject_Id(int subject_Id) {
		this.subject_Id = subject_Id;
	}

	/**
	 * @return the publisher_Id
	 */
	public int getPublisher_Id() {
		return publisher_Id;
	}

	/**
	 * @param publisher_Id
	 *            the publisher_Id to set
	 */
	public void setPublisher_Id(int publisher_Id) {
		this.publisher_Id = publisher_Id;
	}
}
