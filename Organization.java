

public class Organization extends Entity {

	public Organization(String name, String email) {
		setName(name);
		setEmail(email);
		setPrintableString();
	}
	
	public void setPrintableString() {
		String s = "Organization";
		s = s + "Name = " + getName()+"\n";
		s = s + "Email = " + getEmail()+"\n";
		printableString = s;
	}
	
	
}
