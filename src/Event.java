import java.util.Scanner;

public class Event {
	// class fields
	private int eventId;
	private String eventName;
	private String eventType;
	private String dateAndTime;
	private String venue;
	private int noOfParticipants;
	private String description;
	private String status;
	
	// constructor
	public Event(int eventId, String eventName, String eventType, String dateAndTime,  
			String venue, int noOfParticipants, String description) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.dateAndTime = dateAndTime;
		this.venue = venue;
		this.noOfParticipants = noOfParticipants;
		this.description = description;
	}
	// getters and setters
	public int getEventId() {
		return this.eventId;
	}
	
	public String getEventName() {
		return this.eventName;
	}
	
	public String getType() {
		return this.eventType;
	}
	
	public String getDate() {
		return this.dateAndTime;
	}
	
	public String getVenue() {
		return this.venue;
	}
	
	public int getParticipants() {
		return this.noOfParticipants;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setName(String eventName) {
		this.eventName = eventName;
	}
	
	public void setType(String eventType) {
		this.eventType = eventType;
	}
	
	public void setDate(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public void setParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	// METHODS
	public void CreateEvent() { // up to the user in how the event is created
		
	}
	
	public void DisplayEventInfo() {
		System.out.println(this.getEventName());
		System.out.println("Event Type:" + this.getType());
		System.out.println("Event Venue: " + this.getVenue());
		System.out.println("Date and Time: " + this.getDate());
		System.out.println("Number of Participants: " + this.getParticipants());
		System.out.println("Description: " + this.getDescription());
		System.out.println("Event Status: " + this.getStatus());
	}
	
	public void UpdateEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to update?");
        System.out.println("1. Event Name");
        System.out.println("2. Event Type");
        System.out.println("3. Date and Time");
        System.out.println("4. Venue");
        System.out.println("5. Number of Participants");
        System.out.println("6. Description");
        System.out.print("Enter your choice (1-6): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter new event name: ");
                String newEventName = scanner.nextLine();
                this.setName(newEventName);
                break;
            case 2:
                System.out.print("Enter new event type: ");
                String newEventType = scanner.nextLine();
                this.setType(newEventType);
                break;
            case 3:
                System.out.print("Enter new date and time: ");
                String newDateAndTime = scanner.nextLine();
                this.setDate(newDateAndTime);
                break;
            case 4:
                System.out.print("Enter new venue: ");
                String newVenue = scanner.nextLine();
                this.setVenue(newVenue);
                break;
            case 5:
                System.out.print("Enter new number of participants: ");
                int newNoOfParticipants = scanner.nextInt();
                this.setParticipants(newNoOfParticipants);
                break;
            case 6:
                System.out.print("Enter new description: ");
                String newDescription = scanner.nextLine();
                this.setDescription(newDescription);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Event details updated successfully!");
    }
	
	public void CancelEvent() {
		
	}
	
	public void ViewHistory() {
		
	}
}
