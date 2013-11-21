package cs.ualberta.ca.beargitandroid.tests;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import cs.ualberta.ca.beargitandroid.*;
// TODO: Auto-generated Javadoc

/**
 * The Class ChapterTests.
 *
 * @author Kyle Richelhoff
 * 
 * Used to test chapter creation.
 */
public class ChapterTests extends AndroidTestCase {
	
	private Chapter chapter;
	private ArrayList< HashMap<String,String>> optionList;
	private long id = "23";
	private String goToStoryTitle;
	private String goToStoryDescription;
	private String goToStoryAuther;
	private String goToStoryData;
	private String goToStoryImagePath;
	private String goToStoryimageByte;
	private Story goToStory;
	
	
	protected void setUp() {
		goToStory = new Story(goToStoryTitle,goToStoryDescription,goToStoryAuther,goToStoryData,goToStoryImagePath,goToStoryimageByte);
		chapter = new Chapter(goToStory,id);
	}

	
	
    public void testmodifyContext(){
    		assertEquals (context, chapter.modifyComment())
    }
    public void testmodifyOption(){
    		assertEquals (option, chapter.modifyOption())	
    }
}
