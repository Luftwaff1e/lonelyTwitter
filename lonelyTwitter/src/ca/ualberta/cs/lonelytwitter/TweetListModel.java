package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {

	private int count;
	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetListModel() {
		count = 0;
		tweets = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		return count;
	}
	
	public ArrayList<LonelyTweetModel> getTweets() {
		return tweets;
	}

	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException{
		for (int i = 0; i < tweets.size(); i++) {
			if (tweets.get(i).equals(tweet)) {
				throw new IllegalArgumentException();
			}
		}
		tweets.add(tweet);
		count++;
		
	}

}
