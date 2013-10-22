package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;
import java.util.HashMap;

public class Chapter {
	
	private static long id;
	private String name;
	private String context;
	private ArrayList< HashMap<String,String> > option;
	private String media;

	public Chapter(){
		
	}
	
	public Chapter(long id, String name, String context, 
			ArrayList< HashMap<String,String>> option, String media){
		this.id = id;
		this.name = name;
		this.context = context;
		this.option = option;
		this.media = media;
		
	}
	
	
	public HashMap<String, String> getChapterToMap() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", this.id+"");
		map.put("name", this.name);
		map.put("context", this.context);
		map.put("media", this.media);
		
		return map;
		//return null;
	}
	
	public HashMap<String,String> getOptionbyId(long id){
		HashMap<String,String> map = (HashMap<String,String>) option.get((int) id);
		map.put("id", id+"");
		return map;
	}
	
	public ArrayList< HashMap<String,String>> getOptionList(){
		return this.option;
	}
	
	public void addOption(String context, long chapterId){
		
	}
	
	public void modifyOption(long id, String context, long chapterId){
		
	}

	/**
	 * @uml.property  name="story"
	 * @uml.associationEnd  inverse="chapter1:cs.ualberta.ca.beargitandroid.Story"
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
