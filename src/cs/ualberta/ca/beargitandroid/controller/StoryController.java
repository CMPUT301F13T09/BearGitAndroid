package cs.ualberta.ca.beargitandroid.controller;

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
	
	
	public void showView(){
		HashMap <String,Object> temp = this.story.;
		
	};
	
	public void startGame(Story story,long ID){
		
	};
	
	private void loadExistGame(){
		
	};
	
	private void loadSave(){
		
	}

	
}
