package cs.ualberta.ca.beargitandroid.View;

import cs.ualberta.ca.beargitandroid.Story;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ViewStory extends Activity {	
	private long ID;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story_description);
		Button newgameButton = (Button) findViewById(R.id.newgame);
		ListView loadGameList = (ListView) findViewById(R.id.listView8);
		Intent intent=getIntent();
		Bundle bundle = intent.getExtras();
		ID = bundle.getLong("id");
		newgameButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent intent=new Intent(ViewStory.this,Fragment.class);
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
