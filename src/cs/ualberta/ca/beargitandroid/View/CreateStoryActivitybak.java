package cs.ualberta.ca.beargitandroid.View;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import cs.ualberta.ca.beargitandroid.R;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.*;


public class CreateStoryActivitybak extends Activity {
   
	private static final int ACTIVITY_EDIT_STORY = 0;
	
	private EditText mstoryTitle;
	private EditText mstoryAuthor;
	private EditText mstoryDescription;
	private TextView mdate;
	private Button createchapterbutton;
	private Button savestorybutton;
	private long id;
	
	String storyTitle;
	String storyAuthor;
	String storyDescription;
	String formattedDATE;
	String show_path;
	
	
	protected void onCreate(Bundle saveInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_story);
		
		mstoryTitle = (EditText) findViewById(R.id.title);
		mstoryAuthor = (EditText) findViewById(R.id.editText2);
		mstoryDescription = (EditText) findViewById(R.id.editText1);
		createchapterbutton = (Button) findViewById(R.id.addchapter);
		savestorybutton = (Button) findViewById(R.id.save);
		
		
		 createchapterbutton.setOnClickListener(new Button.OnClickListener() {  
			 
			 public void onClick(View arg0){
				 Intent intent = new Intent(CreateStoryActivity.this,EditChapterActivity.class);
				 startActivity(intent);
				 }	 
		 });
		 
		 savestorybutton.setOnClickListener(new Button.OnClickListener() {
			 
			 public void onClick(View view){
				 
				 savestate();
				
			 }
		 });
	}
		 
		 public void savestate(){
			 
			 String storyTitle = mstoryTitle.getText().toString();
			 String storyAuthor = mstoryTitle.getText().toString();
			 String stroyDescription = mstoryDescription.getText().toString();
			 
			 if(mRowId == null){
		         this.id = StoryController.createNewStory(String storyTitle, String storyDescription, String stroyAuthor);
		        	if(id > 0){
		        		mRowId = id;
		        	}else{
		        		Log.e("saveState","failed to create note");
		        	}
		        }else   {
		        	if(!mDbHelper.updateNote(mRowId, title, body, date)){
		        		Log.e("saveState","failed to update note");
			
		        	}
		        }
		 }
		 
		 
			 
		 
		 
		 
		 
		 
		 
		
			
		
	
	
}
