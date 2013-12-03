package cs.ualberta.ca.beargitandroid.tests;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import cs.ualberta.ca.beargitandroid.View.homeScreenLocal;
import cs.ualberta.ca.beargitandroid.*;

public class storytest extends ActivityInstrumentationTestCase2<homeScreenLocal> {

    private transient DBAdapter dbHelper;
    private ArrayList<Integer> gameInfo;
    private HashMap<Integer, Chapter> chapterList;
    private long id;
    private String title;
    private String filename;
    private String describe;
    private Date date;
    private String author;
    private int status;
    private HashMap<String, Object> dict;
    private int maxChapterID;
    private transient Context cxt;
    private Story story;

    public storytest() {
        super(homeScreenLocal.class);
    }


    @Override
    public void setUp() throws Exception {
        // get the activity
        Activity activity = super.getActivity();
        // get context from activity
        cxt = activity.getApplicationContext();
        // initialize DBHelper
        //dbHelper = new DBAdapter(cxt);
        //gameInfo = new ArrayList<Integer>();
        //gameInfo.add(1);
        //chapterList = new HashMap<Integer, Chapter>();


        this.story = new Story(cxt, 0);



    }

//    public void test1() {
//
//
//    }



    public void test2(){


//        story.modifyStory("title2", "author2", "realAuthor2");
//
//        assertEquals("title2", (String) story.getStoryItem().get("title") );
//        assertEquals("realAuthor2", (String) story.getStoryItem().get("author") );
//        assertEquals("author2", (String) story.getStoryItem().get("description") );

        story.createNewStory("title", "author", "realAuthor");
        Log.e("TEST", story.getStoryID() + "");

        assertEquals(story.getStoryItem().get("title") ,"title" );
        assertEquals( story.getStoryItem().get("author"),"realAuthor" );
        assertEquals(story.getStoryItem().get("description"),"author" );

        Log.e("TEST", story.getStoryID() + "");
        id = story.getStoryID();

        Chapter c = story.createNewChapter();
        //test chapter
        c.modifyContext("test1","test2");
        story.saveChapters();

        //add chapter 2
        c = story.createNewChapter();
        c.modifyContext("btest1","btest2");
        story.saveChapters();

        Log.e("TEST",story.ChapterstoJson());

        assertEquals(3, story.getMaxChapterID());

        Log.e("TEST", this.id + "");
        story = new Story(cxt, this.id);
        Log.e("TEST", story.loadChapterFile());
        c = story.getChapter(1);
        Log.e("TEST", c.getid()+"");
        assertEquals(1, c.getid());
        assertEquals("test1", c.getChapterToMap().get("title"));
        assertEquals("test2", c.getChapterToMap().get("context"));


        c = story.getChapter(2);
        assertEquals(2, c.getid());
        assertEquals("btest1", c.getChapterToMap().get("title"));
        assertEquals("btest2", c.getChapterToMap().get("context"));
    }



//    public void testModifStory() {
//        story.modifyStory("NewTitle", "author", "realAuthor");
//	/*
//	 * can't be tested, since we don't have functions that have access to
//	 * title, author, description field in the story class. Even if we
//	 * changed the story, we can't not make sure it's been changed.
//	 *
//	 * should have a function that
//	 * assertEquals(story.getAuthor, "realAuthro");
//	 * assertEquals(story.getTitle, "NewTitle");
//	 */
//    }

}