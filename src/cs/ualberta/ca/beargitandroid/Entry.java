package cs.ualberta.ca.beargitandroid;

import android.content.ContentValues;

public class Entry {
	
	private long id;
	private String title;
	private String filename;
	private String description; 
	private String date;
	private String author;
	private int num;
	

	public Entry(){
		
	}

    private void fillEntryValue(){
    	String title = StitleText.getText.toString();
    	String filename = SfilenameText.getText.toString();
    	String description = SdescriptionText.getText.toString();
    	String date = SdateText.getText.toString();
    	String author = sauthorText.getText.toString();
    			
    	
    }
	
    public long createNote(String title, String filename, String description, String date, String Author)
   {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_TITLE, title);
        initialValues.put(KEY_FILENAME, filename);
        initialValues.put(KEY_DATE, date);
        initialValues.put(KEY_DESCRIPTION, description);
        initialValues.put(KEY_AUTHOR,author);
        

        return mDb.insert(DATABASE_TABLE, null, initialValues);
    }
	
}
