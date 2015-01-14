package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Retweets extends LonelyTweetModel {

	private User user;
	public static int num_retweets = 0;
	
	public Retweets(String text, User user) {
		super(text);
		this.user = user;
		this.num_retweets++;
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
