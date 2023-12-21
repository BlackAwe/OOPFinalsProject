import java.util.List;
import java.util.ArrayList;

public class Admin extends User {
	// class fields
	private static final String DEFAULT_PASSWORD = "admin123";
	
	// constructor
	public Admin(String userName) {
		super(userName, DEFAULT_PASSWORD);
	}
	
	// METHODS
	public Event GetUserEventById(List<User> userList) {
        // Search for the user by ID in the userList
        User selectedUser = null;
        
        System.out.print("Enter the User ID: ");
        int selectedUserId = scanner.nextInt();
        for (User user : userList) {
            if (((Client) user).getId() == selectedUserId) {
                selectedUser = user;
                break;
            }
        }

        // If the user with the specified ID is found
        if (selectedUser != null) {
        	 System.out.print("Enter the event id ID: ");
             int selectedEventId = scanner.nextInt();
            // Retrieve eventsList of the selected user (assuming eventsList is accessible)
            List<Event> eventsList = ((Client) selectedUser).getEventsList();
            // Search for the event by ID in the user's eventsList
            for (Event event : eventsList) {
                if (event.getEventId() == selectedEventId) {
                    return event; // Return the event if found
                }
            }
        }
        return null; // Return null if user or event is not found
    }
	
	// Method to confirm and officially reserve the event
	 public void ConfirmEvent(List<User> userList) {
		 Event selectedUserEvent = this.GetUserEventById(userList);
		 selectedUserEvent.setStatus("Confirmed");
		 System.out.println("Event " + selectedUserEvent.getEventName() + " with the id" +
				 selectedUserEvent.getEventId() + " has been confirmed and officially reserved. ");
	}
    
	public void SearchAndDisplayEvent(List<User> userList) {
		 // Search for the user by ID in the userList
        User selectedUser = null;
        
        System.out.print("Enter the User ID: ");
        int selectedUserId = scanner.nextInt();
        for (User user : userList) {
            if (((Client) user).getId() == selectedUserId) {
                selectedUser = user;
                break;
            }
        }

        // If the user with the specified ID is found
        if (selectedUser != null) {
        	 System.out.print("Enter the event id ID: ");
             int selectedEventId = scanner.nextInt();
            // Retrieve eventsList of the selected user (assuming eventsList is accessible)
            List<Event> eventsList = ((Client) selectedUser).getEventsList();
            // Search for the event by ID in the user's eventsList
            for (Event event : eventsList) {
                if (event.getEventId() == selectedEventId) {
                    event.DisplayEventInfo();
                }
            }
        }
	}
	
    public void DisplayAllEventInfo(List<User> userList) {
    	System.out.println("List of Client Events: ");
    	System.out.println("========================");
    	for (User user : userList) {
    		System.out.println("Here are the events of the user: " + ((Client) user).getName());
    		for (Event event : ((Client) user).getEventsList()) {
    			event.DisplayEventInfo();
    		}
        }
    }
    
    public void VoidEvent(List<User> userList) {
		 Event selectedUserEvent = this.GetUserEventById(userList);
		 selectedUserEvent.setStatus("Voided");
		 System.out.println("Event " + selectedUserEvent.getEventName() + " with the id" +
				 selectedUserEvent.getEventId() + " has been voided. Event is not available for reservation. ");
	}
}
