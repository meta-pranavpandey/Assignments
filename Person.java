
public class Person extends Entity {
	
	int age;
	
	/**
	 * Constructor for person
	 * @param name
	 * @param inAge
	 * @param email
	 */
	public Person(String name, int inAge, String email) {
		setName(name);
		setType(PERSON);
		setAge(inAge);
		setEmail(email);
		setPrintableString();
	}
	
	
	//getter setter for age
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	
	/*
	 * To generate summary
	 */
	public void setPrintableString() {
		String s = "Person";
		s = s + "Name = " + getName()+"\n";
		s = s + "Age = " + getAge()+"\n";
		s = s + "Email = " + getEmail()+"\n";
		printableString = s;
	}
	
}
