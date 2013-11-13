package cs.ualberta.ca.beargitandroid.tests;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import cs.ualberta.ca.beargitandroid.*;

/**
 * The Class DBAdapterTests.
 *
 * @author Kyle Richelhoff
 * 
 * Used to test database calls to the local sqlite3 database when cached
 * and used for remote databases as well.
 */
public class DBAdapterTests extends AndroidTestCase {
	
    public void test_DBAdapter() throws Throwable {
       assertEquals(DBAdapter, page.getDBAdapter());
    }
}
