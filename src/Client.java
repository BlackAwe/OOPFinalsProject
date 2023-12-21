import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Client extends User {
	// class fields
	private static int lastClientId = 0;
	private int id;
	private String name;
	private String email;
	private String address;
	private String contactInfo;
	private List<Event> eventList = new ArrayList<Event>();

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

		Event event = new Event(eventName, eventType, dateAndTime, venue, numOfParticipants, description);
		this.eventList.add(event);
		System.out.println("A new event has been scheduled");
	}

	public void SearchEvent(int selectedEventId) {

	}

	public void DisplayEventList() {
		System.out.println("These are the events that you have scheduled:");
		if (this.eventList == null) {
			System.out.println("There is no scheduled events yet.");
		} else if (this.eventList!= null){
			for (Event userEvent : this.eventList) {
				System.out.println("Event ID: " + userEvent.getEventId() + 
						" || Event Name: " + userEvent.getEventName());
			}
		}
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
		System.out.println("\nWhat would you like to update?");
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
		System.out.println("\nClient details updated successfully!");
	}

	public void UpdateEvent() {
		if (this.eventList != null) {
			for (Event userEvent : this.eventList) {
				System.out.println("Please enter the ID of the event you want to update: ");
				int selectedEventId = scanner.nextInt();
				
				if (userEvent.getEventId() == selectedEventId) {
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
						userEvent.setName(newEventName);
						break;
					case 2:
						System.out.print("Enter new event type: ");
						String newEventType = scanner.nextLine();
						userEvent.setType(newEventType);
						break;
					case 3:
						System.out.print("Enter new date and time: ");
						String newDateAndTime = scanner.nextLine();
						userEvent.setDate(newDateAndTime);
						break;
					case 4:
						System.out.print("Enter new venue: ");
						String newVenue = scanner.nextLine();
						userEvent.setVenue(newVenue);
						break;
					case 5:
						System.out.print("Enter new number of participants: ");
						int newNoOfParticipants = scanner.nextInt();
						userEvent.setParticipants(newNoOfParticipants);
						break;
					case 6:
						System.out.print("Enter new description: ");
						String newDescription = scanner.nextLine();
						userEvent.setDescription(newDescription);
						break;
					default:
						System.out.println("Invalid choice");
					}
					System.out.println("Event details updated successfully!\n");
				} else {
					System.out.println("ID not found. Event does not exist.\n");
				}
				break;
			}
		} 
	}

	public void ReserveEvent() {
		if (this.eventList != null) {
			for (Event userEvent : this.eventList) {
				System.out.println("Please enter the ID of the event you want to reserve: ");
				int selectedEventId = scanner.nextInt();
				if (userEvent.getEventId() == selectedEventId) {
					System.out.println("The Event Management fee costs: " + userEvent.CalculateEventFees());
					System.out.print("Please enter the correct amount: ");
					int userPayment = scanner.nextInt();
					if (userPayment == userEvent.CalculateEventFees()) {
						System.out.println("The event is now awaiting for confirmation. Thank you");
						userEvent.setStatus("Awaiting confirmation.");
					} else {
						System.out.println("Insufficient amount of payment.");
					}
				} else {
					System.out.println("Invalid ID. Event does not exist.\n");
				}
			}
		}		
	}

	public void CancelEvent() {
		if (this.eventList != null) {
			for (Event userEvent : this.eventList) {
				System.out.println("NOTE: Confirmed Events are not available for cancellation");
				System.out.println("Please enter the ID of the event you want to cancel: ");
				int selectedEventId = scanner.nextInt();
				if (userEvent.getEventId() == selectedEventId) {
					this.eventList.remove(userEvent);
					System.out.println("The scheduled event is deleted successfully");
					break;
				} else {
					System.out.println("Invalid ID entered. Event does not exist.\n");
				}
			}
		} else {
			System.out.println("There are no events scheduled. Please create one first.\n");
		}
			
	}
}
