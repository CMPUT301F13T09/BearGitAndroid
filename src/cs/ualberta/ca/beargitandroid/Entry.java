package cs.ualberta.ca.beargitandroid;

public class Entry {
	
	private long id;
	private String title;
	private String filename;
	private String destribe; 
	private String date;
	private String Author;

	public Entry(){
		
	}

	/**
	 * @uml.property  name="story"
	 * @uml.associationEnd  inverse="entry1:cs.ualberta.ca.beargitandroid.Story"
	 */
	private Story story;

	/**
	 * Getter of the property <tt>story</tt>
	 * @return  Returns the story.
	 * @uml.property  name="story"
	 */
	public Story getStory() {
		return story;
	}

	/**
	 * Setter of the property <tt>story</tt>
	 * @param story  The story to set.
	 * @uml.property  name="story"
	 */
	public void setStory(Story story) {
		this.story = story;
	}

	/**
	 * @uml.property  name="dBAdapter"
	 * @uml.associationEnd  inverse="entry:cs.ualberta.ca.beargitandroid.DBAdapter"
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
	
	
	
}
