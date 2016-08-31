/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class Publishers {
	private int publisher_id;
	private String publisher_name;

	/**
	 * @return the publisher_id
	 */
	public int getPublisher_id() {
		return publisher_id;
	}

	/**
	 * @param publisher_id
	 *            the publisher_id to set
	 */
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	/**
	 * @return the publisher_name
	 */
	public String getPublisher_name() {
		return publisher_name;
	}

	/**
	 * @param publisher_name
	 *            the publisher_name to set
	 */
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

}
