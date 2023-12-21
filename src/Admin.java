import java.util.List;
import java.util.ArrayList;

public class Admin extends User {
	// class fields
	private List<Event> reservedEvents = new ArrayList<Event>();
	private static final String DEFAULT_PASSWORD = "admin123";
	
	// constructor
	public Admin(String userName) {
		super(userName, DEFAULT_PASSWORD);
	}
	
	// METHODS
	public Event GetUserEventById(List<User> userList, int userId, int eventId) {
        // Search for the user by ID in the userList
        User selectedUser = null;
        for (User user : userList) {
            if (((Client) user).getId() == userId) {
                selectedUser = user;
                break;
            }
        }

        // If the user with the specified ID is found
        if (selectedUser != null) {
            // Retrieve eventsList of the selected user (assuming eventsList is accessible)
            List<Event> eventsList = ((Client) selectedUser).getEventsList();

            // Search for the event by ID in the user's eventsList
            for (Event event : eventsList) {
                if (event.getEventId() == eventId) {
                    return event; // Return the event if found
                }
            }
        }
        return null; // Return null if user or event is not found
    }
	
	// Method to confirm and officially reserve the event
	 public void ConfirmEvent(ArrayList<Event> events, int eventId) {
	        // Implement event confirmation logic
		 boolean eventConfirmed = false;

		 for(Event event: events) { //Iterate through the list of events to find the specified event by its ID
			 if(event.getEventId() == eventId){
				 //Updating the event status to Confirmed, if found
				 event.setStatus("Confirmed");
				 eventConfirmed = true;
				 System.out.println("Event " + eventId + " has been confirmed and officially reserved. ");
				 break;
				 }
			}
	        if(!eventConfirmed) {
	            System.out.println("Event with ID " + eventId + "not found or cannot be confirmed. ");
	        }
	}
    
    public void SearchEvent() {
        
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
