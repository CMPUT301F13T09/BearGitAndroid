package cs.ualberta.ca.beargitandroid.View;

import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.GameController;
import cs.ualberta.ca.beargitandroid.controller.StoryController;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class ViewStory extends Activity {	
	private GameController sct;
	private long ID;
	private TextView TITLE;
	private TextView Descrip;
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//this will display the description of the story at the start
		//you can choose new game or load game
		setContentView(R.layout.story_description);
		Button newgameButton = (Button) findViewById(R.id.newgame);
		ListView loadGameList = (ListView) findViewById(R.id.listView8);
		TITLE = (TextView) findViewById(R.id.title3);
		Descrip = (TextView) findViewById(R.id.descriptionContent);
		//add resumelist

		Intent intent=getIntent();
		Bundle bundle = intent.getExtras();
		ID = bundle.getLong("id");

        //set contronller
		sct = new GameController (this, ID);
		
		
		//show story information
		HashMap <String,Object> current = sct.showSotry();
		TITLE.setText((String) current.get("title"));
		Descrip.setText((String) current.get("description"));
		
		//show resume list
		final SimpleAdapter radp = sct.readProgress();
		if (radp != null){
			loadGameList.setAdapter(radp);
			
			loadGameList.setOnItemClickListener(new OnItemClickListener(){
				public void onItemClick(AdapterView<?> parent,View arg1, int pos, long id){
				//The place you add the code that get the story info from the database
					HashMap <String, Object> r = (HashMap<String, Object>) radp.getItem(pos);
					String data = (String) r.get("data");
					long cid = sct.reloadProgress(data);
					
					Intent intent = new Intent(ViewStory.this,Fragment.class);
					intent.putExtra("Story", sct.story());
                    intent.putExtra("c_id", cid);
					startActivity(intent);
				}
			});
		}
		
		
		
		
		//click NEWGAME button then go to the start of the story
		newgameButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent intent=new Intent(ViewStory.this,Fragment.class);

                intent.putExtra("Story", sct.story());
				startActivity(intent);
			}
		});


		loadGameList.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> parent,View arg1, int pos, long id){
			//The place you add the code that get the story info from the database
				Intent intent = new Intent(ViewStory.this,Fragment.class);
				startActivity(intent);
			}
		});
		
	}
}
