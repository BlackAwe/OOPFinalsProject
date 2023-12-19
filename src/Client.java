import java.util.List;
import java.util.ArrayList;

public class Client extends User{
	// class fields
	private String name;
	private String email;
	private String address;
	private int contactInfo;
	
	// constructor
	public Client (String userName, String password, String name, String address, String email, int contactInfo) {
		super(userName, password);
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactInfo = contactInfo;
	}
	
	// getters and setters
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContactInfo(int contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	// METHODS
	@Override
	public void DisplayDetails() {
		System.out.println("Name: " + this.getName());
		System.out.println("Address: " + this.getAddress());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Contact Information: " + this.getContactInfo());
		
	}
}
