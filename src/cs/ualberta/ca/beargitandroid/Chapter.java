package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;
import java.util.HashMap;


// TODO: Auto-generated Javadoc
/**
 * Chapter class.
 * @author Tianyi Wu <tywtyw2002@gmail.com>
 *
 */


public class Chapter {
	
	/** The id. */
	private static long id;
	
	/** The name. */
	private String name;
	
	/** The context. */
	private String context;
	
	/** The option. */
	private ArrayList< HashMap<String,String> > option;
	
	/** The media. */
	private String media;
	
	/** The story. */
	private Story story;


    /**
     * Create a new chapter.
     * @param story story
     * @param id  the new chapter id
     */
	public Chapter(Story story, long id){
		this.id = id;
        this.story = story;
	}

    /**
     * Create Chapter object with old data.
     *
     * @param story the story
     * @param id the id
     * @param name the name
     * @param context the context
     * @param option the option
     * @param media the media
     */
	public Chapter(Story story, long id, String name, String context, 
			ArrayList< HashMap<String,String>> option, String media){
		this.id = id;
		this.name = name;
		this.context = context;
		this.option = option;
		this.media = media;
		
	}
	
	
	/**
	 * Gets the chapter to map.
	 *
	 * @return the chapter to map
	 */
	public HashMap<String, String> getChapterToMap() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", this.id+"");
		map.put("name", this.name);
		map.put("context", this.context);
		map.put("media", this.media);
		
		return map;
		//return null;
	}
	
	/**
	 * Gets the optionby id.
	 *
	 * @param id the id
	 * @return the optionby id
	 */
	public HashMap<String,String> getOptionbyId(long id){
		HashMap<String,String> map = (HashMap<String,String>) option.get((int) id);
		map.put("id", id+"");
		return map;
	}
	
	/**
	 * Gets the option list.
	 *
	 * @return the option list
	 */
	public ArrayList< HashMap<String,String>> getOptionList(){
		return this.option;
	}
	
	/**
	 * Adds the option.
	 *
	 * @param context the context
	 * @param chapterId the chapter id
	 */
	public void addOption(String context, long chapterId){
		
	}
	
	/**
	 * Modify option.
	 *
	 * @param id the id
	 * @param context the context
	 * @param chapterId the chapter id
	 */
	public void modifyOption(long id, String context, long chapterId){
		
	}
	
}
