package cs.ualberta.ca.beargitandroid.View;

import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.ChapterController;
import cs.ualberta.ca.beargitandroid.controller.StoryController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class ChapterView extends Activity {
	
	private ChapterController ce;
	private EditText TitleText;
	private EditText TextText;

	
	private String titletext;
	private String chaptertext;
    private Chapter chapter;
    private Story story;
    private long c_id;

	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.edit_chapter);

        this.story = (Story) getIntent().getSerializableExtra("Story");
        this.c_id = getIntent().getLongExtra("c_id", -1);


        this.ce = new ChapterController(this, this.story, c_id);


		Button deleteButton = (Button) findViewById(R.id.delete09);
		Button saveButton = (Button) findViewById(R.id.save2);
		Button linkButton = (Button) findViewById(R.id.button1);
		
		TitleText = (EditText) findViewById(R.id.editText1);
		TextText = (EditText) findViewById(R.id.editText2);
		
		ListView OptionList = (ListView) findViewById(R.id.listView9);
		

        //show option list

        final SimpleAdapter radp = ce.clickOption();

        if (radp != null){
            OptionList.setAdapter(radp);

            OptionList.setOnItemClickListener(new OnItemClickListener(){
                public void onItemClick(AdapterView<?> parent,View arg1, int pos, long id){
                    //The place you add the code that get the story info from the database
                    HashMap <String, String> r = (HashMap<String, String>) radp.getItem(pos);
                    //long opt_id =  Long.parseLong(r.get("nextid"));
                    long opt_id = (long) pos;
                    String context = r.get("context");

                    Intent intent = new Intent(ChapterView.this,AddLink.class);
                    intent.putExtra("Story", story);
                    intent.putExtra("c_id", c_id);
                    intent.putExtra("opt_id", opt_id);
                    intent.putExtra("context", context);
                    startActivity(intent);
                }
            });
        }

        saveButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				titletext = TitleText.getText().toString();
				chaptertext = TextText.getText().toString();
				ce.modifyChapter(titletext, chaptertext);
                finish();
	    	}
		
	    });
	
		deleteButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				ce.deleteChapter();
			    finish();
				
			}
			
		});
		
		
		linkButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(ChapterView.this,AddLink.class);
                intent.putExtra("Story", story);
                intent.putExtra("c_id", c_id);

				startActivity(intent);
				
			}
		});
		
		
		
    }
}
