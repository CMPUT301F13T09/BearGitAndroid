package cs.ualberta.ca.beargitandroid;

public abstract class Entry {
	
	public long id;
	public String title;
	public String filename;
	public String destribe; 
	public String date;
	public String Author;
	/** 
	 * @uml.property name="story"
	 * @uml.associationEnd inverse="entry1:cs.ualberta.ca.beargitandroid.Story"
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
}
