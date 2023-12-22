import java.util.List;
import java.util.Scanner;

public class Main {
	//execution(entry point)
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in); //for user input
    	
    	// instantiating the objects needed    	
    	UserManager userManager = new UserManager();
        User loggedInUser = null;
        User loggedInAdmin = null;
        
        while (true) { 
            System.out.println("\nWelcome to the Event Management and Reservation System!");
            System.out.println("1. Customer Sign-up ");
            System.out.println("2. Customer Log-in");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            // menu managing the sign-up and log-in page
            switch (choice) { 
                case 1: 
                	userManager.SignUpCustomer(scanner);  //Initiates user sign-up process
                    break;
                case 2:               	
                	loggedInUser = userManager.LogInClient(scanner); //Logs in a client user
                	Main.EnterClientMenu(loggedInUser, scanner); //Enters the client user menu
                	break;
                case 3:                	
                	loggedInAdmin = userManager.LogInAdmin(scanner);  //Logs in an admin user
                	Main.EnterAdminMenu(loggedInAdmin, scanner, userManager, userManager.getUserList());
                	break;
                case 4:
                    System.out.println("\nExiting the system. Goodbye!");
                    System.exit(0); //Exits the system
                default:
                    System.out.println("\nInvalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
    
    // METHODS
    // Method to enter a menu specific for the client
    public static void EnterClientMenu (User loggedInUser, Scanner scanner) {
    	// if there is a loggedInUser returned, activates the menu
    	if (loggedInUser != null) { 
            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername() + "!");
            while (true) {
                System.out.println("\nEvent Management Menu:");
                System.out.println("1. Create Event");
                System.out.println("2. View Events");
                System.out.println("3. Reserve Event");
                System.out.println("4. Update Event");
                System.out.println("5. Update User Details");
                System.out.println("6. Cancel Reservation");
                System.out.println("7. View History Log");
                System.out.println("8. Log Out");
                System.out.print("Enter your choice: ");                
                int userChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                // handle different client actions
                switch (userChoice) {
                   	case 1:
                		((Client) loggedInUser).CreateEvent();  //Client creates an event
                		break;
                	case 2:
                		System.out.println();
                		((Client) loggedInUser).DisplayScheduledEvents();  //Client views scheduled events
                		break;
                	case 3:
                		((Client) loggedInUser).DisplayEventList(); //Display available events for reservation
                		((Client) loggedInUser).ReserveEvent(); //Client reserves an event
                		break;
                	case 4: 
                		System.out.println();
                		((Client) loggedInUser).DisplayEventList(); //Display events for updating
                		((Client) loggedInUser).UpdateEvent(); //Client updates an event
                		break;
                	case 5: 
                		((Client) loggedInUser).UpdateUserDetails(); //Clients update details
                		break;
                	case 6: 
                		((Client) loggedInUser).DisplayEventList(); //Display for events cancellation
                		((Client) loggedInUser).CancelEvent(); //Client cancels a reservation
                		break;
                	case 7:
                		((Client) loggedInUser).ViewHistory(); //Display user's history log
                		break;
                    case 8:
                        loggedInUser = null; // Log out by setting loggedInUser to null
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }

                if (loggedInUser == null) {
                    break; // Break from the inner menu loop if logged out
                }
            }
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
    
    // Method to enter a specific menu for the admin
    public static void EnterAdminMenu(User loggedInAdmin, Scanner scanner,
    			UserManager userManager, List<User> userList) {
    	if (loggedInAdmin != null) { //Checks if there is a logged-in admin
    		System.out.println("Login successful! Welcome, " + loggedInAdmin.getUsername() + "!");
            while (true) {
                System.out.println("\nManage Client Events:");
                System.out.println("1. Confirm Event");
                System.out.println("2. Search Event");
                System.out.println("3. Display All Events");
                System.out.println("4. Void Event");
                System.out.println("5. Log Out");
                System.out.print("Enter your choice: ");                
                int userChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (userChoice) {
                	case 1:
                		userManager.DisplayUserList();  //Display list of users
                		((Admin) loggedInAdmin).ConfirmEvent(userList); //Admin confirms an event
                		break;
                	case 2:
                		userManager.DisplayUserList(); 
                		((Admin) loggedInAdmin).SearchAndDisplayEvent(userList);; //Admin searches and display an event
                		break;
                	case 3:
                		((Admin) loggedInAdmin).DisplayAllEventInfo(userList);; //Admin display all event information
                		break;
                	case 4: 
                		userManager.DisplayUserList();
                		((Admin) loggedInAdmin).VoidEvent(userList);; //Admin voids an event 
                		break;
                    case 5:
                        loggedInAdmin = null; // Log out by setting loggedInUser to null
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }

                if (loggedInAdmin == null) {
                    break; // Break from the inner menu loop if logged out
                }
            }
    	} else {
            System.out.println("Login failed. Invalid password.");
        }
    }
}


