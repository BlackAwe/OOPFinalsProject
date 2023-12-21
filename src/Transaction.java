import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private String type;
	private String description;
	
	
	public Transaction(String type, String description) {
		this.type = type;
		this.description = description;
	}

	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
}
