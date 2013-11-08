package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;

import cs.ualberta.ca.beargitandroid.Story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CreateStory extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_story);
		
		Button addButton = (Button) findViewById(R.id.addchapter);
		Button saveButton = (Button) findViewById(R.id.save);
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
				Intent intent=new Intent(CreateStory.this,homeScreenLocal.class);
				startActivity(intent);
			}
		});
		

		
	};
};

