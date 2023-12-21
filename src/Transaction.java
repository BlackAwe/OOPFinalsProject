
public class Transaction {
	// class fields
	private String type;
	private String description;
	
	// constructor
	public Transaction(String type, String description) {
		this.type = type;
		this.description = description;
	}

	// getters and setters
	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
}
