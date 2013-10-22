package cs.ualberta.ca.beargitandroid;

import java.util.HashMap;

public class Story {

	private Entry entry;
	private HashMap<Integer, Chapter> chapterList;

	public Story(Entry entry){
		if (entry == null)
			this.entry = new Entry();
		else
			this.entry = entry;
	}
	
	
	public void toJson(){
		
	}
	
	public void getfromJson(){
		
	}
	

	public Chapter getChapter(long id) {
		return chapterList.get(id);
	}


	
}
