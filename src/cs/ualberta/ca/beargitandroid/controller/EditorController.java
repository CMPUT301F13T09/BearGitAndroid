package cs.ualberta.ca.beargitandroid.controller;

import cs.ualberta.ca.beargitandroid.Story;
import android.app.Activity;

public class EditorController{
	private Story story;
	private long ID;
	
	/**
	 * if ID is null, then Editor will call the function create(). Or it will call the function read().
	 *
	 * @param ID the id
	 */
	public void Editor(long ID){
		/**
		 * if (ID == NULL) then story = create();
		 * else story = read();
		 */
		
	}
	
	private void create(){
		
	}
	
	private void read(){	
	}
	
	public void save(){		
	}
	
	public void delete(){		
	}
	/**
	 * The function editChapter() will call to the else class.
	 */
	public void editChapter(){
		/**
		 * Chapter = chapterEditor(Story story)
		 */
	}
	
	public void getChapterList(){
		/**
		 * return the exist chapters
		 */
	}

}
