package cs.ualberta.ca.beargitandroid.controller;

import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Story;
import android.app.Activity;
import android.content.Context;

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
	
	
	/**
	 * Gets the story.
	 *
	 * @return the story
	 */
	public HashMap<String,Object>  getStory(){
		HashMap <String,Object> temp = this.story.getStoryItem();
		return temp;
		
	};
	
	/**
	 * Start game.
	 *
	 * @param story the story
	 * @param ID the id
	 */
	public void startGame(Story story,long ID){
		
	};
	
	/**
	 * Load exist game.
	 */
	private void loadExistGame(){
		
	};
	
	/**
	 * Load save.
	 */
	private void loadSave(){
		
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

	
}
