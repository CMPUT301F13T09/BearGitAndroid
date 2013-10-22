package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;

import android.app.Activity;


public class GameVIew extends Activity {
	Story story;
	ArrayList<Integer> gameInfo;
	
	public void showSotry(){
		
	};
	
	public void next(){
		
	};
	
	public void readProgress(){
		
	};
	
	public void saveProgress(){
	}

	/**
	 * @uml.property  name="homeScreen"
	 * @uml.associationEnd  inverse="gameVIew:cs.ualberta.ca.beargitandroid.HomeScreen"
	 */
	private HomeScreen homeScreen;

	/**
	 * Getter of the property <tt>homeScreen</tt>
	 * @return  Returns the homeScreen.
	 * @uml.property  name="homeScreen"
	 */
	public HomeScreen getHomeScreen() {
		return homeScreen;
	}

	/**
	 * Setter of the property <tt>homeScreen</tt>
	 * @param homeScreen  The homeScreen to set.
	 * @uml.property  name="homeScreen"
	 */
	public void setHomeScreen(HomeScreen homeScreen) {
		this.homeScreen = homeScreen;
	}

	/**
	 * @uml.property  name="viewStory"
	 * @uml.associationEnd  inverse="gameVIew:cs.ualberta.ca.beargitandroid.ViewStory"
	 */
	private ViewStory viewStory;

	/**
	 * Getter of the property <tt>viewStory</tt>
	 * @return  Returns the viewStory.
	 * @uml.property  name="viewStory"
	 */
	public ViewStory getViewStory() {
		return viewStory;
	}

	/**
	 * Setter of the property <tt>viewStory</tt>
	 * @param viewStory  The viewStory to set.
	 * @uml.property  name="viewStory"
	 */
	public void setViewStory(ViewStory viewStory) {
		this.viewStory = viewStory;
	}

	/**
	 * @uml.property  name="story1"
	 * @uml.associationEnd  aggregation="shared" inverse="gameVIew:cs.ualberta.ca.beargitandroid.Story"
	 */
	private Story story1;

	/**
	 * Getter of the property <tt>story1</tt>
	 * @return  Returns the story1.
	 * @uml.property  name="story1"
	 */
	public Story getStory1() {
		return story1;
	}

	/**
	 * Setter of the property <tt>story1</tt>
	 * @param story1  The story1 to set.
	 * @uml.property  name="story1"
	 */
	public void setStory1(Story story1) {
		this.story1 = story1;
	}

	/**
	 * @uml.property  name="dBAdapter"
	 * @uml.associationEnd  inverse="gameVIew:cs.ualberta.ca.beargitandroid.DBAdapter"
	 */
	private DBAdapter dbAdapter;

	/**
	 * Getter of the property <tt>dBAdapter</tt>
	 * @return  Returns the dbAdapter.
	 * @uml.property  name="dBAdapter"
	 */
	public DBAdapter getDBAdapter() {
		return dbAdapter;
	}

	/**
	 * Setter of the property <tt>dBAdapter</tt>
	 * @param dBAdapter  The dbAdapter to set.
	 * @uml.property  name="dBAdapter"
	 */
	public void setDBAdapter(DBAdapter dbAdapter) {
		this.dbAdapter = dbAdapter;
	};
};

