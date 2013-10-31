package cs.ualberta.ca.beargitandroid;

import com.example.note.NotesDbAdapter.DatabaseHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.database.DatabaseUtils;




public class localDBAdapter extends DatabaseUtils {
	
		private final Context cxt;
		private static final String DATABASE_NAME = "Story_db";
		private static final String DATABASE_TABLE = "STORY_INFO";
	    private SQLiteDatabase mDb;
		
		public localDBAdapter (Context context){
			this.cxt = context;
		}
		
		
		/**
		 */
	    public long createEntry(initialValues)
		   {
		        ContentValues initialValues = new ContentValues();
		        initialValues.put(KEY_TITLE, title);
		        initialValues.put(KEY_FILENAME, filename);
		        initialValues.put(KEY_DATE, date);
		        initialValues.put(KEY_DESCRIPTION, description);
		        initialValues.put(KEY_AUTHOR,author);

		        return mDb.insert(DATABASE_TABLE, null, initialValues);
		   }
		
		/**
		 * set the story to final version which can not be modify 
		 * @param entry
		 */
		public void finalize(long id){
			
		        	
		}
		
			
		/**
		 */
		public boolen remove(long id){
			 
			return mDb.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
		}


				
				/**
				 */
	    public void update(Entry entry){
		}


					
					/**
					 */
     	public Entry fetch(long id){
						return null;
					}


						
						/**
						 */
		public Cursor query(String sql){
							return null;
						}



					

}
