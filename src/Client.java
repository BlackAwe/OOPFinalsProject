import java.util.List;
import java.util.ArrayList;

public class Client extends User {
	// class fields
	private static int lastClientId = 100;
	private int id;
	private String name;
	private String email;
	private String address;
	private String contactInfo;
	private List<Event> eventList = new ArrayList<Event>();
	private List<Transaction> transactionHistory = new ArrayList<Transaction>();

	// constructor
	public Client(String userName, String password, String name, String address, String email, String contactInfo) {
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
	
	public List<Event> getEventsList() {
		return this.eventList;
	}
	
	public List<Transaction> getTransactionHistory() {
		return this.transactionHistory;
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
	// Method to create an event attached to the cleint
	public void CreateEvent() { 		
		System.out.println("\nCreate an Event.");
		System.out.print("Enter Event Name: ");
		String eventName = scanner.nextLine();
		System.out.print("Enter Type of Event: ");
		String eventType = scanner.nextLine();
		System.out.print("Enter Date and Time: ");
		String dateAndTime = scanner.nextLine();
		System.out.print("Enter Venue: ");
		String venue = scanner.nextLine();
		System.out.print("Enter Number of Participants: ");
		int numOfParticipants = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Description: ");
		String description = scanner.nextLine();
		
		// instantiates the event then adds it to the list of object
		Event event = new Event(eventName, eventType, dateAndTime, venue, numOfParticipants, description);
		this.eventList.add(event);
		System.out.println("A new event has been scheduled");

		transactionHistory.add(new Transaction("Event Created", "Event: " + eventName)); // updates the transaction history
	}
	
	// Method to display the list with event id and event name present
	public void DisplayEventList() {
		System.out.println("\nThese are the events that you have scheduled:");
		if (this.eventList == null) {
			System.out.println("\nThere is no scheduled events yet.");
		} else if (this.eventList != null) {
			for (Event userEvent : this.eventList) {
				System.out.println("Event ID: " + userEvent.getEventId() + 
						" || Event Name: " + userEvent.getEventName());
			}
		}
	}
	
	// Method to display all the scheduled events of the client
	public void DisplayScheduledEvents() {
		if (this.eventList == null) {
			System.out.println("There is no events scheduled.");
			return;
		}
		
		for (Event userEvent : this.eventList) {
			userEvent.DisplayEventInfo();
			System.out.println();
		}
	}

	@Override
	// Method to display the user's personal information
	public void DisplayUserDetails() {
		System.out.println("Name: " + this.getName());
		System.out.println("Address: " + this.getAddress());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Contact Information: " + this.getContactInfo());
	}

	@Override
	// Method to update the user details, picking through a menu
	public void UpdateUserDetails() {
		System.out.println("\nWhat would you like to update?");
		System.out.println("1. Client Name");
		System.out.println("2. Address");
		System.out.println("3. Email");
		System.out.println("4. Contact Information");
		System.out.println("5. Back");
		System.out.print("Enter your choice (1-4): ");

		int choice = scanner.nextInt();
		scanner.nextLine(); 

		switch (choice) {
		case 1:
			System.out.print("\nEnter new client name: ");
			String newEventName = scanner.nextLine();
			this.setName(newEventName);
			break;
		case 2:
			System.out.print("\nEnter new client address: ");
			String newAddress = scanner.nextLine();
			this.setAddress(newAddress);
			break;
		case 3:
			System.out.print("\nEnter new client email: ");
			String newEmail = scanner.nextLine();
			this.setEmail(newEmail);
			break;
		case 4:
			System.out.print("\nEnter new client contact information: ");
			String newContactInformation = scanner.nextLine();
			this.setContactInfo(newContactInformation);
			break;
		case 5:
			return;
		default:
			System.out.println("\nInvalid choice");
		}
		System.out.println("Client details updated successfully!");
	}
	
	// Method to update the event details based on the client's liking
	public void UpdateEvent() {
		if (this.eventList != null) {
			System.out.print("\nPlease enter the ID of the event you want to update: ");
			int selectedEventId = scanner.nextInt();
			for (Event userEvent : this.eventList) {
				if (userEvent.getEventId() == selectedEventId) {
					System.out.println("What would you like to update?");
					System.out.println("1. Event Name");
					System.out.println("2. Event Type");
					System.out.println("3. Date and Time");
					System.out.println("4. Venue");
					System.out.println("5. Number of Participants");
					System.out.println("6. Description");
					System.out.println("7. Back");
					System.out.print("Enter your choice (1-7): ");

					int choice = scanner.nextInt();
					scanner.nextLine(); 

					switch (choice) { // menu that provides an option and sets value depending on the choice
						case 1:
							System.out.print("\nEnter new event name: ");
							String newEventName = scanner.nextLine();
							userEvent.setName(newEventName);
							break;
						
						case 2:
							System.out.print("\nEnter new event type: ");
							String newEventType = scanner.nextLine();
							userEvent.setType(newEventType);
							break;
						
						case 3:
							System.out.print("\nEnter new date and time: ");
							String newDateAndTime = scanner.nextLine();
							userEvent.setDate(newDateAndTime);
							break;
						
						case 4:
							System.out.print("\nEnter new venue: ");
							String newVenue = scanner.nextLine();
							userEvent.setVenue(newVenue);
							break;
						
						case 5:
							System.out.print("\nEnter new number of participants: ");
							int newNoOfParticipants = scanner.nextInt();
							userEvent.setParticipants(newNoOfParticipants);
							break;
						
						case 6:
							System.out.print("\nEnter new description: ");
							String newDescription = scanner.nextLine();
							userEvent.setDescription(newDescription);
							break;
						
						case 7:
							return;
						
						default:
							System.out.println("\nInvalid choice");
							break;
					}
					transactionHistory.add(new Transaction("Event Updated", "Event: " + userEvent.getEventName()));
					System.out.println("Event details updated successfully!");
				} 
				
			}
		} else if (this.eventList == null) {
			System.out.println("There are no scheduled events");
		}
	}
	
	// Method to change status of an event from scheduled to reserved; confirms the event
	public void ReserveEvent() {
		if (this.eventList != null) {
			System.out.print("Please enter the ID of the event you want to reserve: ");
			int selectedEventId = scanner.nextInt();
			for (Event userEvent : this.eventList) {				
				if (userEvent.getEventId() == selectedEventId) { // if event id found, calculates fees and asks for payment
					System.out.println("\nThe Event Management fee costs: " + userEvent.CalculateEventFees());
					System.out.print("Please enter the correct amount: ");
					int userPayment = scanner.nextInt();
					
					if (userPayment >= userEvent.CalculateEventFees()) {
						System.out.println("The event is now awaiting for confirmation. Thank you");
						userEvent.setStatus("Awaiting confirmation.");
						transactionHistory.add(new Transaction("Event Awaiting Reservation", 
								"Event: " + userEvent.getEventName()));
						break;
					} else {
						System.out.println("Insufficient amount of payment.");
					}
				} 
			}
		}
	}
	
	// Method to cancel and remove events from the scheduled list of objects
	public void CancelEvent() {
		if (this.eventList != null) {
			System.out.println("\nNOTE: Confirmed Events are not available for cancellation");
			System.out.print("Please enter the ID of the event you want to cancel: ");
			int selectedEventId = scanner.nextInt();
			for (Event userEvent : this.eventList) {
				if (userEvent.getEventId() == selectedEventId) {
					this.eventList.remove(userEvent);
					System.out.println("The scheduled event is deleted successfully");
					transactionHistory.add(new Transaction("Reservation Canceled", 
							"Event: " + userEvent.getEventName()));
					break;
				} else {
					System.out.println("\nInvalid ID entered. Event does not exist.\n");
				}
			}
		} 
	}
	
	// Views the history log of user (transaction history)
	public void ViewHistory() {
		System.out.println("=== History ===");
		System.out.println("Client: " + this.getUsername());
		for (Transaction transaction : this.getTransactionHistory()) {
			System.out.println("Type: " + transaction.getType() + 
					", " + transaction.getDescription());
		}
		System.out.println();
	}	
}
