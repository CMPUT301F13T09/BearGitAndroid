//package cs.ualberta.ca.beargitandroid;
//import com.loopj.android.http.*;
//import org.json.*;
//import java.util.Observable;
//
//// TODO: Auto-generated Javadoc
//
///**
// * The Class remoteDBAdapter.
// * 
// * You should read about the request parameters: 
// * http://loopj.com/android-async-http/doc/com/loopj/android/http/RequestParams.html
// * 
// * And JSONArrays:
// * http://loopj.com/android-async-http/
// * 
// */
//public class remoteDBAdapter extends Observable {
//	
//		/** The Constant BSAR_URL. */
//		private final static String BSAR_URL = "http://cmput301.softwareprocess.es:8080/cmput301f13t09/";
//		
//		/** The Constant DATA_PATH. */
//		private final static String DATA_PATH = "data";
//		
//			/**
//			 * fetch story from internet
//			 * @param id
//			 */
//			public void fetchStory(long id){
//				AsyncHttpClient client = new AsyncHttpClient();
//				client.get(BSAR_URL + "stories/" + String.valueOf(id), new JsonHttpResponseHandler() {
//				    @Override
//				    public void onSuccess(JSONArray response) {
//				    	notifyObservers(response);
//				    }
//				});
//			}
//
//			/**
//			 * remote story in the internet
//			 * not use......
//			 * only for development
//			 *
//			 * @param id the id
//			 */
//			public void removeStory(long id){
//				AsyncHttpClient client = new AsyncHttpClient();
//				client.delete(BSAR_URL + "stories/" + String.valueOf(id), new JsonHttpResponseHandler() {
//				    @Override
//				    public void onSuccess(JSONArray response) {
//				    	notifyObservers(response);
//				    }
//				});
//			}
//			/**
//			 * fetch one entry from website.
//			 *
//			 */
//			public void fetchAllStories(){
//				AsyncHttpClient client = new AsyncHttpClient();
//				client.get(BSAR_URL + "stories/_search", new JsonHttpResponseHandler() {
//				    @Override
//				    public void onSuccess(JSONArray response) {
//				    	notifyObservers(response);
//				    }
//				});
//			}
//			
//			/**
//			 * fetch story from internet
//			 * @param id
//			 */
//			public void storeStory(long id,  RequestParams params){
//				AsyncHttpClient client = new AsyncHttpClient();
//				client.put(BSAR_URL + "stories/" + String.valueOf(id), params, new JsonHttpResponseHandler() {
//				    @Override
//				    public void onSuccess(JSONArray response) {
//				    	notifyObservers(response);
//				    }
//				});
//			}
//				
//}
