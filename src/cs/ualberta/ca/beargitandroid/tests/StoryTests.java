package cs.ualberta.ca.beargitandroid.tests;

import cs.ualberta.ca.beargitandroid.controller.HomeScreen;
import junit.framework.Assert;
import android.content.ContentValues;
import android.content.Context;
import android.test.AndroidTestCase;
import cs.ualberta.ca.beargitandroid.*;
/**
 * 
 * @author Kyle Richelhoff
 * 
 * Stringing together story fragments and performing functionality on those fragments. 
 */
public class StoryTests extends AndroidTestCase {
	
      private Story story;
      private Context cxt;
      private String title;
      private String description;
      private String author ;
      private long id;

     
    protected void setUp() throws Exception {

        this.id = 0;

    	this.story = new Story (this.cxt, this.id);
        this.story.createNewStory("title123","description123","author123");
       
    }

   public void testcreateNewStory(){
       try{
    	   this.story = new Story (this.cxt,this.id);
           this.story.createNewStory("title","description","author");
           assertTrue(story.getStoryItem()!=null);
       }catch (Exception e){
           fail("cannot create a new story");
       }
   }
  
  
   public void testgenerateCV(){
       
         ContentValues cv = new ContentValues();
         cv.put("title",this.title);
         cv.put("Title", this.title);
         cv.put("Description", this.description);
         cv.put("Author", this.author);
      
        assertTrue(cv != null);
   }
  
   public void testGetter() {
       assertEquals(id,story.getStoryID());
       assertTrue(story.getStoryItem() != null);
       
   }
}