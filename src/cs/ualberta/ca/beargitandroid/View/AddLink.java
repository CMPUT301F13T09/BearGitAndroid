package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;

import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.editOption;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddLink extends Activity {
	

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	private editOption edc;
	private EditText OptionText;
	private String OptContent;
	private Chapter chapter;
	private Story story;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_link);
		
		OptionText = (EditText) findViewById(R.id.neirong);
		
//		ListView Options = (ListView) findViewById(R.id.listView10);
		
		Button saveButton = (Button) findViewById(R.id.save2);
		//have not done yet.
		saveButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				OptContent = OptionText.getText().toString();
			   
				edc.modifyoption(OptContent,chapter.id);
				edc.save();
				Intent intent = new Intent(AddLink.this,ChapterView.class);
				startActivity(intent);
			}
		
	});
		
	}
}

