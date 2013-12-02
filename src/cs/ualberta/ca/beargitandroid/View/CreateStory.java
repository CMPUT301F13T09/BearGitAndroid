package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;
import java.util.HashMap;



import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.StoryController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;


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
		ListView ChapterList = (ListView) findViewById(R.id.listView5);
		Intent intent  = getIntent();
		Bundle bundle = intent.getExtras();


		long id = bundle.getLong("id");
        //set controller
		this.sct = new StoryController(this,id);


		Button addButton = (Button) findViewById(R.id.addchapter);
		Button saveButton = (Button) findViewById(R.id.save);
		TitleText = (EditText) findViewById(R.id.title6);
		AuthorText = (EditText) findViewById(R.id.author6);
		DescripText = (EditText) findViewById(R.id.descrip6);
		ListView Chapters = (ListView) findViewById(R.id.listView5);
		//click ADDCHAPTER button then go to the add_link.xml
		addButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override		
			public void onClick(View v)
			{
				Intent intent=new Intent(CreateStory.this,ChapterView.class);
				Chapter chapter = sct.newChapter();
				intent.putExtra("chapter", chapter);
				startActivity(intent);
			}
		});


        final SimpleAdapter radp = sct.showchapter();
        if (radp != null){
            Chapters.setAdapter(radp);

            Chapters.setOnItemClickListener(new OnItemClickListener(){
                public void onItemClick(AdapterView<?> parent,View arg1, int pos, long id){
                    //The place you add the code that get the story info from the database
                    HashMap <String, String> r = (HashMap<String, String>) radp.getItem(pos);
                    long local_id = Long.parseLong(r.get("id"));
                    Chapter next = sct.getChapter(local_id);
                    Intent intent=new Intent(CreateStory.this,ChapterView.class);
                    intent.putExtra("chapter", next);
                    startActivity(intent);
                }
            });
        }

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
				Intent intent = new Intent(CreateStory.this,homeScreenLocal.class);
				startActivity(intent);
			}
		});
		


		
	}
}

