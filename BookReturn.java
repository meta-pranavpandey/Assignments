/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class BookReturn {
	private String return_date;
	private int accession_no;
	private int member_id;
	private String isse_date;

	/**
	 * @return the return_date
	 */
	public String getReturn_date() {
		return return_date;
	}

	/**
	 * @param return_date
	 *            the return_date to set
	 */
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
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
	 * @return the isse_date
	 */
	public String getIsse_date() {
		return isse_date;
	}

	/**
	 * @param isse_date
	 *            the isse_date to set
	 */
	public void setIsse_date(String isse_date) {
		this.isse_date = isse_date;
	}
}
