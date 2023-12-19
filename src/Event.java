
public class Event {
	// class fields
	private int eventId;
	private String eventName;
	private String typeOfEvent;
	private String dateAndTime;
	private String venue;
	private int noOfParticipants;
	private String description;
	private String status;
	
	// constructor
	public Event(int eventId, String eventName, String typeOfEvent, String dateAndTime,  
			String venue, int noOfParticipants, String description) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.typeOfEvent = typeOfEvent;
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
		return this.typeOfEvent;
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
		
	}
	
	public void CancelEvent() {
		
	}
	
	public void ViewHistory() {
		
	}
}
