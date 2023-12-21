import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Client extends User{
	// class fields
	private static int lastClientId = 0;
	private int id;
	private String name;
	private String email;
	private String address;
	private String contactInfo;
	private List<Event> eventList = new ArrayList<Event>();
	
	// constructor
	public Client (String userName, String password, String name, 
			String address, String email, String contactInfo) {
		super(userName, password);
		this.id = ++lastClientId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactInfo = contactInfo;
	}
	
	// getters and setters
	public int getId() {
		return this.id;
	}
	
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
	public void CreateEvent() { // up to the user in how the event is created
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("\nCreate an Event.");
        System.out.print("Enter Event Name: ");
        String eventName = scanner.next();
        System.out.print("Enter Type of Event: ");
        String eventType = scanner.next();
        System.out.print("Enter Date and Time: ");
        String dateAndTime = scanner.next();
        System.out.print("Enter Venue: ");
        String venue = scanner.next();
        System.out.print("Enter Number of Participants: ");
        int numOfParticipants = scanner.nextInt();
        System.out.print("Enter Description: ");
        String description = scanner.next();    

        Event event = new Event(eventName, eventType, dateAndTime, 
        		venue, numOfParticipants, description);
        this.eventList.add(event);
    }
	
	public void DisplayScheduledEvents() {
		for (Event userEvent : this.eventList) {
			userEvent.DisplayEventInfo();
			System.out.println();
		}
	}
	
	@Override
	public void DisplayUserDetails() {
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
	        System.out.println("Client details updated successfully!");
	}
	
	public void ReserveEvent() {
		
	}
	
	public void CancelEvent() {
		
	}
}
