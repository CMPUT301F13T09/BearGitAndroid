package cs.ualberta.ca.beargitandroid;

import android.app.Activity;


public class ViewStory extends Activity {	
	
	public void showView(){
		
	};
	
	public void startGame(Story story,long ID){
		
	};
	
	private void loadExistGame(){
		
	};
	
	private void loadSave(){
		
	}

	/**
	 * @uml.property  name="json"
	 * @uml.associationEnd  inverse="viewStory:cs.ualberta.ca.beargitandroid.Json"
	 */
	private Json json;

	/**
	 * Getter of the property <tt>json</tt>
	 * @return  Returns the json.
	 * @uml.property  name="json"
	 */
	public Json getJson() {
		return json;
	}

	/**
	 * Setter of the property <tt>json</tt>
	 * @param json  The json to set.
	 * @uml.property  name="json"
	 */
	public void setJson(Json json) {
		this.json = json;
	}

	/**
	 * @uml.property  name="homeScreen"
	 * @uml.associationEnd  inverse="viewStory:cs.ualberta.ca.beargitandroid.HomeScreen"
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
	 * @uml.property  name="homeScreen1"
	 * @uml.associationEnd  inverse="viewStory1:cs.ualberta.ca.beargitandroid.HomeScreen"
	 */
	private HomeScreen homeScreen1;

	/**
	 * Getter of the property <tt>homeScreen1</tt>
	 * @return  Returns the homeScreen1.
	 * @uml.property  name="homeScreen1"
	 */
	public HomeScreen getHomeScreen1() {
		return homeScreen1;
	}

	/**
	 * Setter of the property <tt>homeScreen1</tt>
	 * @param homeScreen1  The homeScreen1 to set.
	 * @uml.property  name="homeScreen1"
	 */
	public void setHomeScreen1(HomeScreen homeScreen1) {
		this.homeScreen1 = homeScreen1;
	}

	/**
	 * @uml.property  name="gameVIew"
	 * @uml.associationEnd  inverse="viewStory:cs.ualberta.ca.beargitandroid.GameVIew"
	 */
	private GameVIew gameVIew;

	/**
	 * Getter of the property <tt>gameVIew</tt>
	 * @return  Returns the gameVIew.
	 * @uml.property  name="gameVIew"
	 */
	public GameVIew getGameVIew() {
		return gameVIew;
	}

	/**
	 * Setter of the property <tt>gameVIew</tt>
	 * @param gameVIew  The gameVIew to set.
	 * @uml.property  name="gameVIew"
	 */
	public void setGameVIew(GameVIew gameVIew) {
		this.gameVIew = gameVIew;
	};
	
}
