package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.View.R;





// TODO: Auto-generated Javadoc
/**
 * The Class GameController.
 */
public class GameController {
	
	private String data;
	private long id;
	
	/** The story. */
	private Story story;
	private Context context;

	
	/**
	 * Show sotry.
	 */
	
	public GameController(Context context, long id) {
		
		this.context = context;
		this.story = new Story(context, id); 
		
	}
	
	public  HashMap<String, Object> showSotry(){
		
		
		return  story.getStoryItem();
		 
	};
	

	/**
	 * Read progress.
	 */
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public SimpleAdapter readProgress(){
		
		ArrayList<HashMap<String, Object>> ProgressList = story.getResumeList();
		
		if(ProgressList==null){
			return null;
		}
		
		String[] from = new String[]{"description"};
		int[] to = new int[] {R.id.ti7};
		
		SimpleAdapter resumead = new SimpleAdapter(this.context,ProgressList,R.layout.story_resumerow,from,to);
		
		
		return resumead;
		
	};
	
	// wait for deleteStroy
	public void deleteStory(){
		
	
		
		
	}

    public Story story(){
        return this.story;
    }


	/**
	 * Save progress.
	 */
	public long reloadProgress(String data){
		
		story.reloadResumeData(data);
		//need modify
		return story.getReloadChapterid();
	}
	
	
	public Chapter getNewgameChapter(){
		return story.getChapter(1);
	}
	
	
}

