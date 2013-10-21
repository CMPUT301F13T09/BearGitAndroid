package cs.ualberta.ca.beargitandroid;

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
		private static final String DATABASE_NAME = "story_db";
		private static final String DATABASE_TABLE = "entry";
		
		
		public localDBAdapter (Context context){
			this.cxt = context;
		}
		
		
		/**
		 */
		public void create(Entry entry){
		}

		
		/**
		 * set the story to final version which can not be modify 
		 * @param entry
		 */
		public void finalize(long id){
			
		}
		
			
		/**
		 */
		public void remove(long id){
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



						/** 
						 * @uml.property name="dBAdapter"
						 * @uml.associationEnd inverse="localDBAdapter:cs.ualberta.ca.beargitandroid.DBAdapter"
						 */
						private DBAdapter dbAdapter;


						/** 
						 * Getter of the property <tt>dBAdapter</tt>
						 * @return  Returns the dbAdapter.
						 * @uml.property  name="dBAdapter"
						 */
						public DBAdapter getDBAdapter() {
							return dbAdapter;
						}


						/** 
						 * Setter of the property <tt>dBAdapter</tt>
						 * @param dBAdapter  The dbAdapter to set.
						 * @uml.property  name="dBAdapter"
						 */
						public void setDBAdapter(DBAdapter dbAdapter) {
							this.dbAdapter = dbAdapter;
						}

}
