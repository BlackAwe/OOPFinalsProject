
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
	public String userName() {
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
	public void LogIn(String userName, String password) {
		
	}
	
	// Method to display details or information of user
	public void DisplayDetails() {
	    System.out.println("\\nUser Details:");
	    System.out.println("Username: " + this.userName);
	}
}
