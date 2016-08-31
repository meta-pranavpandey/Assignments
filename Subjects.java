/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class Subjects {
	private int subject_id;
	private String subject_name;

	/**
	 * @return the subject_id
	 */
	public int getSubject_id() {
		return subject_id;
	}

	/**
	 * @param subject_id
	 *            the subject_id to set
	 */
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	/**
	 * @return the subject_name
	 */
	public String getSubject_name() {
		return subject_name;
	}

	/**
	 * @param subject_name
	 *            the subject_name to set
	 */
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
}
