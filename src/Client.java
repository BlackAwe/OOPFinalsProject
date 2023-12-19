import java.util.List;
import java.util.ArrayList;


public class Client extends User{
	// class fields
	private String name;
	private String email;
	private int contactInfo;
	
	// constructor
	public Client (String userName, String password, String name, String email, int contactInfo) {
		super(userName, password);
		this.name = name;
		this.email = email;
		this.contactInfo = contactInfo;
	}
	
	// getters and setters
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public int getContactInfo() {
		return this.contactInfo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContactInfo(int contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	// METHODS
	public void SignUp(String name, String email, String password, int contactInfo) {
		
	}
	public String SendFeedback(String feedback) {
		return feedback;
	}
	
	public void DisplayDetails() {
		
	}
}
