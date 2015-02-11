

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.R.anim;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;


public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSendText() {
		String text = "Hello world!";
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startWithText(text, code);
		assertEquals("Is the text correct?", text, activity.getText());
	}
	
	public void testDoubleText() {
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("Double transform working?", text+text, activity.getText());
	}
	
	public void testDisplayText() {
		String text = "Hello world";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("correct text?", text, activity.getText());
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Text displaying correctly?", text, view.getText().toString());
	}
	
	public void testReverseText() {
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("Reverse transform working?", "olleH", activity.getText());
	}
	
	public void testDefaultText() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Default working?", "default", view.getText().toString());
	}
	
	public void testViewVisible() {
		IntentReaderActivity activity = startWithText("Hello", IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		View windowView = activity.getWindow().getDecorView();
		android.test.ViewAsserts.assertOnScreen(windowView, view);
	}
	
	private IntentReaderActivity startWithText(String text, int code) {
		Intent intent =  new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
	
}
