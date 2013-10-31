package cs.ualberta.ca.beargitandroid;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Story {

    private DBAdapter dbHelper;
    private ArrayList<Integer> gameInfo;
	//private HashMap<Integer, Chapter> chapterList;
    private Chapter[] chapterList;
    private long id;
    private String title;
    private String filename;
    private String describe;
    private Date date;
    private String author;

	public Story(long id){
        if(id != 0)
            this.id = id;
	}

    /**
     * create a new story
     * @param title
     * @param describe
     * @param author
     */
    public void createNewStory(String title, String describe, String author){
        this.title = title;
        this.describe = describe;
        this.author = author;
        this.date = new Date();
        this.filename = generateFilename();
    }
	

    private String generateFilename(){


    }

	public void toJson(){
		
	}
	
	public void getFromJson(){
		
	}
	

	public Chapter getChapter(long id) {
		return chapterList[(int)id];
	}


	
}
