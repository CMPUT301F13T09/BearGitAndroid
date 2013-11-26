package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.widget.SimpleAdapter;
import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.View.R;


public class editOption {

    private Chapter chapter;
    
    private Context cxt;
    
    private static long id;
    
    private ArrayList< HashMap<String,String> > option;
	/**
	 * Show link.
	 */
	private void showLink(){
		
	}
    public void save(){
    	
    }
    public void delete(){
    	
    }
    public editOption(Context context, long id){
    	
    	this.cxt = context;
        
    	
    }
    
    public SimpleAdapter showoption(){
		
		HashMap<String,String> map = (HashMap<String,String>) option.get((int) id);
		
		if(map == null){
			
			return null;
			
		}
		
		String opt = new String[]{option.get(index)};
		int[] to = new int[]{R.id.title6};
		SimpleAdapter op = new SimpleAdapter(this.cxt,map,R.layout.story_list_elem,from,to);
		
	}
	
		
}
