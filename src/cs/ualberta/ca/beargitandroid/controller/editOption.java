package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.View.R;


public class editOption {

    private Chapter chapter;
    
    private String context;// change Context to String
    
    private Story story;
    
    private static long id;
    
    private Context cxt;
    
    private ArrayList< HashMap<String,String> > option;
	/**
	 * Show link.
	 */
	private void showLink(){
		
	}
	
	
    public void save(){
    	modifyoption(context,id);
    	this.chapter.addOption(context, id);
    }
    
    public void modifyoption(String context, long id){
    	
    	this.context = context;
    	this.id = id;
    }
    
    public void delete(){
    	this.chapter.removeOption(id);
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
    
    
}
