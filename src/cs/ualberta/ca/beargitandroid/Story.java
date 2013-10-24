package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;
import java.util.HashMap;

public class Story {

	private Entry entry;
    private DBAdapter dbHelper;
    private ArrayList<Integer> gameInfo;
	//private HashMap<Integer, Chapter> chapterList;
    private Chapter[] chapterList;

	public Story(Entry entry){
		if (entry == null)
			this.entry = new Entry();
		else
			this.entry = entry;
	}
	
	
	public void toJson(){
		
	}
	
	public void getFromJson(){
		
	}
	

	public Chapter getChapter(long id) {
		return chapterList[(int)id];
	}


	
}
