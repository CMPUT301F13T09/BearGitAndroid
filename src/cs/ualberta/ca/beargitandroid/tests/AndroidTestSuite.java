/**
 * Author: Kyle Richelhoff
 * Description: Entry point for a suite of tests for Junit
 */
package cs.ualberta.ca.beargitandroid.tests;
import junit.framework.Test;
import junit.framework.TestSuite;
import android.test.suitebuilder.TestSuiteBuilder;

/**
 * Class: AndroidTestSuite
 * Description: Return a test suite for Junit to test all functions
 * 	This is the entry point for Junit to begin the tests.
 */
public class AndroidTestSuite extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(AndroidTestSuite.class).includeAllPackagesUnderHere().build();
    }
}
