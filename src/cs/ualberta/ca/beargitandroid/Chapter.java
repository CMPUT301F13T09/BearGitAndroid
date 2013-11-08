package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Chapter class.
 * @author Tianyi Wu <tywtyw2002@gmail.com>
 *
 */


public class Chapter {
	
	private static long id;
	private String name;
	private String context;
	private ArrayList< HashMap<String,String> > option;
	private String media;
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
     * @param story
     * @param id
     * @param name
     * @param context
     * @param option
     * @param media
     */
	public Chapter(Story story, long id, String name, String context, 
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
	
}
