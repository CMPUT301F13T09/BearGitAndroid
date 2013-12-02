package cs.ualberta.ca.beargitandroid;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


// TODO: Auto-generated Javadoc
/**
 * Chapter class.
 * @author Tianyi Wu <tywtyw2002@gmail.com>
 *
 */


public class Chapter implements Serializable {
	
	/** The id. */
	public static long id;
	
	/** The title. */
	private String title;
	
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
     * @param title the name
     * @param context the context
     * @param option the option
     * @param media the media
     */
	public Chapter(Story story, long id, String title, String context,
			ArrayList< HashMap<String,String>> option, String media){
		this.id = id;
		this.title = title;
		this.context = context;
		this.option = option;
		this.media = media;
		
	}

    /**
     * set a title and context to a new story
     * @param title chapter title
     * @param context chapter context
     */
    public void setContext(String title, String context ){
        this.title = title;
        this.context = context;
    }

    /**
     * modify chapter title and context
     * @param title
     * @param context
     */
    public void modifyContext(String title, String context){
        this.title = title;
        this.context = context;
    }

    /**
     * add or modify media.
     * @param media
     */
    public void modifyMedia(String media){
        this.media = media;
    }

	/**
	 * Get all of the information of the chapter except the option.
	 *
	 * @return the chapter to map
	 */
	public HashMap<String, String> getChapterToMap() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", this.id+"");
		map.put("title", this.title);
		map.put("context", this.context);
		map.put("media", this.media);
		
		return map;
		//return null;
	}




	/**
	 * Return all of the options of this chapter.
	 * the key is (context, nextid) for each hashmap.
	 * @return the option list
	 */
	public ArrayList< HashMap<String,String>> getOptionList(){
		return this.option;
	}


	/**
	 * Adds the option.
	 *
	 * @param context the context
	 * @param nextid the next chapter id
	 */
	public void addOption(String context, long nextid){
        HashMap<String , String > h = new HashMap<String, String>();
        h.put("context", context);
        h.put("nextid", nextid + "");
		
	}


	/**
	 * Modify option.
	 *
	 * @param id the id which is the order in the arraylist
	 * @param context the context
	 * @param nextid the the id of next chapter
	 */
	public void modifyOption(long id, String context, long nextid){
	    //remove existed option
        removeOption(id);
        addOption(context,nextid);

	}

    /**
     * remove a Option with give id.
     * @param id the option id that you want to remove.
     */
    public void removeOption(long id){
        option.remove((int) id);
    }

    /**
     * When is done, save this chapter whether change this chapter.
     */
    public void saveChapter(){
        this.story.saveChapters();
    }

    /**
     * show all chapter list as hasmap(id, title), exclude self.
     * @return a arraylist
     */
    public ArrayList<HashMap< String , String >> getChapterList(){
        return story.getChapterList(this.id);

    }

    public HashMap<String , String > getSummary(){
        HashMap<String , String > h = new HashMap<String, String>();
        h.put("id", this.id + "");
        h.put("title", this.title);
        return h;
    }


    /**
     * Get the next chapter from chapter id
     * @param id chapter id
     * @return  new chapter
     */
    public Chapter getNextChapter(long id){
        return this.story.getChapter(id);
    }

    public void saveReloadData(){
        this.story.saveResumeData();
    }

    public Story getStory(){
        return this.story;
    }

    public long getid(){
        return this.id;
    }
}
