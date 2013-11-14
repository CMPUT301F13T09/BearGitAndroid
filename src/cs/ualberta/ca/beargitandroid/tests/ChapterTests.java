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
	private String chapter = "some chapter";
	private String context = "some context";
	private String option = "some option";
    public void test_Chapter() throws Throwable {
       assertEquals(chapter,Chapter.getChapter());
    }
}
