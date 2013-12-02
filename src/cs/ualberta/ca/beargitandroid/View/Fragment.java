package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;
import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.GameController;
import cs.ualberta.ca.beargitandroid.controller.chapterEditer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class Fragment extends Activity {
	
	private chapterEditer gct;
	private String data;
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story_fragment);
		//This will display the story fragment and the list of their options.
		Button exitButton = (Button) findViewById(R.id.Exit);
		ListView next = (ListView) findViewById(R.id.options123);
		//Click next
		exitButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent intent=new Intent(Fragment.this,Fragment.class);
				startActivity(intent);
			}
		});

		
		
	}
		
	}

	
		
