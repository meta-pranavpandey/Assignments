/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */

public class Authors {
	private int author_id;
	private String publisher_name;

	/**
	 * @return the author_id
	 */
	public int getAuthor_id() {
		return author_id;
	}

	/**
	 * @param author_id
	 *            the author_id to set
	 */
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
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
