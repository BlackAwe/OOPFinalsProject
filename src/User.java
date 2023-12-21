import java.util.Scanner;

public class User {
	// class fields
	private String userName;
	private String password;
	protected static Scanner scanner = new Scanner(System.in);
	
	// constructor
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	// getters and setters
	public String getUsername() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// METHODS
	//Compares the entered userName and password with the stored values
	public void UpdateUserDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter new username: ");
		String newUsername = scanner.nextLine();
        this.setUsername(newUsername);
        System.out.print("Username updated successfully.");
	}
	
	// Method to display details or information of user
	public void DisplayUserDetails() {
	    System.out.println("\\nUser Details:");
	    System.out.println("Username: " + this.userName);
	}
	
	
}
