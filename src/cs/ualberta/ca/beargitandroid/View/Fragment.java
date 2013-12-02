package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;
import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.ChapterController;
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
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;


public class Fragment extends Activity {
	
	private ChapterController gct;
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
		Chapter chapter = (Chapter) getIntent().getSerializableExtra("chapter");
		gct = new ChapterController(this,chapter);
		TextView fragment = (TextView)findViewById(R.id.fragment);
		TextView Title = (TextView)findViewById(R.id.title091);
		ListView Option = (ListView)findViewById(R.id.options123);
		fragment.setText(gct.getChapterInfo().get("context"));
		Title.setText(gct.getChapterInfo().get("title"));
		
		
		
		final SimpleAdapter radp = gct.clickOption();
		if (radp != null){
			Option.setAdapter(radp);
			
			Option.setOnItemClickListener(new OnItemClickListener(){
				public void onItemClick(AdapterView<?> parent,View arg1, int pos, long id){
				//The place you add the code that get the story info from the database
					HashMap <String, String> r = (HashMap<String, String>) radp.getItem(pos);
					long data = Long.parseLong(r.get("nextid"));
					Chapter next = gct.getNextChapter(data);
					Intent intent = new Intent(Fragment.this,Fragment.class);
					intent.putExtra("chapter", next);
					startActivity(intent);
				}
			});
		}
		
		
		
		exitButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				gct.saveProcess();
				Intent intent = new Intent(Fragment.this,homeScreenLocal.class);
				startActivity(intent);
			}
		});

		
		
	}
		
	}

	
		
