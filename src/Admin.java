import java.util.List;
import java.util.ArrayList;

public class Admin extends User {
	// class fields
	private List<Event> reservedEvents = new ArrayList<Event>();
	
	// constructor
	public Admin(String userName, String password) {
		super(userName = "admin", password = "admin123");
	}
	
	
	// METHODS
	// Method to confirm and officially reserve the event
    public void ConfirmEvent() {
    	
    }
    
    public void SearchEvent(ArrayList<Event> events, int eventId) {
        boolean eventFound = false;

        for (Event event : events) {
            if (event.getEventId() == eventId) {
                eventFound = true;
                DisplayEventInfo(event); // Call the existing DisplayEventInfo method
                break;
            }
        }

        if (!eventFound) {
            System.out.println("Event with ID " + eventId + " not found.");
        }
    }
    
    public void DisplayEventInfo(Event event) {
        System.out.println("=== Event Details ===");
        System.out.println("Event ID: " + event.getEventId());
        System.out.println("Event Name: " + event.getEventName());
        System.out.println("Event Type: " + event.getType());
        System.out.println("Event Date and Time: " + event.getDate());
        System.out.println("Event Venue: " + event.getVenue());
        System.out.println("Participants: " + event.getParticipants());
        System.out.println("Description: " + event.getDescription());
        System.out.println("Event Status: " + event.getStatus()); // With status to enable confirmation
        System.out.println("=====================");
    }

    public void DisplayAllEventInfo(ArrayList<Event> events) {
    	for (Event userEvent : events) {
    		userEvent.DisplayEventInfo();
    	}
    }

    public void DeleteEvent(int eventId) {
        // Implement event deletion logic
    }
    
    
}
