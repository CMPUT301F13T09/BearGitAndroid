package cs.ualberta.ca.beargitandroid.controller;

import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Story;
import android.app.Activity;
import android.content.Context;

public class StoryController {
	
	private Story story;
	private Context cxt;
	private long ID;
	
	
	public StoryController(Context context, long bid){
		this.cxt = context;
		this.ID = bid;
		this.story = new Story(this.cxt,this.ID);
	};
	
	
	public HashMap<String,Object>  getStory(){
		HashMap <String,Object> temp = this.story.getStoryItem();
		return temp;
		
	};
	
	public void startGame(Story story,long ID){
		
	};
	
	private void loadExistGame(){
		
	};
	
	private void loadSave(){
		
	}
	public long CreateStory(String title,String author,String descript){
		story.createNewStory(title, descript, author);
		return story.getStoryID();
		
	}

	
}
