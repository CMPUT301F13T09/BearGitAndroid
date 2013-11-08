package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;



import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.StoryController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CreateStory extends Activity {
	private StoryController sct;
	private EditText TitleText;
	private EditText AuthorText;
	private EditText DescripText; 
	
	/** The text0. */
	private String text0;
	private String text1;
	private String text2;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_story);
		this.sct = new StoryController(this,0);
		Button addButton = (Button) findViewById(R.id.addchapter);
		Button saveButton = (Button) findViewById(R.id.save);
		TitleText = (EditText) findViewById(R.id.title6);
		AuthorText = (EditText) findViewById(R.id.author6);
		DescripText = (EditText) findViewById(R.id.descrip6);
		//click ADDCHAPTER button then go to the add_link.xml
		addButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override		
			public void onClick(View v)
			{
				Intent intent=new Intent(CreateStory.this,AddLink.class);
				startActivity(intent);
			}
		});
		
		
		saveButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				//The place you add the code that save the story to the database
				//setResult(RESULT_OK);
				text0 = TitleText.getText().toString();
				text1 = AuthorText.getText().toString();
				text2 = DescripText.getText().toString();
				long x = sct.CreateStory(text0, text1, text2);
				Log.v("kk", x+"");
				finish();
			}
		});
		

		
	};
};

