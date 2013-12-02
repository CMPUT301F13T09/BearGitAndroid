package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.View.R;
import android.content.Context;
import android.widget.SimpleAdapter;

// TODO: Auto-generated Javadoc
/**
 * The Class StoryController.
 */
public class StoryController {
	
	/** The story. */
	private Story story;
	
	/** The cxt. */
	private Context cxt;
	
	/** The id. */
	private long ID;
	
	
	/**
	 * Instantiates a new story controller.
	 *
	 * @param context the context
	 * @param bid the bid
	 */
	public StoryController(Context context, long bid){
		this.cxt = context;
		this.ID = bid;
		this.story = new Story(this.cxt,this.ID);
	};
	
    public Story Story(){
        return this.story;
    }
	/**
	 * Gets the story.
	 *
	 * @return the story
	 */
	public HashMap<String,Object>  getStory(){
		HashMap <String,Object> temp = this.story.getStoryItem();
		return temp;
		
	};


	// add getchapterList
	public ArrayList<HashMap<String, String>> getChapterList(){
		
		ArrayList<HashMap<String,String>> chapterlist = this.story.getAllChapterList();
		
		return chapterlist;
		
	}
	
	//add show chapter
    public SimpleAdapter showchapter(){
		
		ArrayList<HashMap< String , String >> map = story.getChapterList(this.ID);
		
		if(map == null){
			return null;
		}
		String[] from = new String[]{"title"};
		int[] to = new int[] {R.id.title2};
		SimpleAdapter ad = new SimpleAdapter(this.cxt,map,R.layout.story_list_elem,from,to);
		
		
		return ad;
		
		
	}

	//create a new story.
	/**
	 * Creates the story.
	 *
	 * @param title the title
	 * @param author the author
	 * @param descript the descript
	 * @return the long
	 */
	public long CreateStory(String title,String author,String descript){
		story.createNewStory(title, descript, author);
		return story.getStoryID();
		
	}

    /**
     * get a new chapter
     * @return a story
     */
    public Chapter newChapter(){
        return this.story.createNewChapter();
    }


    public Chapter getChapter(long id){
        return this.story.getChapter(id);
    }

    public void modifyStory(String title, String describe, String author){
        this.story.modifyStory(title, describe, author);
    }

    public void randompickstory(){


    }



}
