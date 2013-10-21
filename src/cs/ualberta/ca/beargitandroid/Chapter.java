package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Chapter {
	
	static long id;
	String name;
	String Context;
	ArrayList< HashMap<String,String> > option;
	String media;
	/**
	 * @uml.property  name="story"
	 * @uml.associationEnd  multiplicity="(0 -1)" dimension="1" ordering="true" inverse="chapter:cs.ualberta.ca.beargitandroid.Story"
	 */
	private Story[] stories;
	/**
	 * Getter of the property <tt>story</tt>
	 * @return  Returns the stories.
	 * @uml.property  name="story"
	 */
	public Story[] getStory() {
		return stories;
	}
	/**
	 * Setter of the property <tt>story</tt>
	 * @param story  The stories to set.
	 * @uml.property  name="story"
	 */
	public void setStory(Story[] story) {
		stories = story;
	}
	
}
