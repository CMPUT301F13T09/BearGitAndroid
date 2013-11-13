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
	
    /**
     * Test_ chapter.
     *
     * @throws Throwable the throwable
     */
    public void test_Chapter() throws Throwable {
       assertEquals(chapter,Chapter.getChapter());
    }
}
