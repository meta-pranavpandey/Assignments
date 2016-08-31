/**
 * POJO's class for the table in the database
 * @author Pranav_Pandey
 *
 */
public class TitleAuthors {
	private int author_id;
	private int title_id;

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
}
