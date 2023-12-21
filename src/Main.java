import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	// instantiating the objects needed
    	Scanner scanner = new Scanner(System.in);
    	UserManager userManager = new UserManager();
        User loggedInUser = null;
        
        while (true) {
            System.out.println("\nWelcome to the Event Management and Reservation System!");
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) { // menu managing the sign-up and log-in page
                case 1:
                	userManager.SignUp(scanner);
                    break;
                case 2:
                	loggedInUser = userManager.LogIn(scanner);
                	Main.EnterClientMenu(loggedInUser, scanner);
                	break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
    
    // METHODS
    // Method to enter a menu specific for the client
    public static void EnterClientMenu (User loggedInUser, Scanner scanner) {
    	if (loggedInUser != null) { // if there is a loggedInUser returned, activates the menu
            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername() + "!");
            while (true) {
                System.out.println("\nEvent Management Menu:");
                System.out.println("1. Create Event");
                System.out.println("2. View Events");
                System.out.println("3. Reserve Event");
                System.out.println("4. Update Event");
                System.out.println("5. Update User Details");
                System.out.println("6. Cancel Reservation");
                System.out.println("7. Log Out");
                System.out.print("Enter your choice: ");
                
                int userChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (userChoice) {
                	case 1:
                		((Client) loggedInUser).CreateEvent();
                		break;
                	case 2:
                		((Client) loggedInUser).DisplayScheduledEvents();
                		break;
                	case 3:
                		((Client) loggedInUser).DisplayEventList();
                		((Client) loggedInUser).ReserveEvent();
                		break;
                	case 4: 
                		((Client) loggedInUser).DisplayEventList();
                		((Client) loggedInUser).UpdateEvent();
                		break;
                	case 5: 
                		((Client) loggedInUser).UpdateUserDetails();
                		break;
                	case 6: 
                		((Client) loggedInUser).DisplayEventList();
                		((Client) loggedInUser).CancelEvent();
                		break;
                    case 7:
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
}

