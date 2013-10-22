package cs.ualberta.ca.beargitandroid;

import android.app.Activity;

public class EditorView extends Activity {
	private Story story;
	private long ID;
	
	/**
	 * if ID is null, then Editor will call the function create(). Or it will call the function read().
	 * @param ID
	 */
	public void Editor(long ID){
		/**
		 * if (ID == NULL) then story = create();
		 * else story = read();
		 */
		
	}
	
	private void create(){
		
	}
	
	private void read(){	
	}
	
	public void save(){		
	}
	
	public void delete(){		
	}
	/**
	 * The function editChapter() will call to the else class.
	 */
	public void editChapter(){
		/**
		 * Chapter = chapterEditor(Story story)
		 */
	}
	
	public void getChapterList(){
		/**
		 * return the exist chapters
		 */
	}

	/**
	 * @uml.property  name="story1"
	 * @uml.associationEnd  aggregation="shared" inverse="editorView:cs.ualberta.ca.beargitandroid.Story"
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
	 * @uml.property  name="json"
	 * @uml.associationEnd  inverse="editorView:cs.ualberta.ca.beargitandroid.Json"
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
	 * @uml.associationEnd  inverse="editorView:cs.ualberta.ca.beargitandroid.HomeScreen"
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
	 * @uml.property  name="dBAdapter"
	 * @uml.associationEnd  inverse="editorView:cs.ualberta.ca.beargitandroid.DBAdapter"
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
	}

	/**
	 * @uml.property  name="chapterEditer"
	 * @uml.associationEnd  inverse="editorView:cs.ualberta.ca.beargitandroid.chapterEditer"
	 */
	private chapterEditer chapterEditer;

	/**
	 * Getter of the property <tt>chapterEditer</tt>
	 * @return  Returns the chapterEditer.
	 * @uml.property  name="chapterEditer"
	 */
	public chapterEditer getChapterEditer() {
		return chapterEditer;
	}

	/**
	 * Setter of the property <tt>chapterEditer</tt>
	 * @param chapterEditer  The chapterEditer to set.
	 * @uml.property  name="chapterEditer"
	 */
	public void setChapterEditer(chapterEditer chapterEditer) {
		this.chapterEditer = chapterEditer;
	}

}
