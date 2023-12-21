
public class Event {
	// class fields
	private static int lastEventId = 200;
	private int eventId;
	private String eventName;
	private String eventType;
	private String dateAndTime;
	private String venue;
	private int noOfParticipants;
	private String description;
	private String status;
	
	// constructor
	public Event(String eventName, String eventType, String dateAndTime,  
			String venue, int noOfParticipants, String description) {
		this.eventId = ++lastEventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.dateAndTime = dateAndTime;
		this.venue = venue;
		this.noOfParticipants = noOfParticipants;
		this.description = description;
		this.status = "Pending for payment";
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
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	// METHODS
	// Method to display important information of the event
	public void DisplayEventInfo() {
		System.out.println("=== Event Details ===");
		System.out.println(this.getEventName());
		System.out.println("Event ID: " + this.getEventId());
		System.out.println("Event Type: "  + this.getType());
		System.out.println("Event Venue: " + this.getVenue());
		System.out.println("Date and Time: " + this.getDate());
		System.out.println("Number of Participants: " + this.getParticipants());
		System.out.println("Description: " + this.getDescription());
		System.out.println("Event Status: " + this.getStatus());
        System.out.println("=====================");
	}
	
	// Method and logic to calculate how much is the expenses for the event
	public int CalculateEventFees() {
		return this.getParticipants() * 150 + 10000; // 10,000 assuming event cost and 150 per person
	}

}
