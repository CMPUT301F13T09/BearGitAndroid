package cs.ualberta.ca.beargitandroid;
import com.loopj.android.http.*;

import java.util.Observable;
import java.util.Observer;

// TODO: Auto-generated Javadoc
/**
 * The Class remoteDBAdapter.
 */
public class remoteDBAdapter extends Observable{
	
		/** The Constant BSAR_URL. */
		private final static String BSAR_URL = "http://cmput301.softwareprocess.es:8080/cmput301f13t09/";
		
		/** The Constant DATA_PATH. */
		private final static String DATA_PATH = "data";
		

			/**
			 * fetch story from internet
			 * @param id
			 */
			public void fetchStory(long id){
				AsyncHttpClient client = new AsyncHttpClient();
				client.get(BSAR_URL + "stories/" + String.valueOf(id), new AsyncHttpResponseHandler() {
				    @Override
				    public void onSuccess(String response) {
				    	notifyObservers(response);
				    }
				});
			}

			/**
			 * remote story in the internet
			 * not use......
			 * only for development
			 *
			 * @param id the id
			 */
			public void removeStory(long id){
				AsyncHttpClient client = new AsyncHttpClient();
				client.delete(BSAR_URL + "stories/" + String.valueOf(id), new AsyncHttpResponseHandler() {
				    @Override
				    public void onSuccess(String response) {
				    	notifyObservers(response);
				    }
				});
			}
			
			/**
			 * Fetch all stories.
			 *
			 * @param id the id
			 */
			public void fetchAllStories(long id){
				AsyncHttpClient client = new AsyncHttpClient();
				client.get(BSAR_URL + "stories/_search", new AsyncHttpResponseHandler() {
				    @Override
				    public void onSuccess(String response) {
				    	notifyObservers(response);
				    }
				});
			}
			
			/**
			 * Store story.
			 *
			 * @param id the id
			 */
			public void storeStory(long id){
				AsyncHttpClient client = new AsyncHttpClient();
				client.put(BSAR_URL + "stories/" + String.valueOf(id), new AsyncHttpResponseHandler() {
				    @Override
				    public void onSuccess(String response) {
				    	notifyObservers(response);
				    }
				});
			}

				
}
