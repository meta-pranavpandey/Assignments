/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class BookIssue {
	private String issue_date;
	private int accession_no;
	private int member_id;
	private String due_date;

	/**
	 * @return the issue_date
	 */
	public String getIssue_date() {
		return issue_date;
	}

	/**
	 * @param issue_date
	 *            the issue_date to set
	 */
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	/**
	 * @return the accession_no
	 */
	public int getAccession_no() {
		return accession_no;
	}

	/**
	 * @param accession_no
	 *            the accession_no to set
	 */
	public void setAccession_no(int accession_no) {
		this.accession_no = accession_no;
	}

	/**
	 * @return the member_id
	 */
	public int getMember_id() {
		return member_id;
	}

	/**
	 * @param member_id
	 *            the member_id to set
	 */
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	/**
	 * @return the due_date
	 */
	public String getDue_date() {
		return due_date;
	}

	/**
	 * @param due_date
	 *            the due_date to set
	 */
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

}
