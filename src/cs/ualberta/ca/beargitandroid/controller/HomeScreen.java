package cs.ualberta.ca.beargitandroid.controller;

import java.util.ArrayList;
import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.DBAdapter;
import cs.ualberta.ca.beargitandroid.View.R;
import android.app.Activity;
import android.content.Context;
import android.widget.SimpleAdapter;


public class HomeScreen {
	
	
	
	private DBAdapter dbHelper;
	private Context cxt;
	public HomeScreen(Context context){
		this.dbHelper = new DBAdapter(context);
		this.cxt = context;
		//String sql = "insert into STORY_INFO VALUES ('2','2323223', 'sb', 'laowai', '1asda23','asdasd','2010-01-01 10:10:10' ,'2')";
		//this.dbHelper.query(sql);
		
		
		
	}
	public SimpleAdapter showLocal(){
		
		ArrayList < HashMap<String ,Object>> l = dbHelper.getStoryListwithHashMap("Select * from STORY_INFO where Status = 2");
		
//		for (HashMap<String,Object> i: l){
//			if( (Integer) i.get("status")== 2){
//				
//			}
//		}
		if(l == null){
			return null;
		}
		
		String[] from = new String[] {"title"};
		int[] to = new int[] {R.id.title2};
		SimpleAdapter ad = new SimpleAdapter(this.cxt,l,R.layout.story_list_elem,from,to);
		
		
		return ad;
		
	};
	
	public void showRemote(){
		
	};
	
	public void showCreate(){
		
	};
	
	public void search(){
		
	}

	
}
