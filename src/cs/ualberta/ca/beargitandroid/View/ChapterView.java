package cs.ualberta.ca.beargitandroid.View;

import java.util.HashMap;

import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.StoryController;
import cs.ualberta.ca.beargitandroid.controller.chapterEditer;
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
	
	private chapterEditer ce;
	private EditText TitleText;
	private EditText TextText;
	private Story story;

	
	private String titletext;
	private String chaptertext;

	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.edit_chapter);
		this.ce = new chapterEditer(this,story);
		
		Button deleteButton = (Button) findViewById(R.id.delete09);
		Button saveButton = (Button) findViewById(R.id.save2);
		Button linkButton = (Button) findViewById(R.id.button1);
		
		TitleText = (EditText) findViewById(R.id.editText1);
		TextText = (EditText) findViewById(R.id.editText2);
		
		ListView OptionList = (ListView) findViewById(R.id.listView9);
		
		
		saveButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				titletext = TitleText.getText().toString();
				chaptertext = TextText.getText().toString();
				ce.modifyContext(titletext, chaptertext);
				ce.save();
				Intent intent = new Intent(ChapterView.this,CreateStory.class);
				startActivity(intent);
			}
		
	});
	
		deleteButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				ce.delete();
				Intent intent = new Intent(ChapterView.this,CreateStory.class);
				
			}
			
		});
		
		
		linkButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(ChapterView.this,AddLink.class);
				startActivity(intent);
				
			}
		});
		
		final ArrayAdapter aa = ce.showoption();
		OptionList.setAdapter(aa);
		
		
}
}
