/**
 * This class is an abstract for defining Entities
 */
public abstract class Entity {


	private String name;
	private int type;
	private String email;

	public String printableString;
	
	int ORGANIZATION = 2;
	int PERSON = 1;
	
	
	/**
	 * Sets value for name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return type value
	 */
	
	
	public void getType(){
		return type;
	}
	/**
	 * Set value of type
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	
	//getter & setter for email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	

	//getter for printableString
	public String getPrintableString() {
		return printableString;
	}

}
