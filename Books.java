/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class Books {
	private int accession_no;
	private int title_id;
	private String purchase_date;
	private String status;

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
	 * @return the title_id
	 */
	public int getTitle_id() {
		return title_id;
	}

	/**
	 * @param title_id
	 *            the title_id to set
	 */
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	/**
	 * @return the purchase_date
	 */
	public String getPurchase_date() {
		return purchase_date;
	}

	/**
	 * @param purchase_date
	 *            the purchase_date to set
	 */
	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
