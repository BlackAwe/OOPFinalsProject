import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Client extends User{
	// class fields
	private String name;
	private String email;
	private String address;
	private String contactInfo;
	
	// constructor
	public Client (String userName, String password, String name, 
			String address, String email, String contactInfo) {
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
	
	public String getContactInfo() {
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
	
	public void setContactInfo(String contactInfo) {
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
	
	@Override
	public void UpdateUserDetails() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("What would you like to update?");
		 System.out.println("1. Client Name");
		 System.out.println("2. Address");
		 System.out.println("3. Email");
		 System.out.println("4. Contact Information");
		 System.out.print("Enter your choice (1-4): ");
		 
		 int choice = scanner.nextInt();
		 scanner.nextLine(); // Consume newline

	     switch (choice) {
	     	case 1:
	     		System.out.print("Enter new client name: ");
	     		String newEventName = scanner.nextLine();
	     		this.setName(newEventName);
	     		break;
	     	case 2:
	     		System.out.print("Enter new client address: ");
	     		String newAddress = scanner.nextLine();
	     		this.setAddress(newAddress);
	     		break;
	     	case 3:
	     		System.out.print("Enter new client email: ");
	     		String newEmail = scanner.nextLine();
	     		this.setEmail(newEmail);
	     		break;
	        case 4:
	        	System.out.print("Enter new client contact information: ");
	        	String newContactInformation = scanner.nextLine();
	        	this.setContactInfo(newContactInformation);
	        	break;
	        default:
	        	System.out.println("Invalid choice");
	        }
	        System.out.println("Event details updated successfully!");
	}
}
