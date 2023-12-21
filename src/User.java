import java.util.Scanner;

public abstract class User {
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
	// Method to update user details
	public void UpdateUserDetails() {
	}
	
	// Method to display details or information of user
	public void DisplayUserDetails() {
	}
	
	
}
