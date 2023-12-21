import java.util.Scanner;

public class User {
	// class fields
	private String userName;
	private String password;
	
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

	public boolean LogIn(String userName, String password) {
		if(userName.equals(this.userName) && password.equals(this.password)) {
			System.out.println("Login successful.");
			return true; //Returns true if the user successfully logged in
		} else {
			System.out.println("Please try again. Invalid username or password");
			return false; //Returns false if the user fails to login
		}
	}
	
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
