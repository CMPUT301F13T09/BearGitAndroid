package cs.ualberta.ca.beargitandroid.View;

import java.util.ArrayList;

import cs.ualberta.ca.beargitandroid.Story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Fragment extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story_fragment);
		Button nextButton = (Button) findViewById(R.id.next);
		nextButton.setOnClickListener(new View.OnClickListener()
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

	
		