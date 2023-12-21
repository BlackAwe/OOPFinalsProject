import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
	// class fields
	private List<User> userList = new ArrayList<User>(); // list to store users
	static Admin admin = new Admin("admin"); // create an admin object
	
	// getters and setters
	public List<User> getUserList(){
		return this.userList;
	}
	
	// METHODS
	// Method to handle signing up
	public void SignUpCustomer(Scanner scanner) {
		System.out.println("\n--- Customer Sign-up ---");
		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		System.out.print("Enter your name: ");
		String clientName = scanner.nextLine();

		System.out.print("Enter address: ");
		String clientAddress = scanner.nextLine();

		System.out.print("Enter email: ");
		String clientEmail = scanner.nextLine();

		System.out.print("Enter contact info: ");
		String clientContactInfo = scanner.nextLine();

		// instantiates the client object
		User newUser = new Client (username, password, clientName, clientAddress,
				clientEmail, clientContactInfo); 
		
		this.userList.add(newUser); // then add to the user list
		System.out.println("\nSign-up successful! You can now log in.");
	}
	
	// Method to handle users(client) logging in
	public User LogInClient(Scanner scanner) {
		System.out.println("\n--- Client Log-in ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User foundUser = null;

        // Search for the user in the list based on the entered username
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                foundUser = user; // assigns the foundUser with the retrieved user
                break;
            }
        }

        // condition handling presence of user and password
        if (foundUser != null && foundUser.getPassword().equals(password)) { 
            return foundUser;
        } else {
            return null;
        }
    }
	
	// Method to handle admin logging in
	public User LogInAdmin(Scanner scanner) {
		System.out.println("\n--- Admin Log-in ---");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

      	//Compares the entered password with the admin's password
        if (admin.getPassword().equals(password)) { ////checks if passwords match
        	return admin;
        } else {
        	return null; //Returns null if the entered password is incorrect
        }
	}
	
	// Method to display user information for each client in the user list
	public void DisplayUserList() {
		System.out.println();
		for (User user : this.userList) { //Iterates through the list of users
			System.out.println("User ID: " + ((Client) user).getId() + 
					" || Username: " + ((Client) user).getUsername());
		}
	}
}
