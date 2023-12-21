import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
	// class fields
	private List<User> userList = new ArrayList<User>();
	static Admin admin = new Admin("admin");
	
	// getters and setters
	public List<User> getUserList(){
		return this.userList;
	}
	
	// METHODS
	// Method to handle signing up
	public void SignUp(Scanner scanner) {
		System.out.println("\nSigning Up.");
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

		User newUser = new Client (username, password, clientName, clientAddress,
				clientEmail, clientContactInfo); // instantiates the client object
		this.userList.add(newUser); // added to the user list

		System.out.println("Sign-up successful! You can now log in.");
	}
	
	// Method to handle users logging in
	public User LogInClient(Scanner scanner) {
        System.out.print("\nEnter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User foundUser = null;

        // Search for the user in the list based on the entered username
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                foundUser = user; // assigns the foundUser with the retrieved user
                break;
            }
        }

        if (foundUser != null && foundUser.getPassword().equals(password)) { // condition handling presence of user and password
            return foundUser;
        } else {
            return null;
        }
    }
	
	public User LogInAdmin(Scanner scanner) {
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (admin.getPassword().equals(password)) {
        	return admin;
        } else {
        	return null;
        }
	}
	
	public void DisplayUserList() {
		for (User user : this.userList) {
			System.out.println("User ID: " + ((Client) user).getId() + 
					" || Username: " + ((Client) user).getUsername());
		}
	}
}
