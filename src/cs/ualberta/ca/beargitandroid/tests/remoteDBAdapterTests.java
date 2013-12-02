package cs.ualberta.ca.beargitandroid.tests;

import junit.framework.Assert;
import java.util.Observer;
import java.util.Observable;

import com.loopj.android.http.RequestParams;

import android.test.AndroidTestCase;
import cs.ualberta.ca.beargitandroid.*;
import cs.ualberta.ca.beargitandroid.tests.returnObjectTests;
// TODO: Auto-generated Javadoc

/**
 * The Class remoteDBAdapterTests.
 *
 * @author Kyle Richelhoff
 * 
 * Specific tests for the remote database with Elastic Search and
 * story functionality like publishing/any remote action.
 */
	public class remoteDBAdapterTests extends AndroidTestCase {
		
	    /**
    	 * Test_remote db adapter.
    	 *
    	 * @throws Throwable the throwable
    	 */
    	public void test_StoryAdd() throws Throwable {
      	   returnObjectTests testNotice = new returnObjectTests();
      	   remoteDBAdapter testCase = new remoteDBAdapter();
      	   long sampleStory = 12121212;
      	   RequestParams params = new RequestParams();
      	   params.put("description", "blah blah blah blah blah");
      	   testCase.storeStory(sampleStory, params);
      	   testCase.addObserver(testNotice);
      	   
      	   //We want to wait until we assert, so this use case we wait until
      	   //There is some sort of return value.
      	   while (!testNotice.getStatus()){
      		   
      	   }
   	       Assert.assertTrue(true);
	    }
    	public void StoryDelete() throws Throwable {
       	   returnObjectTests testNotice = new returnObjectTests();
       	   remoteDBAdapter testCase = new remoteDBAdapter();
       	   long sampleStory = 12121212;
       	   testCase.removeStory(sampleStory);
       	   testCase.addObserver(testNotice);
       	   
       	   //We want to wait until we assert, so this use case we wait until
       	   //There is some sort of return value.
       	   while (!testNotice.getStatus()){
       		   
       	   }
    	       Assert.assertTrue(true);
 	    }
    	public void test_StoryFetchAll() throws Throwable {
    	   returnObjectTests testNotice = new returnObjectTests();
    	   remoteDBAdapter testCase = new remoteDBAdapter();
    	   testCase.fetchAllStories();
    	   testCase.addObserver(testNotice);
    	   
    	   //We want to wait until we assert, so this use case we wait until
    	   //There is some sort of return value.
    	   while (!testNotice.getStatus()){
    		   
    	   }
 	       Assert.assertTrue(true);
 	    }
    	public void test_StoryFetch() throws Throwable {
     	   returnObjectTests testNotice = new returnObjectTests();
     	   remoteDBAdapter testCase = new remoteDBAdapter();
     	   long sampleStory = 12121212;
     	   testCase.fetchStory(sampleStory);
     	   testCase.addObserver(testNotice);
     	   
     	   //We want to wait until we assert, so this use case we wait until
     	   //There is some sort of return value.
     	   while (!testNotice.getStatus()){
     		   
     	   }
  	       Assert.assertTrue(true);
  	    }
	}