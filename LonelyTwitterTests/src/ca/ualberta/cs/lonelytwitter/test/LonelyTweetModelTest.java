package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;


import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSampleCode() {
		assertTrue("This is not true", isGreaterEqual(7,6));
	}

	private boolean isGreaterEqual(int i, int j) {
		if ( i >=j) {
			return true;
		}
		return false;
	}
	
	public void testEquals() {
		Date date = new Date();
		NormalTweetModel tweet1 = new NormalTweetModel("Hi", date);
		NormalTweetModel tweet2 = new NormalTweetModel("He", date);
		assertFalse("These should not be equal", tweet1.equals(tweet2));
		
		ImportantTweetModel tweet3 = new ImportantTweetModel("Hi", date);
		ImportantTweetModel tweet4 = new ImportantTweetModel("He", date);
		assertFalse("These should not be equal", tweet3.equals(tweet4));
		
		assertFalse("Normal and important are different", tweet3.equals(tweet1));
	}
	
	public void testAddTweet() {
		// SHould test if there is an error
	}
	
	public void testGetTweets() {
		
	}
	
}
