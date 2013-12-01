package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

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
	private Chapter chapter;
	
	
	
	
	/**
	 * Show sotry.
	 */
	
	// how to show story?
	
	public void showSotry(){
		
		 
		
	};
	
	/**
	 * Next.
	 */
	
	//think need optionid
	public void next(){
		
     story.getChapter(id);	
	this.id = chapter.id;
		
	};
	
	/**
	 * Read progress.
	 */
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void readProgress(){
		
		story.reloadResumeData(data);
		
	};
	
	/**
	 * Save progress.
	 */
	public void saveProgress(){
		
		
		story.saveResumeData();
		
	}
	// !!!!!!!!!!!! the option can click......................
	 public SimpleAdapter clickOption(){
	    	
	    	ArrayList<HashMap< String , String >> OptionArray = chapter.getOptionList();
	    	
	    	if(OptionArray==null){
	    		
	    		return null;
	    	}
	    	//sha yi si
	    	String[] from = new String[] {"context"};
	    	int[] to = new int[] {R.id.};
	    	
	    	SimpleAdapter Optionad = new SimpleAdapter(this.cxt,l,R.layout.story_list_elem,from,to);
			return Optionad;

}
}

