package ca.ualberta.cs.lonelytwitter;

public class Author extends User {

	public Author() {
		super();
		name = "anonymous_author";
	}
	
	public void setName(String x) {
		this.name = x;
	}

}
