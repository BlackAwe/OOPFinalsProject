import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
	// class fields
	private List<User> userList = new ArrayList<User>();
	
	// METHODS
	// Method to handle signing up
	public void SignUp(Scanner scanner) {
		System.out.println("\nSigning Up.");
		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();
		
        System.out.print("Enter your name: ");
        String clientName = scanner.next();
        
        System.out.print("Enter address: ");
        String clientAddress = scanner.next();
        
        System.out.print("Enter email: ");
        String clientEmail = scanner.next();
        
        System.out.print("Enter contact info: ");
        String clientContactInfo = scanner.next();

		User newUser = new Client (username, password, clientName, clientAddress,
				clientEmail, clientContactInfo);
		this.userList.add(newUser);

		System.out.println("Sign-up successful! You can now log in.");
	}
	
	// Method to handle users logging in
	public void LogIn() {
		
	}
}
