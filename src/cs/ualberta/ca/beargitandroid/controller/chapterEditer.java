package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.View.R;
import android.app.Activity;
import android.content.Context;
import android.widget.SimpleAdapter;


public class chapterEditer extends Activity {
	
	static long ID;
	
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
	
	private Chapter chapter;
	
	private Context cxt;
	/**
	 * Chapter.
	 */

	public chapterEditer(Context context, Story story){
		 
		this.cxt = context;
		this.story = story;
		
	}
	
	public SimpleAdapter showchapter(){
		
		ArrayList<HashMap< String , String >> map = story.getChapterList(this.id);
		
		if(map == null){
			return null;
		}
		String[] from = new String[]{"title"};
		int[] to = new int[] {R.id.title2};
		SimpleAdapter ad = new SimpleAdapter(this.cxt,map,R.layout.story_list_elem,from,to);
		
		
		return ad;
		
		
	}
	
	public SimpleAdapter showoption(){
		
		HashMap<String,String> map = (HashMap<String,String>) option.get((int) id);
		
		if(map == null){
			
			return null;
			
		}
		
		String from = new String[]{title};
		int[] to = new int[]{R.id.title6};
		SimpleAdapter op = new SimpleAdapter(this.cxt,map,R.layout.story_list_elem,from,to);
		
	}
	
	
	public void editOption( ){
		
	}
	public void addMedia(){
		
	}
    public void save(){
    	
    }
    public void delete(){
    	
    }
	
    
}
