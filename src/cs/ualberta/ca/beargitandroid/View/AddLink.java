package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.*;
import cs.ualberta.ca.beargitandroid.Chapter;
import cs.ualberta.ca.beargitandroid.Story;
import cs.ualberta.ca.beargitandroid.controller.ChapterController;
import cs.ualberta.ca.beargitandroid.controller.editOption;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddLink extends Activity {
	

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
    private ChapterController ce;
    private long id;
	private EditText OptionText;
	private String OptContent;
	private Chapter chapter;
    private Story story;
    private long c_id;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_link);


        this.story = (Story) getIntent().getSerializableExtra("Stroy");
        this.c_id = getIntent().getLongExtra("c_id", -1);

        if (c_id == -1){
            finish();
        }

        this.id = getIntent().getLongExtra("opt_id", -1);
        String title = getIntent().getStringExtra("context");
        Log.v("c_id", c_id+"");
        this.ce = new ChapterController(this, story, c_id);

		OptionText = (EditText) findViewById(R.id.neirong);
		

		ListView OptionList = (ListView) findViewById(R.id.listView10);

        OptionText.setText(title);

        final SimpleAdapter radp = ce.chapterList();
        if (radp != null){
            OptionList.setAdapter(radp);

            OptionList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                public void onItemClick(AdapterView<?> parent,View arg1, int pos, long sid){
                    //The place you add the code that get the story info from the database
                    HashMap<String, String> r = (HashMap<String, String>) radp.getItem(pos);
                    //long opt_id =  Long.parseLong(r.get("nextid"));

                    if (OptionText.getText().toString().equals("")){
                         new AlertDialog.Builder(AddLink.this)
                            .setTitle("Warnning")
                            .setMessage("Tilte cannot be empty!")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            }).show();

                    }else{

                        long c_id = Long.parseLong(r.get("nextid"));

                        if (id == -1){
                            ce.addoption( OptionText.getText().toString(), c_id);
                        }else{
                            ce.modifyoption((long) pos, OptionText.getText().toString(), c_id);
                        }

                        finish();
                    }
                }
            });
        }
		
	}
}

