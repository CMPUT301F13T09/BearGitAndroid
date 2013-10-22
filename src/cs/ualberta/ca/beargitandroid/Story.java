package cs.ualberta.ca.beargitandroid;

import java.util.HashMap;

public class Story {

	private Entry entry;
	private HashMap<Integer, Chapter> chapterList;

	public Story(Entry entry){
		if (entry == null)
			this.entry = new Entry();
		else
			this.entry = entry;
	}
	
	
	public void toJson(){
		
	}
	
	public void getfromJson(){
		
	}
	

	public Chapter getChapter(long id) {
		return chapterList.get(id);
	}

	public Entry getEntry(){
		return this.entry;
	}

	/**
	 * @uml.property  name="chapter1"
	 * @uml.associationEnd  inverse="story:cs.ualberta.ca.beargitandroid.Chapter"
	 */
	private Chapter chapter1;

	/**
	 * Getter of the property <tt>chapter1</tt>
	 * @return  Returns the chapter1.
	 * @uml.property  name="chapter1"
	 */
	public Chapter getChapter1() {
		return chapter1;
	}


	/**
	 * Setter of the property <tt>chapter1</tt>
	 * @param chapter1  The chapter1 to set.
	 * @uml.property  name="chapter1"
	 */
	public void setChapter1(Chapter chapter1) {
		this.chapter1 = chapter1;
	}

	/**
	 * @uml.property  name="entry1"
	 * @uml.associationEnd  inverse="story:cs.ualberta.ca.beargitandroid.Entry"
	 */
	private Entry entry1;

	/**
	 * Getter of the property <tt>entry1</tt>
	 * @return  Returns the entry1.
	 * @uml.property  name="entry1"
	 */
	public Entry getEntry1() {
		return entry1;
	}


	/**
	 * Setter of the property <tt>entry1</tt>
	 * @param entry1  The entry1 to set.
	 * @uml.property  name="entry1"
	 */
	public void setEntry1(Entry entry1) {
		this.entry1 = entry1;
	}

	/**
	 * @uml.property  name="gameVIew"
	 * @uml.associationEnd  inverse="story2:cs.ualberta.ca.beargitandroid.GameVIew"
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
	}

	/**
	 * @uml.property  name="viewStory"
	 * @uml.associationEnd  inverse="story:cs.ualberta.ca.beargitandroid.ViewStory"
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
	

	
}
