import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

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
                	
                    break;
                case 2:
                    // Implement Log-In Logic
                    // Prompt user for credentials and verify them
                    // Set isLoggedIn to true upon successful login
                    // ...
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            if (isLoggedIn) {
                // Menu for logged-in users
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
                            // Logic to view available events
                            // ...
                            break;
                        case 2:
                            // Logic to create a new event
                            // ...
                            break;
                        case 3:
                            // Logic to reserve an event
                            // ...
                            break;
                        case 4:
                            // Logic to cancel a reservation
                            // ...
                            break;
                        case 5:
                            isLoggedIn = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                            break;
                    }

                    if (!isLoggedIn) {
                        break; // Break from the inner menu loop if logged out
                    }
                }
            }
            
        }
        
    }
}

