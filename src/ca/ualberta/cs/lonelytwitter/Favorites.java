package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Favorites extends LonelyTweetModel {

	private User user;
	public static int num_favorites = 0;
	
	
	public Favorites(String text, User user) {
		super(text);
		this.user = user;
		this.num_favorites++;
	}

	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser() {
		return user;
	}

}
