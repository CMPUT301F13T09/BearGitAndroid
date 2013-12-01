//package cs.ualberta.ca.beargitandroid.tests;
//
//import junit.framework.Assert;
//import android.R;
//import android.test.AndroidTestCase;
//import cs.ualberta.ca.beargitandroid.Story;
//import cs.ualberta.ca.beargitandroid.View.ViewStory;
//import cs.ualberta.ca.beargitandroid.View.homeScreenLocal;
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.test.ActivityInstrumentationTestCase2;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.TextView;
//
//// TODO: Auto-generated Javadoc
//
///**
// * The Class HomeScreenTests.
// *
// * @author Kyle Richelhoff
// * 
// * Testing basic functionality of the home screen and flipping between
// * multiple tasks like my story, remote, or local stories as well as search
// * functions.
// */
//public class HomeScreenTests extends AndroidTestCase {
//	private TextView storyTitle;
//	private TextView storyAuthor;
//	private TextView storyDecription;
//	private Story story;
//	private Context cxt;
//	private long id;
//	private Intent intent;
//	
//	public HomeScreenTests(){
//		super();
//	}
//	
//	protected void setUp() throws Exception{
//		super.setUp();
//		this.story = new Story (this.cxt,this.id);
//		this.story.createNewStory("title","description","author");
//		Intent intent = new Intent();
//		intent.putExtra("storyID", story.getStoryID());
//		
//		
//		
//	}
//	
//	public void test(){
//		
//		storyTitle =  (TextView)findViewById(R.id.title3)
//		storyAuthor = (TextView) Activity.findViewById(R.id.descriptionContent);
//		storyDecription = (TextView)Activity.findViewById(R.id.title2);
//		
//		 
//          assertTrue(storyTitle != null);
//          assertTrue(storyAuthor != null);
//          assertTrue(storyDecription != null);
//
//		
//	}
//    /**
//     * Test_ home screen.
//     *
//     * @throws Throwable the throwable
//     */
//    
//}