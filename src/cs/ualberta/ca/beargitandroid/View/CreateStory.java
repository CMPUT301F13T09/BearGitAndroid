package cs.ualberta.ca.beargitandroid.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


import android.app.AlertDialog;
import android.content.DialogInterface;
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

    private ListView Chapters;
    /** The text0. */
	private String text0;
	private String text1;
	private String text2;
	private long x;

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_story);
		//ListView ChapterList = (ListView) findViewById(R.id.listView5);
		Intent intent  = getIntent();
		Bundle bundle = intent.getExtras();


		long id = bundle.getLong("id" , 0);
        //set controller
		this.sct = new StoryController(this,id);


		Button addButton = (Button) findViewById(R.id.addchapter);
		Button saveButton = (Button) findViewById(R.id.save);
		TitleText = (EditText) findViewById(R.id.title6);
		AuthorText = (EditText) findViewById(R.id.author6);
		DescripText = (EditText) findViewById(R.id.descrip6);
		Chapters = (ListView) findViewById(R.id.listView5);

        if (id != 0){
            TitleText.setText((String) sct.getStory().get("title"));
            AuthorText.setText((String) sct.getStory().get("author"));
            DescripText.setText((String) sct.getStory().get("description"));
        }

        x = id;




		//click ADDCHAPTER button then go to the add_link.xml
		addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (save()){
                Intent intent = new Intent(CreateStory.this, ChapterView.class);
//                Bundle sbundle = new Bundle();
//                sbundle.putSerializable("Story", sct.Story());
//                sbundle.putLong("c_id", -1);
//                intent.putExtras(sbundle);
                intent.putExtra("c_id", -1);
                intent.putExtra("Story", sct.Story());
                startActivityForResult(intent, 0);
                //startActivity(intent);
                }
            }
        });


        final SimpleAdapter radp = sct.showallchapter();

        if (radp != null){
            radp.notifyDataSetChanged();
            Chapters.setAdapter(radp);
            //radp.notifyDataSetChanged();

        }

        Chapters.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View arg1, int pos, long id) {
                //The place you add the code that get the story info from the database

//                x = sct.CreateStory(text0, text1, text2);
                HashMap<String, String> r = (HashMap<String, String>) radp.getItem(pos);
                long local_id = Long.parseLong(r.get("id"));
                if (save()){
                Intent intent = new Intent(CreateStory.this, ChapterView.class);
                intent.putExtra("Story", sct.Story());
                intent.putExtra("c_id", local_id);

                startActivityForResult(intent, 0);
                //startActivity(intent);
                }
            }
        });


        //save
		saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //The place you add the code that save the story to the database
                //setResult(RESULT_OK);
                if(save()){
                    finish();
                }
            }
        });

		
	}


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0){
            this.sct = new StoryController(this, x);
            final SimpleAdapter radp = sct.showallchapter();

            Chapters.setAdapter(radp);

        }

    }

    public boolean save(){
        text0 = TitleText.getText().toString();
        text1 = AuthorText.getText().toString();
        text2 = DescripText.getText().toString();
        if (text0.equals("") || text1.equals("")) {
            new AlertDialog.Builder(CreateStory.this)
                    .setTitle("Warnning")
                    .setMessage("Tilte cannot be empty!")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).show();
            return false;
        } else {
            x = sct.CreateStory(text0, text1, text2);
            //Log.v("kk", x + "");
            //Intent intent = new Intent(CreateStory.this, homeScreenLocal.class);
            //startActivity(intent);
            return true;
        }
    }
//
//    public void onResume(){
//        super.onResume();
//        final SimpleAdapter radp = sct.showallchapter();
//        Chapters.setAdapter(radp);
//    }
}

