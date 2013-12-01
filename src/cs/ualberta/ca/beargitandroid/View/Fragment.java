package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;

import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.GameController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Fragment extends Activity {
	
	private GameController gct;
	private String data;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story_fragment);
		//This will display the story fragment and the list of their options.
		Button nextButton = (Button) findViewById(R.id.next);
		Button saveButton = (Button) findViewById(R.id.next);
		//Click next
		nextButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent intent=new Intent(Fragment.this,Fragment.class);
				startActivity(intent);
			}
		});
		
		saveButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				gct.saveProgress();
				 Intent intent = new Intent(Fragment.this,ViewStory.class);
				   
					startActivity(intent);
				}
				
			
		});
	}
		
	}

	
		
