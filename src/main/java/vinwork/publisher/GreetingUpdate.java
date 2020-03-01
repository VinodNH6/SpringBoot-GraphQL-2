package vinwork.publisher;

public class GreetingUpdate {

    private String message;
    private String authorName;
    private String createdOn;
    
    
	public GreetingUpdate(String message, String authorName, String createdOn) {
		super();
		this.message = message;
		this.authorName = authorName;
		this.createdOn = createdOn;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
    
    
}