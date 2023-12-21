import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	UserManager userManager = new UserManager();
        User loggedInUser = null;
        
        while (true) {
            System.out.println("Welcome to the Event Management and Reservation System!");
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
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
    
    public static void EnterClientMenu (User loggedInUser, Scanner scanner) {
    	if (loggedInUser != null) {
            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername() + "!");
            while (true) {
                System.out.println("\nEvent Management Menu:");
                System.out.println("1. Create Event");
                System.out.println("2. View Events");
                System.out.println("3. Reserve Event");
                System.out.println("4. Cancel Reservation");
                System.out.println("5. Log Out");
                System.out.print("Enter your choice: ");
                
                int userChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (userChoice) {
                	case 1:
                		break;
                	case 2:
                		break;
                	case 3:
                		break;
                	case 4: 
                		break;
                    case 5:
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

